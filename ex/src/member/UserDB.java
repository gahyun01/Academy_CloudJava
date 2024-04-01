package member;
import java.sql.*;
public class UserDB {
	public User selectDB() {
		User user = null;
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ex?characterEncoding=utf8&useSSL=false", "root", "1234");
			
			if(conn == null) {
				throw new Exception("mydb 데이터베이스로 연결할 수 없습니다<br>");
			}
			
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT uid, uname, unum FROM USER;");
			
			while(rs.next()) {
				String uid = rs.getString("uid");
				String uname = rs.getString("uname");
				String unum = rs.getString("unum");
				
				user = new User();
				user.setUid(uid);
				user.setUname(uname);
				user.setUnum(unum);
			}
		}
		catch(Exception ex) {
		}
		finally {
			try {
				stmt.close();
				conn.close();
			}
			catch(Exception ex) {}
		}
		return user;
	}
}

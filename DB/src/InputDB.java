import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InputDB {
	public static void main(String[]args) {
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); // <- mysql에서 라이브러리 다운 후 사용 가능
			// database가 있는 주소, 관리자명, 비밀번호
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "wjdrkgus!2");
			stmt = con.createStatement();
			int row = stmt.executeUpdate("insert into tabletest values('곽재원', 25);");
			if (row == 0) {
				System.out.println("업데이트에 실패하였습니다.");
			}
			else {
				System.out.println("업데이트에 성공했습니다.");
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				stmt.close();
				con.close();
			}catch(Exception e) {
			}
		}
	}
}

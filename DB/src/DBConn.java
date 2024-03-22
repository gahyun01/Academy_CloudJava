import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	public static void main(String[]args) {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); // <- mysql에서 라이브러리 다운 후 사용 가능
			// database가 있는 주소, 관리자명, 비밀번호
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "wjdrkgus!2");
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				con.close();
			}catch(Exception e) {
			}
		}
	}
}

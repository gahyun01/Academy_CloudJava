import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PrintDB {
	public static void main(String[]args) {
		Connection con = null;
		Statement state = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); // <- mysql에서 라이브러리 다운 후 사용 가능
			// database가 있는 주소, 관리자명, 비밀번호
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "wjdrkgus!2");
			state = con.createStatement();
			ResultSet rset = state.executeQuery("select * from tabletest");
//			System.out.println(rset); // 주소값이 나옴
			System.out.println("이름\t나이");
			while(rset.next()) {
				System.out.print(rset.getString(1)+"\t"); // 첫번째 필드
				System.out.println(rset.getString(2)); // 두번째 필드
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				state.close();
				con.close();
			}catch(Exception e) {
			}
		}
	}
}

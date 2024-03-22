import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OneInformationPrint {
	Connection con = null;
	Statement stmt = null;
	
	public void onePrint(int pri) {
		try {
		  	  Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3307/gym?useSSL=false&allowPublicKeyRetrieval=true", "root", "wjdrkgus!2");
					stmt = con.createStatement();
					ResultSet rset = stmt.executeQuery("select *from member where 회원번호="+pri+";");
					while(rset.next()) {
		  			System.out.println("회원번호 : " + rset.getString(2));
		  		    System.out.println("이름 : " + rset.getString(1));
		  		    System.out.println("전화번호 : " + rset.getString(3));
		  		    System.out.println("PT쌤 이름 : " + rset.getString(4));
		  		    System.out.println("PT 횟수 : " + rset.getString(5));
		  		    System.out.println("생년월일 : " + rset.getString(6));
		  		    System.out.println("주소 : " + rset.getString(7));
		  		    System.out.println("키 : " + rset.getString(8));
		  		    System.out.println("몸무게 : " + rset.getString(9));
					}
		  	}catch(Exception e) {
		    	System.out.println(e);
		    } finally {
		    	try {
		    		stmt.close();
			    	con.close();
		    	}catch(Exception e) {
		    		System.out.println(e);
		    	}
		    }
	}
}

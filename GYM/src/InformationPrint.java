import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InformationPrint {
	Connection con = null;
	Statement stmt = null;
	public void infoPrint() {
		try {
    		Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/gym?useSSL=false&allowPublicKeyRetrieval=true", "root", "wjdrkgus!2");
			stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery("select *from member");
			System.out.println("이름\t회원번호\t     전화번호\tPT쌤\tPT횟수\t생년월일\t주소\t키\t몸무게\t");
			while(rset.next()) {
	        	  System.out.print(rset.getString(1)+"\t");
	        	  System.out.print(rset.getString(2)+"\t");
	        	  System.out.print(rset.getString(3)+"\t");
	        	  System.out.print(rset.getString(4)+"\t");
	        	  System.out.print(rset.getString(5)+"\t");
	        	  System.out.print(rset.getString(6)+"\t");
	        	  System.out.print(rset.getString(7)+"\t");
	        	  System.out.print(rset.getString(8)+"\t");
	        	  System.out.println(rset.getString(9));
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

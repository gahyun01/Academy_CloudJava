import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteInformation {
	Connection con = null;
	Statement stmt = null;
	
	public void deletInfo(int remove) {
		try {
      	  Class.forName("com.mysql.jdbc.Driver");
  			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/gym?useSSL=false&allowPublicKeyRetrieval=true", "root", "wjdrkgus!2");
  			stmt = con.createStatement();
  			int row = stmt.executeUpdate("delete from member where 회원번호="+remove+";");
  			if(row == 0) {
	            	System.out.println("회원정보 삭제에 실패했습니다.");
	            }
	            else {
	            	System.out.println("회원정보 삭제에 성공했습니다.");
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

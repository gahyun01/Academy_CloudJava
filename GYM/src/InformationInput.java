import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InformationInput {
	Member member = new Member();
	
	public void infoInput() {
		member.variableScan();
		
		Connection con = null;
		Statement stmt = null;
		
		try {
        	Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/gym?useSSL=false&allowPublicKeyRetrieval=true", "root", "wjdrkgus!2");
			stmt = con.createStatement();
			int row = stmt.executeUpdate("insert into member values('"+member.name+"', "+member.no+", '"+member.ph+"', '"+member.pt+"', "+member.num+", '"+member.birth+"', '"+member.addr+"', "+member.cm+", "+member.kg+");");
            if(row == 0) {
            	System.out.println("회원정보 업데이트에 실패하였습니다.");
            }
            else {
            	System.out.println("회원정보 업데이트에 성공했습니다.");
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

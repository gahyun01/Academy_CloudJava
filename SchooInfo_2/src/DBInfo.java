import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBInfo {
	Connection con = null;
	Statement stmt = null;
	
	// 학번 존재여부 확인
	public boolean infoComparison(int no) {
		int num = 0;
		try {
        	Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/schoolinfo", "root", "wjdrkgus!2");
			stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery("select *from member;");
			while(rset.next()) {
				if(rset.getInt(2) == no) {
					num = 1;
				}
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
		if(num != 0) {	// 해당 학번이 존재하는지 확인
			return true;
		}
		else return false;
	}
	
	// 아이디 가져오기
	public int getNewNo(int gubun) {
		int num = 0;
		int newNo = 0;
		
		try {
        	Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/schoolinfo", "root", "wjdrkgus!2");
			stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery("select no from member where gubun="+gubun+";");
			while(rset.next()) {
				if(rset.getInt("no") >= num) {
					num = rset.getInt("no");
				}
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
		newNo = num + 1;
		return newNo;
	}
	
	// 해당 번호에 기입된 점수 개수
	public int countData(int no) {
		int count = 0;
		
		try {
        	Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/schoolinfo", "root", "wjdrkgus!2");
			stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT COUNT(*) as cnt FROM score where no="+no+";");
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
		
		return count;
	}
	
	// 회원가입
	public void infoInput(int gubun, int no, String pwd, String name, String birth, int gender, String phone, String addr) {
		try {
        	Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/schoolinfo", "root", "wjdrkgus!2");
			stmt = con.createStatement();
			int row = stmt.executeUpdate("insert into member values('"+gubun+"', "+no+", '"+pwd+"', '"+name+"', "+birth+", '"+gender+"', '"+phone+"', '"+addr+"');");
			if(gubun == 2) {
				stmt.executeUpdate("insert into score values("+no+", NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);");
			}
			if(row == 0) {
            	System.out.println("회원가입에 실패하였습니다.");
            }
            else {
            	System.out.println("회원가입에 성공했습니다.");
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
	
	// 성적 기입
	public boolean scoreInput(int no, String g, String s, String kor, String eng, String math) {
			try {
	        	Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3307/schoolinfo", "root", "wjdrkgus!2");
				stmt = con.createStatement();
				stmt.executeUpdate("update score set kor"+g+s+" = "+kor+" where no="+no+";");
				stmt.executeUpdate("update score set eng"+g+s+" = "+math+" where no="+no+";");
				stmt.executeUpdate("update score set math"+g+s+" = "+math+" where no="+no+";");
				return true;
	        }catch(Exception e) {
		    	System.out.println(e);
		    	return false;
		    } finally {
		    	try {
		    		stmt.close();
			    	con.close();
		    	}catch(Exception e) {
		    		System.out.println(e);
		    	}
		}
	}
	// 전체학생 정보 가져오기
	public ArrayList<String> allInfo() {
		ArrayList<String> info = null;
		try {
        	Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/schoolinfo", "root", "wjdrkgus!2");
			stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery("select *from member where gubun=2;");
			while(rset.next()) {
				info.add(rset.getString("no"));
				info.add(rset.getString("name"));
				info.add(rset.getString("birth"));
				info.add(rset.getString("gender"));
				info.add(rset.getString("phone"));
				info.add(rset.getString("addr"));
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
		return info;
	}
	
	// 해당 학번 정보 가져오기
	public String myInfo(int no, int num) {
		int gubun = 0;	//	1. 교지원, 2. 학생
		String name = "";
		String addr = "";
		String pwd = ""; 	//	영문숫자 혼합해서 8자리
		String birth = "";	//	생일 1999-00-00, 
		int gender = 0;	//	성별 : 1- 남성, 2- 여성
		String phone = "";	//	010-0000-0000
		try {
        	Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/schoolinfo", "root", "wjdrkgus!2");
			stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery("select *from member where no="+no+";");
			while(rset.next()) {
				gubun = rset.getInt(1); // 구분
				pwd = rset.getString(3); // 비번
				name = rset.getString(4); // 이름
				birth = rset.getString(5); // 생년월일
				gender = rset.getInt(6); // 성별
				phone = rset.getString(7); // 연락처
				addr = rset.getString(8); // 주소
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
		
		if(num == 1) {
			return Integer.toString(gubun);
		}else if(num == 2) {
			return Integer.toString(no);
		}else if(num == 3) {
			return pwd;
		}else if(num == 4) {
			return name;
		}else if(num == 5) {
			return birth;
		}else if(num == 6) {
			return  Integer.toString(gender);
		}else if(num == 7) {
			return phone;
		}else {
			return addr;
		}
	}
	
	// 성적 가져오기
	public String[] myScore(int no, String s) {
		String[] sub = new  String[6];
		try {
        	Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/schoolinfo", "root", "wjdrkgus!2");
			stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery("select "+s+"11 from score where no="+no+";");
			
			while(rset.next()) {
				sub[0] = rset.getString(s+"11");
				sub[1] = rset.getString(s+"12");
				sub[2] = rset.getString(s+"21");
				sub[3] = rset.getString(s+"22");
				sub[4] = rset.getString(s+"31");
				sub[5] = rset.getString(s+"32");
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
		return sub;
	}
	
	// 정보 수정
	public void modifyInfo(String field, String modi, int no) {
		try {
			int row = 0;
        	Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/schoolinfo", "root", "wjdrkgus!2");
			stmt = con.createStatement();
			
			
			if(field == "성별") {
				row = stmt.executeUpdate("update member set "+field+" = "+Integer.parseInt(modi)+" where 아이디="+no+";");
			}else {
				row = stmt.executeUpdate("update member set "+field+" = "+modi+" where 아이디="+no+";");
			}
			
            if(row == 0) {
            	System.out.println("회원정보 수정에 실패하였습니다.");
            }
            else {
            	System.out.println("회원정보 수정에 성공했습니다.");
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
	
	public void deleteInfo(int no) {
		try {
        	Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/schoolinf", "root", "wjdrkgus!2");
			stmt = con.createStatement();
			stmt.executeUpdate("delete frome member where no="+no+");");
			stmt.executeUpdate("delete frome score where no="+no+");");
			
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

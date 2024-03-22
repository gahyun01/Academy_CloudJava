import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBInfo {
	Connection con = null;
	Statement stmt = null;
	
	// �й� ���翩�� Ȯ��
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
		if(num != 0) {	// �ش� �й��� �����ϴ��� Ȯ��
			return true;
		}
		else return false;
	}
	
	// ���̵� ��������
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
	
	// �ش� ��ȣ�� ���Ե� ���� ����
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
	
	// ȸ������
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
            	System.out.println("ȸ�����Կ� �����Ͽ����ϴ�.");
            }
            else {
            	System.out.println("ȸ�����Կ� �����߽��ϴ�.");
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
	
	// ���� ����
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
	// ��ü�л� ���� ��������
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
	
	// �ش� �й� ���� ��������
	public String myInfo(int no, int num) {
		int gubun = 0;	//	1. ������, 2. �л�
		String name = "";
		String addr = "";
		String pwd = ""; 	//	�������� ȥ���ؼ� 8�ڸ�
		String birth = "";	//	���� 1999-00-00, 
		int gender = 0;	//	���� : 1- ����, 2- ����
		String phone = "";	//	010-0000-0000
		try {
        	Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/schoolinfo", "root", "wjdrkgus!2");
			stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery("select *from member where no="+no+";");
			while(rset.next()) {
				gubun = rset.getInt(1); // ����
				pwd = rset.getString(3); // ���
				name = rset.getString(4); // �̸�
				birth = rset.getString(5); // �������
				gender = rset.getInt(6); // ����
				phone = rset.getString(7); // ����ó
				addr = rset.getString(8); // �ּ�
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
	
	// ���� ��������
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
	
	// ���� ����
	public void modifyInfo(String field, String modi, int no) {
		try {
			int row = 0;
        	Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/schoolinfo", "root", "wjdrkgus!2");
			stmt = con.createStatement();
			
			
			if(field == "����") {
				row = stmt.executeUpdate("update member set "+field+" = "+Integer.parseInt(modi)+" where ���̵�="+no+";");
			}else {
				row = stmt.executeUpdate("update member set "+field+" = "+modi+" where ���̵�="+no+";");
			}
			
            if(row == 0) {
            	System.out.println("ȸ������ ������ �����Ͽ����ϴ�.");
            }
            else {
            	System.out.println("ȸ������ ������ �����߽��ϴ�.");
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

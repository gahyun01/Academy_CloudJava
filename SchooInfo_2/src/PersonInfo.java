public class PersonInfo {
	DBInfo dbinfo = new DBInfo();
	
	int gubun;	//	1. ������, 2. �л�
	int no; 		//	����(90001), �й�(10001~)
	String name, addr;
	String pwd; 	//	�������� ȥ���ؼ� 8�ڸ�
	String birth;	//	���� 1999-00-00, 
	int gender;	//	���� : 1- ����, 2- ����
	String phone;	//	010-0000-0000
	
	String fName = null;
	
	public int insertPerson() {
		//	���ο� ����/�й� ����
		no = dbinfo.getNewNo(gubun);

		boolean yes = dbinfo.infoComparison(no);	// true : �����ϴ� ����, false : �������� �ʴ� ����
		if(yes) {
			System.out.println("�̹� �����ϴ� �й��Դϴ�.");
			return 0;
		}
		else {
			dbinfo.infoInput(gubun, no, pwd, name, birth, gender, phone, addr);
			return no;
		}	
	}
}



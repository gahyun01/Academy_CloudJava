public class PersonInfo {
	DBInfo dbinfo = new DBInfo();
	
	int gubun;	//	1. 교지원, 2. 학생
	int no; 		//	교번(90001), 학번(10001~)
	String name, addr;
	String pwd; 	//	영문숫자 혼합해서 8자리
	String birth;	//	생일 1999-00-00, 
	int gender;	//	성별 : 1- 남성, 2- 여성
	String phone;	//	010-0000-0000
	
	String fName = null;
	
	public int insertPerson() {
		//	새로운 교번/학번 얻어옴
		no = dbinfo.getNewNo(gubun);

		boolean yes = dbinfo.infoComparison(no);	// true : 존재하는 정보, false : 존재하지 않는 정보
		if(yes) {
			System.out.println("이미 존재하는 학번입니다.");
			return 0;
		}
		else {
			dbinfo.infoInput(gubun, no, pwd, name, birth, gender, phone, addr);
			return no;
		}	
	}
}



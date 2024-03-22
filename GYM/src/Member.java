import java.util.Scanner;

public class Member {
	String name, pt, addr, ph, birth;
	  int no, num, cm, kg;

	  public void variableScan() {
		  Scanner s = new Scanner(System.in);
		  
	    System.out.println("이름을 입력하세요 : ");
	    name = s.nextLine();
	    System.out.println("회원번호를 입력하세요 : ");
	    no = s.nextInt();
	    s.nextLine();
	    System.out.println("전화번호를 입력하세요 : ");
	    ph = s.nextLine();
	    System.out.println("PT쌤 이름을 입력하세요 : ");
	    pt = s.nextLine();
	    System.out.println("PT 횟수를 입력하세요 : ");
	    num = s.nextInt();
	    s.nextLine();
	    System.out.println("생년월일 6자리를 입력하세요 : ");
	    birth = s.nextLine();
	    System.out.println("주소를 입력하세요 : ");
	    addr = s.nextLine();
	    System.out.println("키를 입력하세요 : ");
	    cm = s.nextInt();
	    System.out.println("몸무게를 입력하세요 : ");
	    kg = s.nextInt();
	  }
}

import java.util.Scanner;

public class Main {
	public void mainInfo() {
		InformationInput informationInput = new InformationInput();
		InformationPrint informationPrint = new InformationPrint();
		OneInformationPrint oneInformationPrint = new OneInformationPrint();
		DeleteInformation deleteInformation = new DeleteInformation();
		
		int value = 0;
	    int remove = 0;
	    int pri = 0;
		
		System.out.println("<<< GreenGYM 회원 관리 프로그램 >>>");
	    while (value != 5) { // 5번을 누르면 종료
		      System.out.println("\n\n-----------------------------------");
		      System.out.println("실행할 메뉴를 선택하세요.\n");
		      System.out.println("1 : 회원 정보 입력, 2 : 모든 회원 정보 출력, 3 : 원하는 회원정보 출력, 4 : 원하는 회원 정보 삭제, 5 : 프로그램 종료 >>> ");
		      Scanner s = new Scanner(System.in);
		      value = s.nextInt();

		      switch (value) {
		        case 1: // 회원 정보 입력
		        	informationInput.infoInput();
		            break;
		            
		        case 2: // 모든 회원 정보 출력
		        	System.out.println("\n회원들의 정보를 출력합니다.\n");
		        	informationPrint.infoPrint();
		        	break;
		        case 3: // 원하는 회원 정보 출력
			          System.out.println("출력하고 싶은 회원의 회원번호를 입력해주세요 : ");
			          pri = s.nextInt();
			          oneInformationPrint.onePrint(pri);
			          break;
		        case 4: // 원하는 회원 정보 삭제
			          System.err.println("삭제하고싶은 회원의 회원번호를 입력해주세요 : ");
			          remove = s.nextInt();
			          deleteInformation.deletInfo(remove);
			          break;
		        case 5: // 프로그램 종료
			          System.out.println("GreenGYM 회원관리 프로그램을 종료합니다.");
			          break;
		        default: // 잘못 입력했을 경우
		          System.out.println("잘못 입력하셨습니다.");
		      }
	    }
	}
}

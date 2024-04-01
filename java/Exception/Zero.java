package Exception;

public class Zero {
  public static void main(String[] args) {
    int i = 100;
    /* int j = i / 0; -> Exception 오류 발생 : 0으로 나눌 수 없음 < 알아서 종료 > */
    System.out.println("\n");
    try {
      int j = i / 10;
    } catch (Exception e) { // 예외 인지 ! : 아무것도 안함 -> 예외수정X 그냥 종료
      System.out.println(e);
    } finally { // 예외의 발생 여부과 상관없이 무조건 실행
      System.out.println("예외 발생 여부와 상관없이 무조건 실행");
    }
  }
}

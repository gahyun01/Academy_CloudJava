package Exception;

public class NEx {
  public static void main(String[] args) {
    int i = (int) (Math.random() * 3) + 1;
    System.out.println("\n");
    System.out.println("난수 : " + i);

    if (i == 3) {
      try {
        throw new Exception();
      } catch (Exception e) {
        System.out.println("=> 발생");
      }
    } else {
      System.out.println("올바른 숫자입니다.");
    }
    System.out.println("*** end ***");
  }
}

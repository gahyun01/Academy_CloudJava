package Inheritance;

public class Boxing {
  public void boxingUpboxing() {
    int i = 10; // 기본 자료형
    Integer in = new Integer(i); // 객체 형태

    // String == 객체형태임 !

    Boolean b = new Boolean(false);
    int j = in.intValue();
    boolean bl = b.booleanValue();
  }

  public void autoBoxingunboxing() {
    Integer in = 10;
    Boolean bl = true;
    int i = in;
    boolean b = bl;
  }

  public void StringTo() {
    // String -> 일반 타입변경
    int n = Integer.parseInt("200");
  }

  public static void main(String[] args) {
  }
}

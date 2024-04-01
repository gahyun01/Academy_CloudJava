package Method;

public class UsingMethodExam {
  /*
   * Method 이름 : methodEx01
   * return type : 정수
   * 매개변수 : 정수 1개
   * 하는 일 : "methodEx01이 호출되었습니다." 정수값 리턴
   */
  public int methodEx01() {
    int a = 0;
    System.out.println("methodEx01이 호출되었습니다.");
    return a;
  }

  /*
   * Method 이름 : methodEx02
   * return type : String
   * 매개변수 : String 1개, 정수 1개
   * 하는 일 : "methodEx02이 호출되었습니다." String 리턴
   */
  public String methodEx02() {
    String c = " ";
    int b = 0;
    System.out.println("methodEx02가 호출되었습니다.");
    return c;
  }

  /*
   * Method 이름 : methodEx03
   * return type : 리턴안함
   * 매개변수 : 정수 1개와 String 1개
   * 하는 일 : "methodEx03이 호출되었습니다." 정수값 리턴
   */
  public void methidEx03() {
    int q = 0;
    String c2 = " ";
    System.out.println("methodEx03이 호출되었습니다.");
  }

  /*
   * Method 이름 : methodEx04
   * return type : 실수
   * 매개변수 : 첫번째 인수(정수), 두번째 인수(실수), 세번째 인수(정수)
   * 하는 일 : "methodEx04이 호출되었습니다." 정수값 리턴
   */
  public double methodEx04() {
    int a1 = 0;
    double b1 = 0.0;
    int a2 = 0;
    System.out.println("methodEx04가 호출되었습니다.");
    return b1;
  }

  public static void main(String[] args) {
    UsingMethodExam w = new UsingMethodExam();
    int a = w.methodEx01();
    String b = w.methodEx02();
    w.methidEx03();
    double c = w.methodEx04();
  }
}

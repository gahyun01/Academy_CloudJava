package Method;

public class Ex_1 {
  public void sub1() {
    System.out.println("--- no argument ---");
  }

  public void sub2(int a, int b) { // a, b값을 받아옴
    System.out.println("--- argument & no return ---");
  }

  public double sub3(int m, int n) { // m, n값을 받아옴
    System.out.println("--- argument & return ---");
    return 0.123;
  }

  public static void main(String[] args) {
    System.out.println("***** method result *****");
    Ex_1 e = new Ex_1();
    e.sub1(); // 메소드 sub1 호출
    e.sub2(10, 20); // 메소드 sub2 호출 & 매개변수 10, 20을 넘겨줌
    double w = e.sub3(50, 90); // return값을 w에 저장 & 메소드 sub3 호출 & 매개변수 50, 90을 넘겨줌
    System.out.println(w);
  }
}

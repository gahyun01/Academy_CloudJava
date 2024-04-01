package Method;

public class MethodExam {
  public int methodEx01(int a, int b) { // int 형 매개변수 2개 받아옴
    System.out.println("methodEx01이 호출되었습니다.");
    return a;
  }

  public String methodEx02(String c) { // String 형 매개변수 1개 받아옴
    System.out.println("methodEx02가 호출되었습니다.");
    return c;
  }

  public void methodEx03(int d, String e) { // int, String 형 매개변수 1개씩 받아옴
    System.out.println("methodEx03이 호출되었습니다.");
  }

  public double methodEx04(int f, double g) { // int, double 형 매개변수 1개씩 받아옴
    System.out.println("methodEx04가 호출되었습니다.");
    return g;
  }

  public static void main(String[] args) {
    MethodExam mme = new MethodExam();
    int k = mme.methodEx01(33, 22);
    String s = mme.methodEx02("java");
    mme.methodEx03(100, "green");
    double d = mme.methodEx04(7, 5.5);
  }
}

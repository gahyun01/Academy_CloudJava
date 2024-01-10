package Method;

public class MethodE {
  public int sum(int x, int y) { // int 2개 받음
    return (x + y); // int 반환
  }

  public int sum(int x, int y, int z) { // int 3개 받음
    return (x + y + z); // int 반환
  }

  double sum(double x, double y) { // double 2개 받음
    return (x + y); // double 반환
  }

  public static void main(String args[]) {
    MethodE mm = new MethodE();
    int x = mm.sum(10, 20); // int 타입 변수 2개
    int y = mm.sum(10, 20, 30); // int 타입 변수 3개
    double z = mm.sum(10.5, 20.5); // double 타입 변수 2개
  }
}

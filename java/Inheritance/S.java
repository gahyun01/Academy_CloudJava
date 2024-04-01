package Inheritance;

public class S {
  int k;
  static int x = 700; // static : 정적 요소

  static void printX() {
    System.out.println("x = " + x);
  }

  public static void main(String[] args) {
    S s1 = new S();
    S s2 = new S();

    s1.k = 500;
    s2.k = 600;

    System.out.println("s1.k = " + s1.k + ", s2.k = " + s2.k);
    System.out.println("static x = " + S.x); // static은 출력할 때 클래스 이름으로 접근하여 출력
  }
}

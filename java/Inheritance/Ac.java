package Inheritance;

import java.util.Scanner;

class A {
  int i;

  void m() {
    // System.out.println(d); // 자식 클래스에 있는 d를 부모가 사용할 수 없다.
  }
}

class B extends A {
  double d;

  void mm() {
    System.out.println(i);
  }
}

public class Ac {

  public static void main(String[] args) {
    System.out.println("Hello World\\n");
    Scanner s = new Scanner(System.in);
    A oo = new A();
  }
}
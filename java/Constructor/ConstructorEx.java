package Constructor;

class Add {
  Add() { // 매개변수가 없는 생성자
    System.out.println("생성자 Add()");
  }

  Add(int a, int b) { // 매개변수 int a, int b를 가지는 생성자
    System.out.println("생성자 Add(int a, int b)");
    System.out.println(a + " + " + b + " = " + (a + b));
  }

  Add(double a, double b) { // 매개변수 double a, double b를 가지는 생성자
    System.out.println("생성자 Add(double a, double b)");
    System.out.println(a + " + " + b + " = " + (a + b));
  }

  Add(int a, double b) { // 매개변수 int a, double b를 가지는 생성자
    System.out.println("생성자 Add(int a, double b)");
    System.out.println(a + " + " + b + " = " + (a + b));
  }
}

public class ConstructorEx {
  public static void main(String[] args) {
    Add numObj1 = new Add(1, 2); // 객체 생성 -> 생성자 호출 ( 매개변수 1, 2를 가지는 생성자 호출 )
    Add numObj2 = new Add(2.4, 6.2); // 객체 생성 -> 생성자 호출 ( 매개변수 2.4, 6.2를 가지는 생성자 호출 )
    Add numObj3 = new Add(3, 5.5); // 객체 생성 -> 생성자 호출 ( 매개변수 3, 5.5를 가지는 생성자 호출 )
  }
}

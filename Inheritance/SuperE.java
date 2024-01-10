package Inheritance;

class SuperEx {
  public SuperEx() {
    System.out.println(1);
  }

  public SuperEx(int i) {
    System.out.println(2);
  }

  public SuperEx(boolean b) {
    System.out.println(3);
  }
}

class SubEx extends SuperEx {
  public SubEx() {
    System.out.println(4);
  }

  public SubEx(int a) {
    System.out.println(5);
  }

  public SubEx(boolean b) {
    super(true); // ->SuperEx(true); // 부모 클래스의 생성자를 호출 ( 있으나 없으나 똑같음)
    System.out.println(6);
  }
}

public class SuperE {
  public static void main(String[] args) {
    // SuperEx sup = new SuperEx();
    // SubEx sub = new SubEx(); // 1 -> 4 출력
    // new SubEx("object"); // 3 -> 6 출력
  }
}

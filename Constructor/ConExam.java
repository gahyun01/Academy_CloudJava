package Constructor;

class PuppyEx {
  PuppyEx() {
    System.out.println("인자가 없는 생성자");
  }

  PuppyEx(String a) {
    System.out.println("String 타입의 인자 " + a + "를 가지고 있는 생성자");
  }

  PuppyEx(String b, String c) {
    System.out.println("String 타입의 인자 " + b + ", " + c + "를 가지고 있는 생성자");
  }

  PuppyEx(char e) {
    System.out.println("char 타입의 인자 " + e + "를 가지고 있는 생성자");
  }

  PuppyEx(boolean d) {
    System.out.println("boolean 타입의 인자 " + d + "를 가지고 있는 생성자");
  }

  void ex() {
  }
}

public class ConExam {
  public static void main(String[] args) {
    PuppyEx p1 = new PuppyEx();
    PuppyEx p2 = new PuppyEx("A");
    PuppyEx p3 = new PuppyEx("Java", "Hi");
    PuppyEx p4 = new PuppyEx('F');
    PuppyEx p5 = new PuppyEx(true);
  }
}

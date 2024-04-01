package Constructor;

class ExampleEx {
  int i;

  ExampleEx(String s) { // 생성자
    System.out.println("이것도 메소드");
  }

  String ex(int x) {
    System.out.println("메소드");
    return "결과";
  }
}

public class Example {
  public static void main(String[] args) {
    ExampleEx ob = new ExampleEx("aa"); // 객체를 생성할 때 생성자를 호출 -> 생성자에 인자가 있으면 인자를 넣어줘야 함
    ob.i = 100;
    ob.ex(56);
  }
}

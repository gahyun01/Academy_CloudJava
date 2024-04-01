package Method;

class Dog {
  String breed;
  String color;
  int age;
  String name;

  void bowwow() {
    System.out.println("멍멍 짖다");
    // run();
  }

  void run() {
    System.out.println("달리다");
  }

  void sleep() {
    System.out.println("잠을 자다");
    // bowwow();
  }
}

public class AccessMod {
  public static void main(String[] args) {
    Dog obj = new Dog(); // obj 객체 생성
    obj.breed = "포메라니언"; // obj 객체의 breed 대입
    obj.color = "갈색"; // obj 객체의 color 대입

    System.out.println("강아지 품종 : " + obj.breed);
    System.out.println("강아지 색상 : " + obj.color);
    obj.bowwow(); // bowwow 함수 호출
    obj.age = 10; // obj 객체의 age 대입
    System.out.println("강아지 나이 : " + obj.age);
    obj.run(); // run 함수 호출

    obj.name = "다운"; // obj 객체의 name 대입
    System.out.println("강아지 이름 : " + obj.name);
    obj.sleep(); // sleep 함수 호출
  }
}

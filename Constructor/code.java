package Constructor;

class Rabbit {
  String shape; // String형 변수 shape 선언
  int xPos; // int형 변수 xPos 선언
  int yPos; // int형 변수 yPos 선언

  void setPosition(int x, int y) { // setPosition 메소드 선언
    xPos = x; // xPos에 x 대입
    yPos = y; // yPos에 y 대입
  }
}

public class code {
  public static void main(String[] args) {
    Rabbit rabbit1 = new Rabbit(); // rabbit1 객체 생성
    Rabbit rabbit2 = new Rabbit(); // rabbit2 객체 생성
    Rabbit rabbit3 = new Rabbit(); // rabbit3 객체 생성

    rabbit1.shape = "원"; // rabbit1의 shape에 "원" 대입
    rabbit2.shape = "삼각형"; // rabbit2의 shape에 "삼각형" 대입
    rabbit3.shape = "사각형"; // rabbit3의 shape에 "사각형" 대입

    rabbit1.setPosition(100, 100); // rabbit1의 setPosition 메소드 호출
    rabbit2.setPosition(-100, 100); // rabbit2의 setPosition 메소드 호출
    rabbit3.setPosition(0, -100); // rabbit3의 setPosition 메소드 호출
  }
}

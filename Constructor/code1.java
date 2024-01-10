package Constructor;

class Rabbit1 {
  String shape;
  int xPos;
  int yPos;

  Rabbit1(String value) { // 매개변수 value를 가지는 생성자
    shape = value; // 매개변수 value를 shape에 대입
  }

  void setPosition(int x, int y) {
    xPos = x;
    yPos = y;
  }
}

public class code1 {
  public static void main(String[] args) {
    Rabbit1 rabbit1 = new Rabbit1("원"); // Rabbit1 객체 생성 -> 생성자 호출 ( 매개변수 value에 "원" 대입 )
    Rabbit1 rabbit2 = new Rabbit1("삼각형"); // Rabbit1 객체 생성 -> 생성자 호출 ( 매개변수 value에 "삼각형" 대입 )
    Rabbit1 rabbit3 = new Rabbit1("토끼"); // Rabbit1 객체 생성 -> 생성자 호출 ( 매개변수 value에 "토끼" 대입 )

    System.out.println("토끼1 객체의 모양은" + rabbit1.shape + "입니다.");
    System.out.println("토끼2 객체의 모양은" + rabbit2.shape + "입니다.");
    System.out.println("토끼3 객체의 모양은" + rabbit3.shape + "입니다.");
  }
}

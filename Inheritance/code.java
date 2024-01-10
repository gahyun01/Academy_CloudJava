package Inheritance;

class Rab {
  String shape;
  int xPos;
  int yPos;

  void move(int x, int y) {
    xPos = x;
    yPos = y;
  }
}

class HouseRab extends Rab { // Rab 클래스를 상속받음
  String owner;

  void eatFeed() {
    System.out.println("집토끼 사료");
  }
}

class MountainRab extends Rab { // Rab 클래스를 상속받음
  String mountain;

  void eatWildglass() {
    System.out.println("산토끼 풀");
  }
}

public class code {
  public static void main(String[] args) {
    HouseRab hRabbit = new HouseRab();
    MountainRab mRabbit = new MountainRab();
    Rab rab = new Rab();

    // rab.owner = ""; // 부모는 자식의 멤버 변수와 메소드를 사용할 수 없다.

    hRabbit.shape = "삼각형"; // Rab 클래스의 멤버 변수
    hRabbit.owner = "난생이";
    hRabbit.move(100, 100); // Rab 클래스의 멤버 메소드
    hRabbit.eatFeed();

    mRabbit.shape = "네모"; // Rab 클래스의 멤버 변수
    mRabbit.mountain = "설악산";
    mRabbit.move(200, 200); // Rab 클래스의 멤버 메소드
    mRabbit.eatWildglass();
  }
}

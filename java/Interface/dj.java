package Interface;

interface xx {
  public void mx();
}

class zz {
  public void mz() {
    System.out.println("클래스 메소드");
  }
}

class yy extends zz implements xx { // 다중상속 안됨
  // 오버라이드
  @Override // return & parameter & name 동일해야 함 _ 기능만 다름
  public void mx() {
    System.out.println("인터페이스 메소드");
  }
  // public void mx() { // interface의 메소드는 반드시 구현해야 함 !!
  // System.out.println("인터페이스 메소드");
  // }
}

public class dj {
  public static void main(String[] args) {
  }
}

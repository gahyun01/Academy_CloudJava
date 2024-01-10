package Constructor;

class ObjectOne {
  private int a;

  public ObjectOne() {
    System.out.println("con");
  }

  public void mm() {
    a = 123;
  }
}

public class Objectln {
  public static void main(String[] args) {
    ObjectOne obj1 = new ObjectOne();
    ObjectOne[] obj2 = new ObjectOne[3]; // 객체배열생성
    // obj2[0] = new ObjectOne(); // 객체 배열의 0번째에 객체 생성
    for (int i = 0; i < obj2.length; i++) {
      obj2[i] = new ObjectOne();
    }

    // obj1.a = 123;
  }
}

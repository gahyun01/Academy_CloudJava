package AbstractE;

abstract class ShapeEx {
  abstract void draw();
}

class PointEx extends ShapeEx {
  PointEx() {
  }

  void draw() {
    System.out.println('+');
  }
}

class RectangleEx extends ShapeEx {
  private int width;
  private int height;

  RectangleEx(int width, int height) {
    this.width = width;
    this.height = height;
  }

  void draw() {
    System.out.println("*");
  }
}

public class Ex {
  public static void main(String[] args) {
    ShapeEx[] a = new ShapeEx[2]; // 부모 클래스의 객체배열 생성 ( 자식 클래스의 객체도 담을 수 있음 )
    a[0] = new PointEx();
    a[1] = new RectangleEx(4, 3);

    for (ShapeEx s : a) { // a개수만큼 반복
      s.draw();
      System.out.println();
    }
  }
}

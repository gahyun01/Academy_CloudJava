package AbstractE;

abstract class ShapeE {
  String color;

  abstract double area();

  public abstract String toString();

  public ShapeE(String color) {
    System.out.println("ShapeE 생성자 호출");
    this.color = color;
  }

  public String getColor() {
    return color;
  }
}

class Circle extends ShapeE {
  double redius;

  public Circle(String color, double redius) {
    super(color);
    System.out.println("Circle 생성자 호출");
    this.redius = redius;
  }

  double area() {
    return redius * redius * 3.14;
  }

  public String toString() {
    return "원 색상은 " + super.getColor() + " 면적은 " + area();
  }
}

public class Shape {
  public static void main(String[] args) {
    ShapeE s1 = new Circle("빨간색", 2.2);
  }
}

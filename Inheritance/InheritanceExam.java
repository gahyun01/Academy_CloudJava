package Inheritance;

class Car {
  String carname;
  public int cost;

  void printAttributes() {
    System.out.println("carname : " + carname + "\t" + "cost : " + cost);
  }
}

class Benz extends Car { // Car 클래스를 상속받음
  public Benz() {
    carname = "Benz";
    cost = 10000;
  }
}

class Audi extends Car { // Car 클래스를 상속받음
  int a = 10;

  public Audi() {
    carname = "Audi";
    cost = 7000;
  }
}

class Bmw extends Car { // Car 클래스를 상속받음
  public Bmw() {
    carname = "Bmw";
    cost = 8000;
  }
}

public class InheritanceExam {
  public static void main(String[] args) {
    Car c = new Car();
    Benz benz = new Benz();
    Audi audi = new Audi();
    Bmw bmw = new Bmw();

    c.printAttributes();
    benz.printAttributes(); // 상속받은 메소드
    audi.printAttributes(); // 상속받은 메소드
    bmw.printAttributes(); // 상속받은 메소드
  }
}

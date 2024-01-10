package Test;

class Saram {
  String irum;
  int age;

  void title() {
    System.out.println("<< 자바의 객체 생성 >>");
    System.out.println("*** 정보 출력 ***");
    System.out.println("irum : " + irum + ", age : " + age);
    System.out.println("---------------------\n");
  }
}

public class Q3 {
  public static void main(String[] args) {
    Saram s1 = new Saram();
    Saram s2 = new Saram();
    Saram s3 = new Saram();

    s1.irum = "s1";
    s2.irum = "s2";
    s3.irum = "s3";

    s1.age = 1;
    s2.age = 2;
    s3.age = 3;

    s1.title();
    s2.title();
    s3.title();
  }
}

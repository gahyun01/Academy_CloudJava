package Test;

class Saram2 {
  String irum;
  int age;

  void title() {
    System.out.println("<< 자바의 객체 생성 >>");
    System.out.println("*** 정보 출력 ***");
    System.out.println("irum : " + irum + ", age : " + age);
    System.out.println("---------------------\n");
  }
}

public class Q4 {
  public static void main(String[] args) {
    Saram[] s = new Saram[3];
    for (int i = 0; i < s.length; i++) {
      s[i] = new Saram();
    }
    for (int i = 0; i < s.length; i++) {
      s[i].irum = "s" + (i + 1);
      s[i].age = i + 1;
    }
    for (int i = 0; i < s.length; i++) {
      s[i].title();
    }
  }
}

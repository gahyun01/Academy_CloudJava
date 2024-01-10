package Test;

class Overloading {
  public void disp(int i, String str) {
    System.out.println("정수와 문자열 출력 : " + i + " " + str);
  }

  public void disp(String str) {
    System.out.println("문자열 출력 : " + str);
  }

  public void disp(int i, String str, double ken) {
    System.out.println("정수와 문자열, 실수 출력 : " + i + " " + str + " " + ken);
  }
}

public class Q2 {
  public static void main(String[] args) {
    Overloading kkk = new Overloading();
    kkk.disp(50, "자바프로그래밍");
    kkk.disp(50, "자바프로그래밍", 50.0);
    kkk.disp("자바프로그래밍기초");
  }
}
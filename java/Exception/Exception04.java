package Exception;

import java.util.Scanner;

public class Exception04 {
  static void check(int num) throws NumberFormatException { // 예외를 던짐 ( 이 기능에 예외가 발생할 수 있음을 지금 현재 추적 & 관찰 )
    if (num < 0) {
      throw new NumberFormatException("0보다 작습니다.");
    } else {
      System.out.println(num);
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("숫자를 입력하세요.");
    int num = s.nextInt();

    try { // 예외가 발생될 것 같은 구역
      if (num < 0) {
        throw new NumberFormatException("0보다 작습니다.");
      } else {
        System.out.println(num);
      }
      check(num);
    } catch (NumberFormatException e) {
      System.out.println("예외 발생" + e);
    }
  }
}

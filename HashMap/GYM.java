package HashMap;

import java.util.HashMap;
import java.util.Scanner;

import Inheritance.S;

class Member {
  String name, pt, addr, ph, birth;
  int address, num;
  double cm, kg;
  double bmi;

  public void Member() {
    System.out.println("이름을 입력하세요 : ");
    Scanner s = new Scanner(System.in);
    name = s.nextLine();
    System.out.println("회원번호를 입력하세요 : ");
    address = s.nextInt();
    System.out.println("전화번호를 입력하세요 : ");
    ph = s.next();
    System.out.println("PT쌤 이름을 입력하세요 : ");
    pt = s.next();
    System.out.println("PT 횟수를 입력하세요 : ");
    num = s.nextInt();
    System.out.println("생년월일 6자리를 입력하세요 : ");
    birth = s.next();
    System.out.println("주소를 입력하세요 : ");
    addr = s.next();
    System.out.println("키를 입력하세요 : ");
    cm = s.nextDouble();
    System.out.println("몸무게를 입력하세요 : ");
    kg = s.nextDouble();

    bmi = kg / (cm / 100 * cm / 100);
  }

  public void variablePrint() {
    System.out.println("회원번호 : " + address);
    System.out.println("이름 : " + name);
    System.out.println("전화번호 : " + ph);
    System.out.println("PT쌤 이름 : " + pt);
    System.out.println("PT 횟수 : " + num);
    System.out.println("생년월일 : " + birth);
    System.out.println("주소 : " + addr);
    System.out.println("키 : " + cm);
    System.out.println("몸무게 : " + kg);
    System.out.println("BMI : " + bmi);
  }
}

class GYM extends HashMap<String, Member> {
  public static void main(String[] args) {
    HashMap<String, Member> has = new HashMap<String, Member>();
    System.out.println("<<< GreenGYM 회원 관리 프로그램 >>>\n");
    int value = 0;
    System.out.println("1 : 회원 정보 입력, 2 : 모든 회원 정보 출력, 3 : 원하는 회원정보 출력, 4 : 원하는 회원 정보 삭제, 5 : 프로그램 종료 >>> ");
    Scanner s = new Scanner(System.in);
    value = s.nextInt();
    while (value != 5) {
      switch (value) {
        case 1:
          new Member();
          break;
        case 2:
          System.out.println("모든 회원 정보를 출력합니다.");
          has.variablePrint();
          break;
        case 3:

        case 4:
          System.out.println("삭제할 회원의 이름을 입력하세요 : ");
          String name = s.next();
          remove(name);
          break;
        case 5:
          System.out.println("프로그램을 종료합니다.");
          break;
        default:
          System.out.println("잘못 입력하셨습니다.");
      }
    }
  }
}
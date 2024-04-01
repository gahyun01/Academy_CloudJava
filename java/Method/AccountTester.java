package Method;

class Account {
  String name;
  String no;
  long balance;
}

public class AccountTester {
  public static void main(String[] args) {
    Account chulsoo = new Account(); // 객체 생성
    Account younghee = new Account(); // 객체 생성

    chulsoo.name = "철수";
    chulsoo.no = "123456";
    chulsoo.balance = 1000;

    younghee.name = "영희";
    younghee.no = "654321";
    younghee.balance = 200;

    chulsoo.balance -= 200;
    younghee.balance -= 200;
    younghee.balance += 100;

    System.out.println("■ 철수의 계좌");
    System.out.println("  계좌 명의 : " + chulsoo.name);
    System.out.println("  계좌 변호 : " + chulsoo.no);
    System.out.println("  예금 잔고 : " + chulsoo.balance);
    System.out.println("\n");

    System.out.println("■ 철수의 계좌");
    System.out.println("  계좌 명의 : " + younghee.name);
    System.out.println("  계좌 변호 : " + younghee.no);
    System.out.println("  예금 잔고 : " + younghee.balance);
  }
}

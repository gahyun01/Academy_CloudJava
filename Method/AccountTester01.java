package Method;

class Account01 {
  String name;
  String no;
  long balance;

  void accPrint() {
    System.out.println("■ " + name + "의 계좌");
    System.out.println("  계좌 명의 : " + name);
    System.out.println("  계좌 변호 : " + no);
    System.out.println("  예금 잔고 : " + balance);
    System.out.println("\n");
  }

  void accChange(long balance) {
    this.balance = balance;
  }
}

public class AccountTester01 {
  public static void main(String[] args) {
    Account01 chulsoo = new Account01(); // 객체 생성
    Account01 younghee = new Account01(); // 객체 생성

    chulsoo.name = "철수";
    chulsoo.no = "123456";
    chulsoo.balance = 1000;

    younghee.name = "영희";
    younghee.no = "654321";
    younghee.balance = 200;

    chulsoo.balance -= 200;
    younghee.balance -= 200;
    younghee.balance += 100;

    chulsoo.accPrint();
    younghee.accPrint();
  }
}

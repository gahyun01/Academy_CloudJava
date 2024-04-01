package Method;

class List {
  String AccountName;
  String AccountNo;
  long AccounBalance;
}

public class Accounts {
  public static void main(String[] args) {
    String chulAccountName = "철수";
    String chulAccountNo = "123456";
    long chulAccountBalance = 1000;

    String youngAccountName = "영희";
    String youngAccountNo = "654321";
    long youngAccountBalance = 200;

    chulAccountBalance -= 200;
    youngAccountBalance += 100;

    System.out.println("■ 철수의 계좌");
    System.out.println("  계좌 명의 : " + chulAccountName);
    System.out.println("  계좌 변호 : " + chulAccountNo);
    System.out.println("  예금 잔고 : " + chulAccountBalance);
    System.out.println("\n");

    System.out.println("■ 철수의 계좌");
    System.out.println("  계좌 명의 : " + youngAccountName);
    System.out.println("  계좌 변호 : " + youngAccountNo);
    System.out.println("  예금 잔고 : " + youngAccountBalance);
  }
}

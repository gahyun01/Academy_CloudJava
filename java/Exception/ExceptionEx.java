package Exception;

class InvalidException extends Exception {
  public InvalidException(String s) {
    super(s);
  }
}

public class ExceptionEx {
  void check(int weight) throws InvalidException {
    if (weight < 100) {
      throw new InvalidException("InvalidException 클래스 ");
    }
  }

  public static void main(String[] args) {
    System.out.println("\n");
    ExceptionEx obj = new ExceptionEx();
    try {
      obj.check(60);
    } catch (InvalidException ex) {
      System.out.println("예외 처리입니다.");
      System.out.println(ex);
    }
  }
}

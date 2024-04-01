package Method;

public class OverMethod {
  public void setOverload(int a) {
    System.out.println("setOverload1");
  }

  public String setOverload() {
    System.out.println("setOverload2");
    return "sdds";
  }

  public void setOverload(boolean b) {
    System.out.println("setOverload3");
  }

  public void setOverload(String c, String d) {
    System.out.println("setOverload4");
  }

  public void getOverload() {
    System.out.println("getOverload1");
  }

  public char getOverload(String e) {
    System.out.println("getOverload2");
    return 'd';
  }

  public void getOverload(String f, String g) {
    System.out.println("getOverload3");
  }

  public void getOverload(double h) {
    System.out.println("getOverload4");
  }

  public static void main(String args[]) {
    OverMethod om = new OverMethod();
    om.setOverload(5);
    String re = om.setOverload();
    om.setOverload(false);
    om.setOverload("A", "Java");
    om.getOverload();
    char ch = om.getOverload("hello");
    om.getOverload("aa", "BB");
    om.getOverload(5.2);
  }
}

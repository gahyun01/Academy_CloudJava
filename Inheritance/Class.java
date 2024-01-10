package Inheritance;

class SuperClassExam {
  int intNum;
  String memStr = "String in SuperClass";

  SuperClassExam() {
    System.out.println("생성자 SuperClassExam() 호출");
  }

  public void methodZero() {
    System.out.println("SuperClassExam methodZero() 호출");
    System.out.println("intNum = " + intNum + "\tmemStr = " + memStr);
  }

  int methodTwo(int i) {
    intNum = i;
    System.out.println("SuperClassExam methodTwo(int i)메소드 호출");
    System.out.println("intNum = " + intNum + "\tmemStr = " + memStr);
    return intNum;
  }

  protected String methodThree(int i) {
    intNum = i;
    System.out.println("SuperClassExam methodThree(int i)메소드 호출");
    System.out.println("intNum = " + intNum + "\tmemStr = " + memStr);
    return i + memStr;
  }
}

class SubclassExam extends SuperClassExam {
  SubclassExam() {
    memStr = "SubClass의 생성자가 입력한 String";
    System.out.println("생성자 SubClass() 호출");
  }

  public void methodZero() { // 오버라이딩
    System.out.println("SubClassExam methodZero() 호출");
    System.out.println("intNum = " + intNum + "\tmemStr = " + memStr);
  }

  public void methodOne() {
    System.out.println("SubClassExam methodOne() 호출");
    System.out.println("intNum = " + intNum + "\tmemStr = " + memStr);
  }

  String methodThress(String s, int k) { // 오버로딩
    intNum = k;
    memStr = s;
    System.out.println("SubClassExam methodTwo() 호출");
    System.out.println("intNum = " + intNum + "\tmemStr = " + memStr);
    return memStr;
  }

  protected String methodThress(int k, String str) { // 오버로딩
    intNum = k;
    memStr = str;
    System.out.println("SubClassExam methodThree() 호출");
    System.out.println("intNum = " + intNum + "\tmemStr = " + memStr);
    return memStr;
  }
}

public class Class {
  public static void main(String[] args) {
    SuperClassExam sp = new SuperClassExam();

    SubclassExam sb = new SubclassExam();
    sb.methodOne(); // sp는 안됨 ( 자식꺼 못씀 )
    int xxx = sb.methodTwo(456);
    sb.methodZero();
  }
}

package Inheritance;

class VarargsExam {
  public void aa(int i) {
    System.out.println("aa 호출됨");
  }

  public void bb(int... i) { // ... == 가변인자 ( 매개변수의 개수를 유동적으로 받을 수 있음 )
    // System.out.println(i); // error : 여러개의 매개변수 중 어떤 것을 출력해야 할지 모름
    System.out.println("\n=== bb호출");
    for (int a : i) { // 무조건 배열로 받음 && i가 가지고 있는 횟수만큼 반복
      System.out.println(a + "\t");
    }
    System.out.println();
  }

  public void cc(String... s) {
    System.out.println("\n=== cc호출");
    for (String str : s) {
      System.out.println(str + "\t");
    }
  }

  public void dd(Object... obj) { // object == 최상위 클래스이므로 모든 자료형을 받을 수 있음 !!
    System.out.println("\n=== dd호출");
  }

  public void ee(int i, String... s) {
    System.out.println("\n=== ee호출");
  }
}

public class Varargs {
  public static void main(String[] args) {
    VarargsExam ve = new VarargsExam();
    ve.aa(3);

    // 가변인자를 사용하면 매개변수의 갯수를 유동적으로 받을 수 있음
    ve.bb();
    ve.bb(1, 2);
    ve.bb(3, 4, 5);

    ve.cc("String");
    ve.cc("String1", "String2");

    ve.dd();
    ve.dd(3, 2, "hello", "haha");
    ve.dd(2.5, 'a', "hoho", 7);

    ve.ee(2);
    ve.ee(3, "a", "b", "c");
  }
}

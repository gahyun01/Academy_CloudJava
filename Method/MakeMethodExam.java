package Method;

public class MakeMethodExam {
  int methodExam01(int a) { // int a 받음
    System.out.println("인수의 값 = " + a);
    return a * 2; // int 타입 반환
  }

  void methodExam02() {
    System.out.println("java");
  }

  void methodExam03(int a) { // int a 받음
    System.out.println("인수의 값 = " + a);
    if (a % 2 == 0) { // i가 2로 나눠서 나머지가 0이라면
      System.out.println("짝수"); // "짝수" 출력
    } else {
      System.out.println("홀수"); // "홀수" 출력
    }
  }

  String methodExam04(int i) { // int i 받음
    System.out.println("들어온 정수의 값 = " + i);
    if (i % 2 == 0) { // i가 2로 나눠서 나머지가 0이라면
      return "짝수"; // "짝수" 반환
    } else {
      return "홀수"; // "홀수" 반환
    }
  }

  public static void main(String[] args) {
    MakeMethodExam mme = new MakeMethodExam();
    int k = mme.methodExam01(33); // a값 줌 & int k 반환
    mme.methodExam02();
    mme.methodExam03(42); // a값 줌
    String s = mme.methodExam04(17); // i값 줌 & String s 반환
  }
}
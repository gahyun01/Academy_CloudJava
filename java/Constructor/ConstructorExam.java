package Constructor;

class Puppy {
  String str;
  int i;

  Puppy() {
    System.out.println("생성자 호출");
    printPuppyName(); // str과 i의 default 값 출력 -> str = null, i = 0
    str = "메리"; // str default 값 "메리" 대입
    i = -98998; // i default 값 -98998 대입
  }

  void printPuppyName() {
    System.out.println("printPuppyName() 호출");
    System.out.println("변수 str = " + str + ", i = " + i);
  }
}

public class ConstructorExam {
  public static void main(String[] args) {
    Puppy p = new Puppy(); // 객체 생성 -> 생성자 호출
    p.printPuppyName(); // printPuppyName 메소드 호출
  }
}

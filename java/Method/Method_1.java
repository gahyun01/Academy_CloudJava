package Method;

/* 다른 메소드 호출 방법 */
public class Method_1 {
  public void Method1() {
    System.out.println("Method 1");
  }

  public void Method2(int i) { // i <- su를 받는 매개변수 ( 타입이 같고, 개수가 같아야함 )
    System.out.println(i);
    System.out.println("Method 2");
    // System.out.println(su); <- 오류발생 ( main의 지역변수라 사용 불가능함 )
  }

  public int Method3() { // 반환타입 적어줘야함
    System.out.println("Method 3");
    int num;
    num = 123;
    System.out.println(num);
    return num; // num을 반환, return은 하나만 가능
  }

  public static void main(String[] args) {
    System.out.println("manin 메소드");

    // 메소드 호출 !!
    Method_1 c = new Method_1();
    c.Method1();
    int num = c.Method3(); // 반환값을 num에 저장
    System.out.println(num);

    int su = 123; // 지역변수
    System.out.println(su);
    c.Method2(su); // 메소드 호출시 변수 su를 매개변수로 넘겨줌 ( 받을 준비가 안되어있음 )
  }
}

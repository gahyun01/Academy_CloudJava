package Method;

import java.util.Scanner;

public class GenldxArray {
  public int[] idxArray(int n) { // n을 받음 ( 배열 리턴 )
    int[] a = new int[n]; // 배열 생성
    for (int i = 0; i < n; i++) {
      a[i] = i;
    }
    return a; // 배열 리턴
  }

  public static void main(String[] args) {
    Scanner stdln = new Scanner(System.in);
    GenldxArray ob = new GenldxArray();

    System.out.print("요소 수: ");
    int n = stdln.nextInt();
    int[] x = ob.idxArray(n); // 메소드 호출 ( 위의 n을 줌 )

    for (int i = 0; i < n; i++) {
      System.out.println("x[]" + i + " = " + x[i]);
    }
  }
}

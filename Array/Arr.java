package Array;

/*
	1. 정수형의 사이즈가 10인 배열 생성
	2. 배열의 값을 할당 <- 입력 (Scanner)
	3. 배열의 값, 합계, 평균 출력
*/
import java.util.Scanner;
import java.util.Arrays;

public class Arr {
  public static void main(String[] args) {
    int[] Ary = new int[10];
    int sum = 0;

    for (int i = 0; i < 10; i++) {
      Scanner s = new Scanner(System.in);
      Ary[i] = s.nextInt();
      sum += Ary[i];
    }
    System.out.println("배열 : " + Arrays.toString(Ary));
    System.out.println("합계 : " + sum);
    System.out.println("평균 : " + (sum / 10.0));
  }
}

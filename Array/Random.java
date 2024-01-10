package Array;

import java.util.Arrays;

public class Random {
  public static void main(String[] args) {
    int[] Ary = new int[5];

    for (int i = 0; i < 5; i++) {
      Ary[i] = (int) (Math.random() * 10);
    }
    System.out.println("배열 : " + Arrays.toString(Ary));
  }
}

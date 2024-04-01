package List;

/*
  1. 6개의 공간의 ArrayList 생성
  2. 1~45사이의 난수(random) 발생하여 ArrayList 저장
    - 단 !!!! 발생한 난수가 ArrayList 중복될 수 없음
  3. 중복되지 않은 6개의 숫자를 저장한 ArrayList 출력 ( 출력결과는 오름차순으로...)
 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayEx {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(6);

    while (list.size() < 6) {
      int a = (int) (Math.random() * 46);
      if (!list.contains(a)) {
        list.add(a);
      }
    }
    Collections.sort(list);
    System.out.println("list : " + list);
  }
}
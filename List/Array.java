package List;

import java.util.ArrayList;
import java.util.Collections;

public class Array {
  public static void main(String[] args) {
    ArrayList list1 = new ArrayList(9);
    list1.add(new Integer(5)); // list1에 add로 Integer타입의 5를 추가
    list1.add(new Integer(4)); // list1에 add로 Integer타입의 4를 추가
    list1.add(new Integer(2)); // list1에 add로 Integer타입의 2를 추가
    list1.add(new Integer(0)); // list1에 add로 Integer타입의 0를 추가
    list1.add(new Integer(1)); // list1에 add로 Integer타입의 1를 추가
    list1.add(new Integer(3)); // list1에 add로 Integer타입의 3를 추가
    // list1.add("test");

    ArrayList list2 = new ArrayList(list1.subList(1, 4)); // list2에 list1의 1번째 인덱스부터 4번째 인덱스 전까지의 요소를 추가
    // 즉 list1에서 1~3번째 인덱스의 요소를 list2에 추가
    print(list1, list2);

    Collections.sort(list1); // list1을 오름차순 정렬
    Collections.sort(list2); // list2를 오름차순 정렬
    print(list1, list2);

    System.out.println("list1.ContainsAll(list2)" + list1.containsAll(list2)); // containsAll : boolean타입으로 list1이
                                                                               // list2의 모든!! 요소를 포함하고 있으면 true,
                                                                               // 아니면 false를 반환 -> true

    list2.add("B"); // list2에 "B"를 추가
    list2.add("C"); // list2에 "C"를 추가
    list2.add(3, "A"); // list2의 3번째 인덱스에 "A"를 추가 ( 기존의 3번째 인덱스의 요소는 뒤로 밀림 )
    print(list1, list2);

    list2.set(3, "AA"); // 값 바꿈_set : list2의 3번째 인덱스의 요소를 "AA"로 변경 ( 기존의 3번째 인덱스의 요소는 사라짐 )
    print(list1, list2);

    System.out.println("list1.retainAll(list2)" + list1.retainAll(list2)); // retainAll : boolean타입으로 list1이 list2와 공통된
                                                                           // 교집합 요소 외의 다른 요소들은 제거한 후 list1이 변경되었으면
                                                                           // true, 아니면 false를 반환 -> true
    print(list1, list2);

    for (int i = list2.size() - 1; i >= 0; i--) {
      // list1의 i번째 인덱스의 요소가 list2의 i번째 인덱스의 요소를 포함하고 있으면
      if (list1.contains(list2.get(i))) // contain : boolean타입으로 list1이 list2의 요소를 포함하고 있으면 true, 아니면 false를 반환
        list2.remove(i); // list2의 i번째 인덱스의 요소를 제거
    }
    print(list1, list2);
  }

  static void print(ArrayList list1, ArrayList list2) {
    System.out.println("list1 : " + list1);
    System.out.println("list2 : " + list2);
    System.out.println();
  }
}

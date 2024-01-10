package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapExam extends HashMap<String, Integer> {
  public HashMapExam() { // 생성자
    // Super(); -> HashMap의 생성자 호출 ( 부모 생성자 호출 )
    put("a", 10); // Super.put("a", 10); -> 부모의 put 메소드 호출
    put("b", 20);
    put("c", 30);

    System.out.println("size : " + size());

    Set<String> s = keySet(); // keySet() : HashMap의 key값을 Set으로 반환
    for (String str : s) {
      int i = get(str);
      System.out.printf("key = %s => value = %d\n", str, i);
    }
  }

  public static void main(String[] args) {
    new HashMapExam();
  }
}
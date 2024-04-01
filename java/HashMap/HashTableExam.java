package HashMap;

import java.util.Hashtable;
import java.util.Enumeration;

class UserInfo {
  private String name;
  private int age;
  private String addr;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }
}

public class HashTableExam { // 지금 안씀
  Hashtable<String, UserInfo> table = new Hashtable<String, UserInfo>(); // Use

  public HashTableExam() {
    UserInfo u = new UserInfo();
    u.setName("나");
    u.setAge(20);
    u.setAddr("강남구");

    UserInfo u2 = new UserInfo();
    u2.setName("가");
    u2.setAge(25);
    u2.setAddr("역삼동");

    UserInfo u3 = new UserInfo();
    u3.setName("다");
    u3.setAge(42);
    u3.setAddr("청담동");

    table.put("na", u);
    table.put("ga", u2);
    table.put("da", u3);

    Enumeration<String> e = table.keys();
    while (e.hasMoreElements()) {
      String key = e.nextElement();
      UserInfo value = table.get(key);
      System.out.println(key + " = " + value);
      System.out.printf("%s, %d, %s\n", value.getName(), value.getAge(), value.getAddr());
    }
  }

  public static void main(String[] args) {
    new HashTableExam();
  }
}

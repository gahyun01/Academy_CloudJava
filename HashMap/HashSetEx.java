package HashMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetEx {
  HashSet<String> hash = new HashSet<String>();

  public void addset() {
    hash.add("java");
    hash.add("hello");
    hash.add("hoho");
    hash.add("huhu");
    hash.add("Green");
    hash.add("web");
  }

  public void printset() {
    Iterator<String> it = hash.iterator();
    while (it.hasNext()) {
      String name = it.next();
      System.out.println(name + "\t");
    }
    System.out.println("\n====================");
    TreeSet<String> tree = new TreeSet<String>(hash);
    Iterator<String> it2 = tree.iterator();
    while (it2.hasNext()) {
      String name = it2.next();
      System.out.println(name + "\t");
    }
  }

  public static void main(String[] args) {
    HashSetEx ha = new HashSetEx();
    ha.addset();
    ha.printset();
  }
}

package Test;

import java.util.Arrays;

class Student {
  String name;
  int num, java, html, jsp;
  double av;

  void avg() {
    int sum = java + html + jsp;
    this.av = sum / 3.0;
  }
}

public class Q5 {
  public static void main(String[] args) {
    Student[] s = new Student[5];
    for (int i = 0; i < s.length; i++) {
      s[i] = new Student();
      s[i].name = "s" + (i + 1);
      s[i].java = (int) (Math.random() * 100);
      s[i].html = (int) (Math.random() * 100);
      s[i].jsp = (int) (Math.random() * 100);
      s[i].avg();
    }

    double[] av = { s[0].av, s[1].av, s[2].av, s[3].av, s[4].av };
    Arrays.sort(av);

    for (int i = 0; i < s.length; i++) {
      for (int k = 0; k < s.length; k++) {
        if (s[k].av == av[i]) {
          System.out.println(i + 1 + "등 : " + s[k].name + ", java : " + s[k].java + ", html : " + s[k].html + ", jsp : "
              + s[k].jsp + ", 평균 : " + s[k].av + "\n");
        }
      }
    }
  }
}

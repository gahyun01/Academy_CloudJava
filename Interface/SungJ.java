package Interface;

interface Sung_1 {
  void sethakbun(String hakbun);

  void setname(String name);
}

interface Sung_2 {
  void setjumsu(int jumsu);
}

// interface 끼리도 extends 가능 !
interface Sung extends Sung_1, Sung_2 { // 인터페이스끼리는 다중상속 가능 !! ( 그냥 여러개를 가져온다고 생각하면 됨 )
  void prt_data();
}

class Sungjuk implements Sung {
  String hakbun = " ";
  String name = " ";
  int jumsu = 0;

  public void sethakbun(String hakbun) {
    this.hakbun = hakbun;
  }

  public void setname(String name) {
    this.name = name;
  }

  public void setjumsu(int jumsu) {
    this.jumsu = jumsu;
  }

  public void prt_data() {
    System.out.println(hakbun + " " + name + " " + jumsu);
  }
}

public class SungJ extends Sungjuk {
  public static void main(String[] args) {
    Sungjuk ken = new Sungjuk();
    ken.sethakbun("2060001");
    ken.setname("Nam");
    ken.setjumsu(60);
  }
}

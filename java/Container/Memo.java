package Container;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Memo {
  public static void main(String[] args) {
    Frame container = new Frame();
    Button btn1 = new Button("파일");
    Button btn2 = new Button("편집");
    Button btn3 = new Button("서식");
    Button btn4 = new Button("보기");
    Button btn5 = new Button("도움말");
    FlowLayout layout = new FlowLayout();

    container.setLayout(layout);
    container.add(btn1);
    container.add(btn2);
    container.add(btn3);
    container.add(btn4);
    container.add(btn5);
    container.setVisible(true);
    container.setSize(600, 400);
  }
}

package Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class GridExam extends JFrame {
  JButton btn1 = new JButton("1");
  JButton btn2 = new JButton("2");
  JButton btn3 = new JButton("3");
  JButton btn4 = new JButton("4");
  JButton btn5 = new JButton("5");
  JButton btn6 = new JButton("6");
  JButton btn7 = new JButton("7");
  JButton btn8 = new JButton("8");
  JButton btn9 = new JButton("9");
  JButton btn10 = new JButton("10");

  public GridExam() {
    setLayout(new GridLayout(2, 0)); // 줄 수

    add(btn1);
    add(btn2);
    add(btn3);
    add(btn4);
    add(btn5);
    add(btn6);
    add(btn7);
    add(btn8);
    add(btn9);
    add(btn10);

    setSize(500, 400);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new GridExam();
  }
}

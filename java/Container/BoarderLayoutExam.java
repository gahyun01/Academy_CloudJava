package Container;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoarderLayoutExam extends JFrame {
  JButton btn1 = new JButton("1");
  JButton btn2 = new JButton("2");
  JButton btn3 = new JButton("3");
  JButton btn4 = new JButton("4");
  JButton btn5 = new JButton("5");

  public BoarderLayoutExam() {
    setLayout(new BorderLayout(10, 30));

    add(btn1, BorderLayout.NORTH); // 문자로 줘도됨
    add(btn2, BorderLayout.WEST); // 문자로 줘도됨
    add(btn3, "Center");
    add(btn4, "South");
    add(btn5, "East");

    setSize(500, 400);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new BoarderLayoutExam();
  }
}

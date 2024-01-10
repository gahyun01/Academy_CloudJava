package Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.TextField;
import java.awt.Font;

public class Calculator1 extends JFrame {
  TextField text = new TextField();
  Button[] btn = new Button[15];
  JPanel p = new JPanel();
  JPanel p2 = new JPanel();
  Color c1 = new Color(214, 255, 228);
  Color c2 = new Color(249, 254, 180);
  Color c3 = new Color(202, 254, 159);
  Font f1 = new Font("Arial", Font.BOLD, 20);
  int k = 0;

  public Calculator1() {
    for (int i = 0; i < 15; i++) {
      if (i < 5) {
        if (i == 0) {
          btn[i] = new Button("+");
        } else if (i == 1) {
          btn[i] = new Button("-");
        } else if (i == 2) {
          btn[i] = new Button("*");
        } else if (i == 3) {
          btn[i] = new Button("/");
        } else if (i == 4) {
          btn[i] = new Button("=");
        }
        btn[i].setBackground(c1);
        btn[i].setForeground(Color.RED);
        btn[i].setFont(f1);
      } else {
        btn[i + 5] = new Button(String.valueOf(k));

        if (5 <= i && i < 10) {
          btn[i + 5].setBackground(c2);
          btn[i + 5].setFont(f1);
        } else {
          btn[i + 5].setBackground(c3);
          btn[i + 5].setFont(f1);
        }
        k++;
      }
    }

    p.setLayout(new BorderLayout());
    p.add(text);
    text.setBackground(c1);

    p2.setLayout(new GridLayout(3, 0));
    p2.add(btn[0]);
    p2.add(btn[1]);
    p2.add(btn[2]);
    p2.add(btn[3]);
    p2.add(btn[4]);

    p2.add(btn[5]);
    p2.add(btn[6]);
    p2.add(btn[7]);
    p2.add(btn[8]);
    p2.add(btn[9]);

    p2.add(btn[10]);
    p2.add(btn[11]);
    p2.add(btn[12]);
    p2.add(btn[13]);
    p2.add(btn[14]);
    p2.add(btn[15]);

    setLayout(new BorderLayout());
    super.add(p, "North");
    super.add(p2, "Center");

    setSize(500, 400);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Calculator1();
  }
}

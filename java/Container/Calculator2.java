package Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Font;

public class Calculator2 extends JFrame implements ActionListener {
  Button btn1, btn2, btn3, btn4, btn5, btn6, btn8;
  TextField text = new TextField();
  JPanel p1 = new JPanel();
  JPanel p2 = new JPanel();
  Color c1 = new Color(249, 254, 180);
  Font f1 = new Font("Arial", Font.BOLD, 20);

  public Calculator2() {
    btn1 = new Button("1");
    btn2 = new Button("2");
    btn3 = new Button("3");
    btn4 = new Button("4");
    btn5 = new Button("5");
    btn6 = new Button("6");
    btn8 = new Button("숫자생성");
    p1.setLayout(new GridLayout(2, 0));
    p1.add(btn1);
    p1.add(btn2);
    p1.add(btn3);
    p1.add(btn4);
    p1.add(btn5);
    p1.add(btn6);
    btn1.setBackground(Color.BLACK);
    btn1.setForeground(Color.WHITE);
    btn1.setFont(f1);
    btn2.setBackground(Color.BLACK);
    btn2.setForeground(Color.WHITE);
    btn2.setFont(f1);
    btn3.setBackground(Color.BLACK);
    btn3.setForeground(Color.WHITE);
    btn3.setFont(f1);
    btn4.setBackground(Color.BLACK);
    btn4.setForeground(Color.WHITE);
    btn4.setFont(f1);
    btn5.setBackground(Color.BLACK);
    btn5.setForeground(Color.WHITE);
    btn5.setFont(f1);
    btn6.setBackground(Color.BLACK);
    btn6.setForeground(Color.WHITE);
    btn6.setFont(f1);

    p2.setLayout(new BorderLayout());
    p2.add(text, "Center");
    text.setBackground(c1);
    p2.add(btn8, "East");
    btn8.setBackground(Color.LIGHT_GRAY);
    btn8.addActionListener(this);

    setLayout(new BorderLayout());
    super.add(p1, "Center");
    super.add(p2, "South");

    setSize(400, 300);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Calculator2();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    ArrayList<String> list = new ArrayList<String>();
    while (list.size() < 6) {
      int num = (int) (Math.random() * 46);
      if (!list.contains(String.valueOf(num))) {
        list.add(String.valueOf(num));
      }
    }
    text.setText(list.toString());
    btn1.setLabel(list.get(0));
    btn2.setLabel(list.get(1));
    btn3.setLabel(list.get(2));
    btn4.setLabel(list.get(3));
    btn5.setLabel(list.get(4));
    btn6.setLabel(list.get(5));
  }
}

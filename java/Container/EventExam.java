package Container;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventExam extends JFrame implements ActionListener {
  JButton btn1 = new JButton("1");
  JButton btn2 = new JButton("열기");

  public EventExam() {
    setLayout(new FlowLayout());
    add(btn1);
    add(btn2);
    btn1.addActionListener(this); // 버튼 event : Console창에 Hello 출력
    btn2.addActionListener(this);

    setSize(500, 400);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new EventExam();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand() == "1") {
      System.out.println("Hello");
    }
  }
}
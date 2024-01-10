package Container;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class PanelExam extends JFrame {
  JButton file = new JButton("File");
  JButton save = new JButton("save");
  JButton west = new JButton("west");
  JButton center = new JButton("center");
  JPanel p = new JPanel();

  public PanelExam() {
    p.setLayout(new FlowLayout());
    p.add(file);
    p.add(save);

    setLayout(new BorderLayout());
    super.add(p, "North");
    super.add(west, "West");
    super.add(center, "Center");

    setSize(500, 400);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new PanelExam();
  }
}

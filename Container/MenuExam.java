package Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MenuExam extends JFrame {
  JMenuBar bar = new JMenuBar();
  JMenu file = new JMenu("File");

  JMenuItem nFile = new JMenuItem("새파일");
  JMenuItem open = new JMenuItem("열기");
  JMenuItem save = new JMenuItem("저장");
  JMenuItem quit = new JMenuItem("종료");
  JTextArea text = new JTextArea();
  JScrollPane sp = new JScrollPane(text);

  public MenuExam() {
    file.add(nFile);
    file.add(open);
    file.add(save);
    file.addSeparator();
    file.add(quit);
    bar.add(file);
    setJMenuBar(bar);
    super.add(sp, "Center");

    setSize(500, 400);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new MenuExam();
  }
}

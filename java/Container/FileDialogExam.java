package Container;

import java.awt.FileDialog;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileDialogExam extends JFrame {
  FileDialog load = new FileDialog(this, "열기모드");
  FileDialog save = new FileDialog(this, "저장모드", FileDialog.SAVE);

  JFileChooser jf = new JFileChooser();

  public FileDialogExam() {
    // load.setVisible(true);
    // save.setVisible(true);

    // jf.showOpenDialog(this);
    // jf.showSaveDialog(this);

    setSize(400, 300);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new FileDialogExam();
  }
}

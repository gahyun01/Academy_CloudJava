import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.awt.*;
import javax.swing.*;

//	�л��� ������ȸ
public class PrintScore2 extends JFrame implements ActionListener {
	private String no;
	// 7. ������ȸȭ��
	DBInfo dbinfo = new DBInfo();

	// �й��� ���� ���������� ������
	String[] korScore = dbinfo.myScore(Integer.parseInt(no), "kor");
	String[] engScore = dbinfo.myScore(Integer.parseInt(no), "eng");
	String[] mathScore = dbinfo.myScore(Integer.parseInt(no), "math");

	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();
	JPanel p7 = new JPanel();
	JPanel p8 = new JPanel();

	JButton btn1 = new JButton("Ȩ����");

	Font f1 = new Font("HY�߰��", Font.BOLD, 40);
	Font f2 = new Font("���� ��� (����)", Font.BOLD, 15);

	
	// �ش� ����/�й��� �̸��� �������� �޼ҵ�
	public String getName(String no) {
		String name = dbinfo.myInfo(Integer.parseInt(no), 4);
		return name;
	}
	
	
	// ������ȸȭ�� ������
	public PrintScore2(String no) {
		this.no = no;
		String name = getName(no);

		JLabel Ti = new JLabel("�л��� ������ȸ");
		p1.setLayout(new FlowLayout());
		p1.add(Ti);
		Ti.setFont(f1);
		JTextField Id = new JTextField("  " + no + "  ");
		JTextField Name = new JTextField("  " + name + "  ");

		p2.setLayout(new FlowLayout());
		p2.add(new JLabel("���̵�"));
		p2.add(Id);
		Id.setBackground(Color.LIGHT_GRAY);
		Id.setForeground(Color.black);
		Id.setBorder(BorderFactory.createLineBorder(Color.black));
		Id.setFont(f2);
		Id.setEditable(false);
		p2.add(new JLabel("        �̸�"));
		p2.add(Name);
		Name.setBackground(Color.LIGHT_GRAY);
		Name.setForeground(Color.black);
		Name.setBorder(BorderFactory.createLineBorder(Color.black));
		Name.setFont(f2);
		Name.setEditable(false);

		p3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p3.add(new JLabel("(�г� / �б�)"));

		p4.setLayout(new GridLayout(1, 0));
		p4.add(new JLabel("        �����"));
		p4.add(new JLabel("        1 / 1"));
		p4.add(new JLabel("        1 / 2"));
		p4.add(new JLabel("        2 / 1"));
		p4.add(new JLabel("        2 / 2"));
		p4.add(new JLabel("        3 / 1"));
		p4.add(new JLabel("        3 / 2"));

		p5.setLayout(new GridLayout(1, 0));
		p5.add(new JLabel("        ����"));

		p5.add(new JLabel("        " + korScore[0]));
		p5.add(new JLabel("        " + korScore[1]));
		p5.add(new JLabel("        " + korScore[2]));
		p5.add(new JLabel("        " + korScore[3]));
		p5.add(new JLabel("        " + korScore[4]));
		p5.add(new JLabel("        " + korScore[5]));

		p6.setLayout(new GridLayout(1, 0));
		p6.add(new JLabel("        ����"));
		p6.add(new JLabel("        " + engScore[0]));
		p6.add(new JLabel("        " + engScore[1]));
		p6.add(new JLabel("        " + engScore[2]));
		p6.add(new JLabel("        " + engScore[3]));
		p6.add(new JLabel("        " + engScore[4]));
		p6.add(new JLabel("        " + engScore[5]));

		p7.setLayout(new GridLayout(1, 0));
		p7.add(new JLabel("        ����"));
		p7.add(new JLabel("        " + mathScore[0]));
		p7.add(new JLabel("        " + mathScore[1]));
		p7.add(new JLabel("        " + mathScore[2]));
		p7.add(new JLabel("        " + mathScore[3]));
		p7.add(new JLabel("        " + mathScore[4]));
		p7.add(new JLabel("        " + mathScore[5]));

		p8.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p8.add(btn1, "East");
		btn1.addActionListener(this);
		btn1.setBackground(Color.WHITE);

		setLayout(new GridLayout(8, 0));
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		add(p7);
		add(p8);

//	**********************
//	7. ���� ������ȸ ���� 7. ��ȣ ����
		setTitle("���� ������ȸ");
		setSize(700, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new StManager2(no);
		dispose();
	}
}
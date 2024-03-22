import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class ScoreInfo extends JFrame implements ActionListener {
	DBInfo dbinfo = new DBInfo();
	
	String name; // �̸�
	String gender; // ���� : 1- ����, 2- ����
	String phone; // 010-0000-0000
	String korScore;
	String engScore;
	String mathScore;
	List<String> score;
	boolean booldb = false;

	// �������� : ���θ��� �ϳ��� ���������� ������
	// ���ϸ��� ��ȣ.txt�� ����
	JPanel p0 = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();
	JPanel p7 = new JPanel();
	JPanel p8 = new JPanel();
	JPanel p9 = new JPanel();

	JTextField t1 = new JTextField(20);
	JTextField t2 = new JTextField(20);
	JTextField t3 = new JTextField(20);

	JTextField tNo = new JTextField(10);
	JTextField tName = new JTextField(10);
	JTextField tPhone = new JTextField(10);
	JTextField tGender = new JTextField(10);

	JButton btn1 = new JButton("��ȸ");
	JButton btn2 = new JButton("������ȸ");
	JButton btn3 = new JButton("����");
	JButton btn4 = new JButton("Ȩ����");

	String[] optionsToChoose = { "�����ϼ���          ", "1/1", "1/2", "2/1", "2/2", "3/1", "3/2" };
	JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
	int semester;

	String myNo;
	
	// �����Է� ȭ�����
	public ScoreInfo(String empNo) {
		p0.setLayout(new FlowLayout());
		p0.add(new JLabel("          �л�����           "));

		p1.setLayout(new FlowLayout());
		p1.add(new JLabel("  ��   ��"));
		
		p1.add(tNo);
		
		p1.add(btn1);

		p2.add(new JLabel("��  �� "));
		p2.add(tName);
		tName.setEnabled(false);

		
		p3.add(new JLabel("����ó"));
		p3.add(tPhone);
		tPhone.setEnabled(false);

		p4.add(new JLabel("��    ��"));
		p4.add(tGender);
		tGender.setEnabled(false);

		p5.add(new JLabel("��    ��"));
		p5.add(jComboBox);

		p6.add(new JLabel("��    ��"));
		p6.add(t1);

		p7.add(new JLabel("��    ��"));
		p7.add(t2);

		p8.add(new JLabel("��    ��"));
		p8.add(t3);

		p9.add(btn2);
		p9.add(btn3);
		p9.add(btn4);

		setLayout(new FlowLayout());
		add(p0);

		setLayout(new FlowLayout());
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		add(p7);
		add(p8);
		add(p9);

		btn1.addActionListener(this);	// ��ȸ ��ư
		btn2.addActionListener(this);
		btn3.addActionListener(this);	//	����
		btn4.addActionListener(this);	//	Ȩ����

		setSize(330, 470);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		myNo = empNo;

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// �����ư�� ���� �޼ҵ� ȣ��
		String no = tNo.getText();
		System.out.println("actionPerformed no = " + no);

		String str = e.getActionCommand();
		semester = jComboBox.getSelectedIndex();
		 if (str.equals("����")) { 
			 //	�й��� �Է����� �ʾ��� ��
			 if(tNo.getText().equals("")) {
		         JOptionPane.showMessageDialog(this,  "������ �й��� �Է��ϼ���.");
				 return;
			 }
			 
			 // ����������
			 if(semester == 1) {
				 booldb = dbinfo.scoreInput(Integer.parseInt(no), "1", "1", t1.getText(), t2.getText(), t3.getText());
				 if (booldb == true) {
					 JOptionPane.showMessageDialog(this,  "����Ǿ����ϴ�.");
				 }
			 }else if(semester == 2) {
				 booldb = dbinfo.scoreInput(Integer.parseInt(no), "1", "2", t1.getText(), t2.getText(), t3.getText());
				 if (booldb == true) {
					 JOptionPane.showMessageDialog(this,  "����Ǿ����ϴ�.");
				 }
			 }else if(semester == 3) {
				 booldb = dbinfo.scoreInput(Integer.parseInt(no), "2", "1", t1.getText(), t2.getText(), t3.getText());
				 if (booldb == true) {
					 JOptionPane.showMessageDialog(this,  "����Ǿ����ϴ�.");
				 }
			 }else if(semester == 4) {
				 booldb = dbinfo.scoreInput(Integer.parseInt(no), "2", "2", t1.getText(), t2.getText(), t3.getText());
				 if (booldb == true) {
					 JOptionPane.showMessageDialog(this,  "����Ǿ����ϴ�.");
				 }
			 }else if(semester == 5) {
				 booldb = dbinfo.scoreInput(Integer.parseInt(no), "3", "1", t1.getText(), t2.getText(), t3.getText());
				 if (booldb == true) {
					 JOptionPane.showMessageDialog(this,  "����Ǿ����ϴ�.");
				 }
			 }else if(semester == 6) {
				 booldb = dbinfo.scoreInput(Integer.parseInt(no), "3", "2", t1.getText(), t2.getText(), t3.getText());
				 if (booldb == true) {
					 JOptionPane.showMessageDialog(this,  "����Ǿ����ϴ�.");
				 }
			 }
		 }
		 else if(str.equals("��ȸ")) {
			 //	�й��� �Է����� �ʾ��� ��
			 if(tNo.getText().equals("")) {
		         JOptionPane.showMessageDialog(this,  "��ȸ�� �й��� �Է��ϼ���.");
				 return;
			 }
			 checkNo(no);
		 }
		 else if (str.equals("������ȸ")) {
			 //	�й��� �Է����� �ʾ��� ��
			 if(tNo.getText().equals("")) {
		         JOptionPane.showMessageDialog(this,  "��ȸ�� �й��� �Է��ϼ���.");
				 return;
			 }

			 new PrintScore(no);
		 }
		 else if (str.equals("Ȩ����")) {
			new StManager(myNo);
			dispose();
		}
	 }
	
	// �й� ��ȸ ��ư
	// �ߺ�Ȯ�� : �ش� ���� �й��� ������ true ����, ������ false ����
	public boolean checkNo(String no) {
		if(dbinfo.infoComparison(Integer.parseInt(no)) == false) {	// �ش� ���̵� ���� ���
			JOptionPane.showMessageDialog(this,  "�������� �ʴ� �й��Դϴ�.");
			return false;
		} 
			// �ش� ���̵� ���� ���
		try {
			tName.setText(dbinfo.myInfo(Integer.parseInt(no), 4));	//	�̸� ������
			tPhone.setText(dbinfo.myInfo(Integer.parseInt(no), 7));	//	����ó ������
			String gender = dbinfo.myInfo(Integer.parseInt(no), 6);	//	���� ������ 1:����, 2:����
			
			if(gender.equals("1"))
				tGender.setText("����");
			else
				tGender.setText("����");
			return true;
		} catch (Exception e) {
			System.out.println("checkNo ���� : " + e);
			return false;
		} 
	}
}

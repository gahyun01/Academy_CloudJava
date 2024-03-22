import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.TextField;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//	���������� ȭ�� ( ���� ���� )
public class MyPage extends JFrame implements ActionListener {
	//	2. ȸ������ ȭ��
	DBInfo dbinfo = new DBInfo();
	
	int gubun;	//	1. ������, 2. �л�
	String name, addr;
	String pwd; 	//	�������� ȥ���ؼ� 8�ڸ�
	String birth;	//	���� 1999-00-00, 
	int gender;	//	���� : 1- ����, 2- ����
	String phone;	//	010-0000-0000
	
	PersonInfo person = new PersonInfo();

	JLabel label = new JLabel("����������", JLabel.CENTER);
	JPanel pnl = new JPanel();
	JButton btn = new JButton("����");
	JButton btn2 = new JButton("Ȩ����");

	JPanel pnl1 = new JPanel();	//	������ ��ư �߰�
	JPanel pnl2 = new JPanel();
	JPanel pnl3 = new JPanel();

	JPanel pnl4 = new JPanel();
	JPanel pnl5 = new JPanel();
	JPanel pnl6 = new JPanel();

//	ButtonGroup bg = new ButtonGroup();
//	JRadioButton rb = new JRadioButton("������", true);
//	JRadioButton rb2 = new JRadioButton("�� ��", false);

	ButtonGroup bg2 = new ButtonGroup();
	JRadioButton rb21 = new JRadioButton("�� ��", true);
	JRadioButton rb22 = new JRadioButton("�� ��", false);

	JTextField tNo = new JTextField("", 10);	// ���̵�
	TextField  tPwd = new TextField("", 8);		// ��й�ȣ
	JTextField tName = new JTextField("", 10);			// �̸�
	JTextField tBirth = new JTextField("", 10);			// �������
	JTextField tPhone = new JTextField();				// ����ó
	JTextField tAddr = new JTextField();				// �ּ�
	
	String myNo;
	String myGbn;

	public MyPage(int no) {
		setLayout(new BorderLayout(10, 30));
		pnl.setLayout(new BorderLayout(10, 30));
		pnl2.setLayout(new GridLayout(8, 1));
		pnl3.setLayout(new GridLayout(8, 1));
		
		add(label, BorderLayout.NORTH);
		add(pnl, BorderLayout.CENTER);
		add(pnl1, BorderLayout.SOUTH );

		pnl1.setLayout(new FlowLayout(FlowLayout.CENTER));
		pnl1.add(btn);	//	������ư
		pnl1.add(btn2);	//	Ȩ���� ��ư

		pnl.add(pnl2, BorderLayout.WEST);
		pnl.add(pnl3, BorderLayout.CENTER);

		label.setForeground(Color.BLUE);
		Font fnt = new Font("Serif", Font.BOLD, 20);
		label.setFont(fnt);

		pnl3.add(pnl4);	//	����
		pnl4.setLayout(new FlowLayout(FlowLayout.LEFT));
//		bg.add(rb);
//		bg.add(rb2);
//		pnl4.add(rb);
//		pnl4.add(rb2);
		
		tNo.setText(Integer.toString(no));
		pnl3.add(tNo);			//	���̵�
		tNo.setEnabled(false);

		tPwd.setText(dbinfo.myInfo(no, 3));
		pnl3.add(tPwd);		//	��й�ȣ
		tPwd.setEchoChar('*');
		
		tName.setText(dbinfo.myInfo(no, 4));
		tBirth.setText(dbinfo.myInfo(no, 5));
		pnl3.add(tName);	// �̸�
		pnl3.add(tBirth);	//	�������
		tName.setEnabled(false);
		tBirth.setEnabled(false);
		
		pnl3.add(pnl6);	//	����
		pnl6.setLayout(new FlowLayout(FlowLayout.LEFT));
		bg2.add(rb21);
		bg2.add(rb22);
		pnl6.add(rb21);
		pnl6.add(rb22);

		tPhone.setText(dbinfo.myInfo(no, 7));
		tAddr.setText(dbinfo.myInfo(no, 8));
		pnl3.add(tPhone);	//	����ó
		pnl3.add(tAddr);	//	�ּ�
		
		btn.addActionListener(this);	//	����
		btn2.addActionListener(this);	//	Ȩ����

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//	���� ������ �ѷ��ش�
		myNo = Integer.toString(no);
	}

	public void actionPerformed(ActionEvent e) {

		String str = e.getActionCommand();
		
		if(str.equals("����")) {
			dbinfo.modifyInfo("��й�ȣ", tPwd.getText(), Integer.parseInt(tNo.getText()));
			dbinfo.modifyInfo("����ó", tPhone.getText(), Integer.parseInt(tNo.getText()));
			dbinfo.modifyInfo("�ּ�", tAddr.getText(), Integer.parseInt(tNo.getText()));

			//	���� ��������
			if(rb21.isSelected())   
				dbinfo.modifyInfo("����", "1", Integer.parseInt(tNo.getText())); // ����
			else
				dbinfo.modifyInfo("����", "2", Integer.parseInt(tNo.getText())); // ����
		}
		else if(str.equals("Ȩ����")) {
			new StManager2(myNo);
			dispose();
		}
	}
}

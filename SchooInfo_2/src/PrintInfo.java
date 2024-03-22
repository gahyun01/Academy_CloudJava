import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;


// �л� ���� ��ȸ
public class PrintInfo extends JFrame implements ActionListener {
	DBInfo dbinfo = new DBInfo();
	ArrayList<String> allInfo = dbinfo.allInfo();
	
	JLabel label = new JLabel("�л�������ȸ", JLabel.CENTER);
	JLabel title = new JLabel();
	
	JPanel cPnl2 = new JPanel();	//	������ ����
	JPanel cPnl = new JPanel();	//	����
	JPanel bPnl = new JPanel();	//	�Ʒ� ��ư
	JPanel sPnl = new JPanel();	//	�� �Է�

	JButton btn = new JButton("��ȸ");
	JButton btn1 = new JButton("�л������Է�");
	JButton btn2 = new JButton("�л���������");
	JButton btn3 = new JButton("Ȩ����");

	JTextField tNo = new JTextField("", 10);	// ���̵�
	ButtonGroup bg = new ButtonGroup();
	JRadioButton rb = new JRadioButton("�� ü", true);
	JRadioButton rb2 = new JRadioButton("�� ��", false);
	
	JTextArea tArea = new JTextArea();
	JTextArea aTitle = new JTextArea();
	JScrollPane sPane = new JScrollPane(tArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
	String prtNo, prtName, prtBirth, prtGender, prtPhone, prtScore, prtAddr;
	String myNo;
	
	public PrintInfo(String no) {
		setLayout(new BorderLayout(10, 30));
		add(label, BorderLayout.NORTH);
		add(cPnl, BorderLayout.CENTER);
		add(bPnl, BorderLayout.SOUTH );

		label.setForeground(Color.BLUE);
		Font fnt = new Font("Serif", Font.BOLD, 20);
		label.setFont(fnt);

		cPnl.setLayout(new BorderLayout(10, 20));
		bPnl.setLayout(new GridLayout(1, 3));

		cPnl.add(sPnl, BorderLayout.NORTH);
		cPnl.add(cPnl2, BorderLayout.CENTER);
		sPnl.setLayout(new FlowLayout());

		cPnl2.setLayout(new BorderLayout(10, 5));
		cPnl2.add(aTitle, BorderLayout.NORTH);
		cPnl2.add(sPane, BorderLayout.CENTER);
		
		aTitle.setText(" �й�\t �̸�\t  �������\t       ����\t               ����ó\t          ��ռ���\t\t�ּ�");
		aTitle.setEditable(false);
		fnt = new Font("Serif", Font.BOLD, 13);
		aTitle.setFont(fnt);
		
		bg.add(rb);
		bg.add(rb2);
		sPnl.add(rb);
		sPnl.add(rb2);
		sPnl.add(tNo);
		sPnl.add(btn);	//	��ȸ��ư
		tNo.setEditable(false);
		
		rb.addActionListener(this);
		rb2.addActionListener(this);

		bPnl.add(btn1);	//	�Է¹�ư
		bPnl.add(btn2);	//	������ư
		bPnl.add(btn3);	//	Ȩ���ι�ư

		btn.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);

		setSize(850, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		myNo = no;
	}

	public void actionPerformed(ActionEvent e) {
		String act = e.getActionCommand();
		
		if(act.equals("�� ��")) {
			tNo.setEditable(true);
		}
		else if(act.equals("�� ü")) {
			tNo.setText("");
			tNo.setEditable(false);
		}
		else if(act.equals("��ȸ")) {
			printPerson();
		}
		else if(act.equals("�л������Է�")) {
			dispose();
			new MemberJoin(myNo);
		}
		else if(act.equals("�л���������")) {
			delPerson();
		}
		else if(act.equals("Ȩ����")) {
			dispose();
			new StManager(myNo);
		}
	}
	
	public String getScore(String no) {
		int total = 0;
		int avg = 0;
		int i = 0;

		if(!dbinfo.infoComparison(Integer.parseInt(no))) {	// �ش� ����(�� ����)�� �����ϴ��� Ȯ��
			return " ";
		}

		// �й��� ���� ���������� ������
		String[] korScore = dbinfo.myScore(Integer.parseInt(no), "kor");
		String[] engScore = dbinfo.myScore(Integer.parseInt(no), "eng");
		String[] mathScore = dbinfo.myScore(Integer.parseInt(no), "math");
		
		for(int j = 0; j < 6; j++) {
			total += Integer.parseInt(korScore[i]);
			total += Integer.parseInt(engScore[i]);
			total += Integer.parseInt(mathScore[i]);
			if(korScore[i] != null) {
				i++;
			}
			if(engScore[i] != null) {
				i++;
			}
			if(mathScore[i] != null) {
				i++;
			}
		}
		
		avg = (int)(total / i);
		System.out.println(avg);
		return Integer.toString(avg);
	}
	
	public void printPerson() {
		String inNo = "";
		String gndr = "1";
		String text = "";

		
		if(!rb.isSelected()) {  // ��ü
			JOptionPane.showMessageDialog(this,  "�й��� �Է��ϼ���.");
			return;
		}
		if(rb.isSelected()) {	// ��ü�̸�
			for(int i=0; i<allInfo.size(); i++) {
				//	�й�,  �̸�, �������, ����, ����ó, ��ռ���, �ּ�
				if(i == 0 || i == 0 + 6) {	// ������ �����̳� last ������ �ƴ� ���� �л�������
					prtNo = allInfo.get(i); // �й�
				}else if(i == 1 || i == 1 + 6) {
					prtName = allInfo.get(i);	//	�̸� ������
				}else if(i == 2 || i == 2 + 6) {
					prtBirth = allInfo.get(i);	//	������� ������ 
				}else if(i == 3 || i == 3 + 6) { // ���� ������ 
					if(allInfo.get(i) == "1")
						prtGender = "����";
					else
						prtGender = "����";
				}else if(i == 4 || i == 4 + 6) {
					prtPhone = allInfo.get(i);	//	����ó ������ 
				}else if(i == 5 || i == 5 + 6) {
					prtAddr = allInfo.get(i);	//	�ּ� ������
				}
				prtScore = getScore(prtNo);

				// System.out.println("�л����� : " + prtNo + "\t"+ prtName + "\t"+ prtBirth + "\t"+ prtGender + "\t"+ prtPhone + "\t"+ prtScore + "\t"+ prtAddr);
				text = text + prtNo + "\t"+ prtName + "\t"+ prtBirth + "\t"+ prtGender + "\t"+ prtPhone + "\t"+ "\t"+ prtScore + "\t"+ prtAddr + "\n";
				tArea.setText(text);	
			}
		}else if(rb2.isSelected()){
			prtNo = tNo.getText(); // �й�
			prtName = dbinfo.myInfo(Integer.parseInt(prtNo), 4);	//	�̸� ������
			prtBirth = dbinfo.myInfo(Integer.parseInt(prtNo), 5);//	������� ������ 
			if(dbinfo.myInfo(Integer.parseInt(prtNo), 6) == "1")
				prtGender = "����";
			else
				prtGender = "����";
			prtPhone = dbinfo.myInfo(Integer.parseInt(prtNo), 7);	//	����ó ������ 
			prtAddr = dbinfo.myInfo(Integer.parseInt(prtNo), 8);	//	�ּ� ������
			prtScore = getScore(prtNo);
			
			text = text + prtNo + "\t"+ prtName + "\t"+ prtBirth + "\t"+ prtGender + "\t"+ prtPhone + "\t"+ "\t"+ prtScore + "\t"+ prtAddr + "\n";
			tArea.setText(text);
		}

		
		
		// ������ ��ŭ
		
	}
	
	public void delPerson() {
		
		if(rb.isSelected()) {  // ��ü
			JOptionPane.showMessageDialog(this,  "������ �й��� ��������");
			return;
		}
		
		String inNo = tNo.getText();
		if(inNo.length() == 0 ) {
			JOptionPane.showMessageDialog(this,  "������ �й��� ��������.");
			return;
		}

		if(!dbinfo.infoComparison(Integer.parseInt(inNo))) {	// �ش� ����(�� ����)�� �����ϴ��� Ȯ��
			JOptionPane.showMessageDialog(this,  "�ش� �й��� ��ϵ� �й��� �ƴմϴ�.");
			return;
		}

		if(dbinfo.myInfo(Integer.parseInt(inNo), 2) == "2") {	// ������ �����̳� last ������ �ƴ� ���� �л�������
			dbinfo.deleteInfo(Integer.parseInt(inNo));
			JOptionPane.showMessageDialog(this,  "�����Ǿ����ϴ�.");
		}
		
		//	�˻��� ����Ʈ�� �־��ٸ� Ŭ����
		tArea.setText("");
	}
}

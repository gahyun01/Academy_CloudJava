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


// 학생 정보 조회
public class PrintInfo extends JFrame implements ActionListener {
	DBInfo dbinfo = new DBInfo();
	ArrayList<String> allInfo = dbinfo.allInfo();
	
	JLabel label = new JLabel("학생정보조회", JLabel.CENTER);
	JLabel title = new JLabel();
	
	JPanel cPnl2 = new JPanel();	//	센터의 제목
	JPanel cPnl = new JPanel();	//	센터
	JPanel bPnl = new JPanel();	//	아래 버튼
	JPanel sPnl = new JPanel();	//	위 입력

	JButton btn = new JButton("조회");
	JButton btn1 = new JButton("학생정보입력");
	JButton btn2 = new JButton("학생정보삭제");
	JButton btn3 = new JButton("홈으로");

	JTextField tNo = new JTextField("", 10);	// 아이디
	ButtonGroup bg = new ButtonGroup();
	JRadioButton rb = new JRadioButton("전 체", true);
	JRadioButton rb2 = new JRadioButton("개 별", false);
	
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
		
		aTitle.setText(" 학번\t 이름\t  생년월일\t       성별\t               연락처\t          평균성적\t\t주소");
		aTitle.setEditable(false);
		fnt = new Font("Serif", Font.BOLD, 13);
		aTitle.setFont(fnt);
		
		bg.add(rb);
		bg.add(rb2);
		sPnl.add(rb);
		sPnl.add(rb2);
		sPnl.add(tNo);
		sPnl.add(btn);	//	조회버튼
		tNo.setEditable(false);
		
		rb.addActionListener(this);
		rb2.addActionListener(this);

		bPnl.add(btn1);	//	입력버튼
		bPnl.add(btn2);	//	삭제버튼
		bPnl.add(btn3);	//	홈으로버튼

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
		
		if(act.equals("개 별")) {
			tNo.setEditable(true);
		}
		else if(act.equals("전 체")) {
			tNo.setText("");
			tNo.setEditable(false);
		}
		else if(act.equals("조회")) {
			printPerson();
		}
		else if(act.equals("학생정보입력")) {
			dispose();
			new MemberJoin(myNo);
		}
		else if(act.equals("학생정보삭제")) {
			delPerson();
		}
		else if(act.equals("홈으로")) {
			dispose();
			new StManager(myNo);
		}
	}
	
	public String getScore(String no) {
		int total = 0;
		int avg = 0;
		int i = 0;

		if(!dbinfo.infoComparison(Integer.parseInt(no))) {	// 해당 파일(및 폴더)가 존재하는지 확인
			return " ";
		}

		// 학번을 통해 성적정보를 가져옴
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

		
		if(!rb.isSelected()) {  // 전체
			JOptionPane.showMessageDialog(this,  "학번을 입력하세요.");
			return;
		}
		if(rb.isSelected()) {	// 전체이면
			for(int i=0; i<allInfo.size(); i++) {
				//	학번,  이름, 생년월일, 성별, 연락처, 평균성적, 주소
				if(i == 0 || i == 0 + 6) {	// 교직원 파일이나 last 파일이 아닐 경우는 학생파일임
					prtNo = allInfo.get(i); // 학번
				}else if(i == 1 || i == 1 + 6) {
					prtName = allInfo.get(i);	//	이름 가져옴
				}else if(i == 2 || i == 2 + 6) {
					prtBirth = allInfo.get(i);	//	생년월일 가져옴 
				}else if(i == 3 || i == 3 + 6) { // 성별 가져옴 
					if(allInfo.get(i) == "1")
						prtGender = "남성";
					else
						prtGender = "여성";
				}else if(i == 4 || i == 4 + 6) {
					prtPhone = allInfo.get(i);	//	연락처 가져옴 
				}else if(i == 5 || i == 5 + 6) {
					prtAddr = allInfo.get(i);	//	주소 가져옴
				}
				prtScore = getScore(prtNo);

				// System.out.println("학생정보 : " + prtNo + "\t"+ prtName + "\t"+ prtBirth + "\t"+ prtGender + "\t"+ prtPhone + "\t"+ prtScore + "\t"+ prtAddr);
				text = text + prtNo + "\t"+ prtName + "\t"+ prtBirth + "\t"+ prtGender + "\t"+ prtPhone + "\t"+ "\t"+ prtScore + "\t"+ prtAddr + "\n";
				tArea.setText(text);	
			}
		}else if(rb2.isSelected()){
			prtNo = tNo.getText(); // 학번
			prtName = dbinfo.myInfo(Integer.parseInt(prtNo), 4);	//	이름 가져옴
			prtBirth = dbinfo.myInfo(Integer.parseInt(prtNo), 5);//	생년월일 가져옴 
			if(dbinfo.myInfo(Integer.parseInt(prtNo), 6) == "1")
				prtGender = "남성";
			else
				prtGender = "여성";
			prtPhone = dbinfo.myInfo(Integer.parseInt(prtNo), 7);	//	연락처 가져옴 
			prtAddr = dbinfo.myInfo(Integer.parseInt(prtNo), 8);	//	주소 가져옴
			prtScore = getScore(prtNo);
			
			text = text + prtNo + "\t"+ prtName + "\t"+ prtBirth + "\t"+ prtGender + "\t"+ prtPhone + "\t"+ "\t"+ prtScore + "\t"+ prtAddr + "\n";
			tArea.setText(text);
		}

		
		
		// 데이터 만큼
		
	}
	
	public void delPerson() {
		
		if(rb.isSelected()) {  // 전체
			JOptionPane.showMessageDialog(this,  "삭제할 학번을 넣으세요");
			return;
		}
		
		String inNo = tNo.getText();
		if(inNo.length() == 0 ) {
			JOptionPane.showMessageDialog(this,  "삭제할 학번을 넣으세요.");
			return;
		}

		if(!dbinfo.infoComparison(Integer.parseInt(inNo))) {	// 해당 파일(및 폴더)가 존재하는지 확인
			JOptionPane.showMessageDialog(this,  "해당 학번은 등록된 학번이 아닙니다.");
			return;
		}

		if(dbinfo.myInfo(Integer.parseInt(inNo), 2) == "2") {	// 교직원 파일이나 last 파일이 아닐 경우는 학생파일임
			dbinfo.deleteInfo(Integer.parseInt(inNo));
			JOptionPane.showMessageDialog(this,  "삭제되었습니다.");
		}
		
		//	검색된 리스트가 있었다면 클리어
		tArea.setText("");
	}
}

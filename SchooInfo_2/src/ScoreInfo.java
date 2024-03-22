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
	
	String name; // 이름
	String gender; // 성별 : 1- 남성, 2- 여성
	String phone; // 010-0000-0000
	String korScore;
	String engScore;
	String mathScore;
	List<String> score;
	boolean booldb = false;

	// 정보저장 : 개인마다 하나의 정보파일을 생성함
	// 파일명은 번호.txt로 생성
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

	JButton btn1 = new JButton("조회");
	JButton btn2 = new JButton("성적조회");
	JButton btn3 = new JButton("저장");
	JButton btn4 = new JButton("홈으로");

	String[] optionsToChoose = { "선택하세요          ", "1/1", "1/2", "2/1", "2/2", "3/1", "3/2" };
	JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
	int semester;

	String myNo;
	
	// 성적입력 화면생성
	public ScoreInfo(String empNo) {
		p0.setLayout(new FlowLayout());
		p0.add(new JLabel("          학생관리           "));

		p1.setLayout(new FlowLayout());
		p1.add(new JLabel("  학   번"));
		
		p1.add(tNo);
		
		p1.add(btn1);

		p2.add(new JLabel("이  름 "));
		p2.add(tName);
		tName.setEnabled(false);

		
		p3.add(new JLabel("연락처"));
		p3.add(tPhone);
		tPhone.setEnabled(false);

		p4.add(new JLabel("성    별"));
		p4.add(tGender);
		tGender.setEnabled(false);

		p5.add(new JLabel("학    년"));
		p5.add(jComboBox);

		p6.add(new JLabel("국    어"));
		p6.add(t1);

		p7.add(new JLabel("영    어"));
		p7.add(t2);

		p8.add(new JLabel("수    학"));
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

		btn1.addActionListener(this);	// 조회 버튼
		btn2.addActionListener(this);
		btn3.addActionListener(this);	//	저장
		btn4.addActionListener(this);	//	홈으로

		setSize(330, 470);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		myNo = empNo;

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// 저장버튼에 따라 메소드 호출
		String no = tNo.getText();
		System.out.println("actionPerformed no = " + no);

		String str = e.getActionCommand();
		semester = jComboBox.getSelectedIndex();
		 if (str.equals("저장")) { 
			 //	학번을 입력하지 않았을 때
			 if(tNo.getText().equals("")) {
		         JOptionPane.showMessageDialog(this,  "저장할 학번을 입력하세요.");
				 return;
			 }
			 
			 // 저장했을때
			 if(semester == 1) {
				 booldb = dbinfo.scoreInput(Integer.parseInt(no), "1", "1", t1.getText(), t2.getText(), t3.getText());
				 if (booldb == true) {
					 JOptionPane.showMessageDialog(this,  "저장되었습니다.");
				 }
			 }else if(semester == 2) {
				 booldb = dbinfo.scoreInput(Integer.parseInt(no), "1", "2", t1.getText(), t2.getText(), t3.getText());
				 if (booldb == true) {
					 JOptionPane.showMessageDialog(this,  "저장되었습니다.");
				 }
			 }else if(semester == 3) {
				 booldb = dbinfo.scoreInput(Integer.parseInt(no), "2", "1", t1.getText(), t2.getText(), t3.getText());
				 if (booldb == true) {
					 JOptionPane.showMessageDialog(this,  "저장되었습니다.");
				 }
			 }else if(semester == 4) {
				 booldb = dbinfo.scoreInput(Integer.parseInt(no), "2", "2", t1.getText(), t2.getText(), t3.getText());
				 if (booldb == true) {
					 JOptionPane.showMessageDialog(this,  "저장되었습니다.");
				 }
			 }else if(semester == 5) {
				 booldb = dbinfo.scoreInput(Integer.parseInt(no), "3", "1", t1.getText(), t2.getText(), t3.getText());
				 if (booldb == true) {
					 JOptionPane.showMessageDialog(this,  "저장되었습니다.");
				 }
			 }else if(semester == 6) {
				 booldb = dbinfo.scoreInput(Integer.parseInt(no), "3", "2", t1.getText(), t2.getText(), t3.getText());
				 if (booldb == true) {
					 JOptionPane.showMessageDialog(this,  "저장되었습니다.");
				 }
			 }
		 }
		 else if(str.equals("조회")) {
			 //	학번을 입력하지 않았을 때
			 if(tNo.getText().equals("")) {
		         JOptionPane.showMessageDialog(this,  "조회할 학번을 입력하세요.");
				 return;
			 }
			 checkNo(no);
		 }
		 else if (str.equals("성적조회")) {
			 //	학번을 입력하지 않았을 때
			 if(tNo.getText().equals("")) {
		         JOptionPane.showMessageDialog(this,  "조회할 학번을 입력하세요.");
				 return;
			 }

			 new PrintScore(no);
		 }
		 else if (str.equals("홈으로")) {
			new StManager(myNo);
			dispose();
		}
	 }
	
	// 학번 조회 버튼
	// 중복확인 : 해당 교번 학번이 있으면 true 리턴, 없으면 false 리턴
	public boolean checkNo(String no) {
		if(dbinfo.infoComparison(Integer.parseInt(no)) == false) {	// 해당 아이디가 없을 경우
			JOptionPane.showMessageDialog(this,  "존재하지 않는 학번입니다.");
			return false;
		} 
			// 해당 아이디가 있을 경우
		try {
			tName.setText(dbinfo.myInfo(Integer.parseInt(no), 4));	//	이름 가져옴
			tPhone.setText(dbinfo.myInfo(Integer.parseInt(no), 7));	//	연락처 가져옴
			String gender = dbinfo.myInfo(Integer.parseInt(no), 6);	//	성별 가져옴 1:남성, 2:여성
			
			if(gender.equals("1"))
				tGender.setText("남성");
			else
				tGender.setText("여성");
			return true;
		} catch (Exception e) {
			System.out.println("checkNo 오류 : " + e);
			return false;
		} 
	}
}

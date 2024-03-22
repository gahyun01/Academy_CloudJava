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

//	마이페이지 화면 ( 정보 수정 )
public class MyPage extends JFrame implements ActionListener {
	//	2. 회원가입 화면
	DBInfo dbinfo = new DBInfo();
	
	int gubun;	//	1. 교지원, 2. 학생
	String name, addr;
	String pwd; 	//	영문숫자 혼합해서 8자리
	String birth;	//	생일 1999-00-00, 
	int gender;	//	성별 : 1- 남성, 2- 여성
	String phone;	//	010-0000-0000
	
	PersonInfo person = new PersonInfo();

	JLabel label = new JLabel("마이페이지", JLabel.CENTER);
	JPanel pnl = new JPanel();
	JButton btn = new JButton("수정");
	JButton btn2 = new JButton("홈으로");

	JPanel pnl1 = new JPanel();	//	마지막 버튼 추가
	JPanel pnl2 = new JPanel();
	JPanel pnl3 = new JPanel();

	JPanel pnl4 = new JPanel();
	JPanel pnl5 = new JPanel();
	JPanel pnl6 = new JPanel();

//	ButtonGroup bg = new ButtonGroup();
//	JRadioButton rb = new JRadioButton("교직원", true);
//	JRadioButton rb2 = new JRadioButton("학 생", false);

	ButtonGroup bg2 = new ButtonGroup();
	JRadioButton rb21 = new JRadioButton("남 성", true);
	JRadioButton rb22 = new JRadioButton("여 성", false);

	JTextField tNo = new JTextField("", 10);	// 아이디
	TextField  tPwd = new TextField("", 8);		// 비밀번호
	JTextField tName = new JTextField("", 10);			// 이름
	JTextField tBirth = new JTextField("", 10);			// 생년월일
	JTextField tPhone = new JTextField();				// 연락처
	JTextField tAddr = new JTextField();				// 주소
	
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
		pnl1.add(btn);	//	수정버튼
		pnl1.add(btn2);	//	홈으로 버튼

		pnl.add(pnl2, BorderLayout.WEST);
		pnl.add(pnl3, BorderLayout.CENTER);

		label.setForeground(Color.BLUE);
		Font fnt = new Font("Serif", Font.BOLD, 20);
		label.setFont(fnt);

		pnl3.add(pnl4);	//	구분
		pnl4.setLayout(new FlowLayout(FlowLayout.LEFT));
//		bg.add(rb);
//		bg.add(rb2);
//		pnl4.add(rb);
//		pnl4.add(rb2);
		
		tNo.setText(Integer.toString(no));
		pnl3.add(tNo);			//	아이디
		tNo.setEnabled(false);

		tPwd.setText(dbinfo.myInfo(no, 3));
		pnl3.add(tPwd);		//	비밀번호
		tPwd.setEchoChar('*');
		
		tName.setText(dbinfo.myInfo(no, 4));
		tBirth.setText(dbinfo.myInfo(no, 5));
		pnl3.add(tName);	// 이름
		pnl3.add(tBirth);	//	생년월일
		tName.setEnabled(false);
		tBirth.setEnabled(false);
		
		pnl3.add(pnl6);	//	성별
		pnl6.setLayout(new FlowLayout(FlowLayout.LEFT));
		bg2.add(rb21);
		bg2.add(rb22);
		pnl6.add(rb21);
		pnl6.add(rb22);

		tPhone.setText(dbinfo.myInfo(no, 7));
		tAddr.setText(dbinfo.myInfo(no, 8));
		pnl3.add(tPhone);	//	연락처
		pnl3.add(tAddr);	//	주소
		
		btn.addActionListener(this);	//	수정
		btn2.addActionListener(this);	//	홈으로

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//	나의 정보를 뿌려준다
		myNo = Integer.toString(no);
	}

	public void actionPerformed(ActionEvent e) {

		String str = e.getActionCommand();
		
		if(str.equals("수정")) {
			dbinfo.modifyInfo("비밀번호", tPwd.getText(), Integer.parseInt(tNo.getText()));
			dbinfo.modifyInfo("연락처", tPhone.getText(), Integer.parseInt(tNo.getText()));
			dbinfo.modifyInfo("주소", tAddr.getText(), Integer.parseInt(tNo.getText()));

			//	성별 가져오기
			if(rb21.isSelected())   
				dbinfo.modifyInfo("성별", "1", Integer.parseInt(tNo.getText())); // 남성
			else
				dbinfo.modifyInfo("성별", "2", Integer.parseInt(tNo.getText())); // 여성
		}
		else if(str.equals("홈으로")) {
			new StManager2(myNo);
			dispose();
		}
	}
}

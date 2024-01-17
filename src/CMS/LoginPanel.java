package CMS;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.LineBorder;
public class LoginPanel extends JFrame implements ActionListener,MouseListener{
	JButton signup,login;
	JTextField usernameField;
	JPasswordField passwordField;
	JComboBox userComboBox;
	ImageIcon titleImg;
	LoginPanel(){
		this.setTitle("Login Panel");
		JLabel title=new JLabel("Welcome to the Login Panel");
		title.setBounds(150,20,400,40);
		title.setFont(new Font("Osward",Font.BOLD,30));
		//creating a instance of ImageIcon class to get the image
		ImageIcon img1=new ImageIcon("C:\\Users\\Acer\\Documents\\NetBeansProjects\\LatestCMS\\src\\icons\\teaching.png");
		ImageIcon img2=new ImageIcon("C:\\Users\\Acer\\Documents\\NetBeansProjects\\LatestCMS\\src\\icons\\key.png");
		ImageIcon img3=new ImageIcon("C:\\Users\\Acer\\Documents\\NetBeansProjects\\LatestCMS\\src\\icons\\usermode.png");
		ImageIcon img4=new ImageIcon("C:\\Users\\Acer\\Documents\\NetBeansProjects\\LatestCMS\\src\\icons\\username.png");
		//changing the height and width of the images
		Image i=img1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
		Image i2=img2.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		Image i3=img3.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		Image i4=img4.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		//		setting the title image as the size changed image
		titleImg=new ImageIcon(i);
		//label for title image
		JLabel titleImgLabel=new JLabel(titleImg);
		titleImgLabel.setBounds(315,70,70,70);
		this.add(titleImgLabel);
		this.add(title);
		this.setIconImage(titleImg.getImage());
		//for username
		//Username image
		ImageIcon userImg=new ImageIcon(i4);
		JLabel userImgLabel=new JLabel(userImg);
		userImgLabel.setBounds(110,180,30,30);
		this.add(userImgLabel);
		
		JLabel username=new JLabel("Username:");
		username.setBounds(150,180,170,30);
		username.setFont(new Font("Raleway",Font.BOLD,25));
		this.add(username);
		
		usernameField=new JTextField();
		usernameField.setBounds(320,180,250,30);
		usernameField.setFont(new Font("Arial",Font.BOLD,20));
		this.add(usernameField);
//		for password
		ImageIcon passwordImg=new ImageIcon(i2);
		JLabel passwordImgLabel=new JLabel(passwordImg);
		passwordImgLabel.setBounds(110,230,30,30);
		this.add(passwordImgLabel);
		
		JLabel password=new JLabel("Password:");
		password.setBounds(150,230,170,30);
		password.setFont(new Font("Raleway",Font.BOLD,25));
		this.add(password);
		
		passwordField=new JPasswordField();
		passwordField.setBounds(320,230,250,30);
		passwordField.setFont(new Font("Arial",Font.BOLD,20));
		this.add(passwordField);
//		Select UserMode
		ImageIcon userModeImg=new ImageIcon(i3);
		JLabel userModeImgLabel=new JLabel(userModeImg);
		userModeImgLabel.setBounds(38,280,170,30);
		this.add(userModeImgLabel);
		
		JLabel userMode =new JLabel();
		userMode.setText("Select User Mode:");
		userMode.setBounds(150,280,250,30);
		userMode.setFont(new Font("Raleway",Font.BOLD,25));
		this.add(userMode);
		
		String[] users= {"Select One","Student","Teacher","Admin"};
		userComboBox=new JComboBox(users);
		userComboBox.setBounds(400,280,250,30);
		userComboBox.setFont(new Font("Arial",Font.PLAIN,20));
		userComboBox.setBorder(BorderFactory.createEmptyBorder());
		userComboBox.setBackground(Color.white);
		this.add(userComboBox);
//		Login Button
		login=new JButton("Log in");
		login.setBounds(250,350,200,30);
		login.setFocusable(false);
		login.addMouseListener(this);
		login.setBackground(new Color(73, 79, 85));
		login.setBorder(BorderFactory.createEmptyBorder());
		login.setForeground(Color.white);
		login.setFont(new Font(null,Font.PLAIN,16));
		login.addActionListener(this);
		this.add(login);
		//Don't have an account?
		JLabel noAcc=new JLabel("Don't have an account?");
		noAcc.setBounds(270,380,200,30);
		noAcc.setFont(new Font(null,Font.PLAIN,16));
		this.add(noAcc);
		//sign up button
		signup=new JButton("Sign Up");
		signup.setBounds(250,410,200,30);
		signup.setFocusable(false);
		signup.setBackground(new Color(73, 79, 85));
		signup.setForeground(Color.white);
		signup.addActionListener(this);
		signup.addMouseListener(this);
		signup.setBorder(BorderFactory.createEmptyBorder());
		signup.setFont(new Font(null,Font.PLAIN,16));
		this.add(signup);
		
		this.getContentPane().setBackground(Color.white);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700,600);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==signup) {
			this.dispose();
			new Signup();
		}
		if(e.getSource()==login) {
			Conn con=new Conn();
			String username=usernameField.getText();
			char[] password=passwordField.getPassword();
			String userMode=userComboBox.getSelectedItem().toString();
			if(username.isEmpty() || new String(password).isEmpty()||userMode.equals("Select One")) {
				JOptionPane.showMessageDialog(null, "Please fill up all the fields.");
			}
			
			else {
			String query="select username,password,usermode from signup where username='"+username+"'and"
					+ " password='"+new String(password)+"' and usermode='"+userMode+"'";
			try {
				ResultSet rs=con.s.executeQuery(query);
				if(rs.next()) {
					this.dispose();
					new FrontPage().setVisible(true);
					String[] response= {"OK"};
					String successTitle="SignIn Successful!!";
					JOptionPane.showOptionDialog(this, "Welcome to the Course Management System", successTitle, JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, titleImg, response, 0);
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Inputs");
				}
				}
			catch(Exception ea) {
				System.out.println(ea);
			}
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==signup) {
			signup.setBackground(Color.black);
			signup.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		else if(e.getSource()==login) {
			login.setBackground(Color.black);
			login.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==signup) {
			signup.setBackground(new Color(73, 79, 85));
		}
		else if(e.getSource()==login) {
			login.setBackground(new Color(73, 79, 85));
		}
		
	}

}

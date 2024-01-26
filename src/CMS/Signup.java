package CMS;
import javax.swing.*;

import javax.swing.text.DefaultCaret;
import java.awt.event.*;
import java.awt.*;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.awt.*;
public class Signup extends JFrame implements ActionListener,MouseListener,ItemListener{
    
	JButton create;
	JTextField usernameField,emailField,phoneNumField;
	JPasswordField passwordField,confirmPasswordField;
	JComboBox userComboBox;
        JComboBox courseComboBox;
	Pattern emailPattern;
	String emailRegex;
	ImageIcon titleImg;
	Signup(){
		this.setTitle("SignUp Panel");
		JLabel title=new JLabel("Welcome to the Signup Panel");
		title.setBounds(150,20,500,40);
		title.setFont(new Font("Osward",Font.BOLD,30));
		//creating a instance of ImageIcon class to get the image
		ImageIcon img1=new ImageIcon("C:\\Users\\Acer\\Documents\\NetBeansProjects\\LatestCMS\\src\\icons\\teaching.png");
		ImageIcon img2=new ImageIcon("C:\\Users\\Acer\\Documents\\NetBeansProjects\\LatestCMS\\src\\icons\\key.png");
		ImageIcon img3=new ImageIcon("C:\\Users\\Acer\\Documents\\NetBeansProjects\\LatestCMS\\src\\icons\\usermode.png");
		ImageIcon img4=new ImageIcon("C:\\Users\\Acer\\Documents\\NetBeansProjects\\LatestCMS\\src\\icons\\username.png");
		ImageIcon img5=new ImageIcon("C:\\Users\\Acer\\Documents\\NetBeansProjects\\LatestCMS\\src\\icons\\email.png");
		ImageIcon img6=new ImageIcon("C:\\Users\\Acer\\Documents\\NetBeansProjects\\LatestCMS\\src\\icons\\phone.png");
		//changing the height and width of the images
		Image i=img1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
		Image i2=img2.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		Image i3=img3.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		Image i4=img4.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		Image i5=img5.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		Image i6=img6.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		//setting the title image as the size changed image
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
//		for email
		ImageIcon emailImg=new ImageIcon(i5);
		JLabel emailImgLabel=new JLabel(emailImg);
		emailImgLabel.setBounds(110,230,30,30);
		this.add(emailImgLabel);
		
		
		JLabel email=new JLabel("Email:");
		email.setBounds(150,230,170,30);
		email.setFont(new Font("Raleway",Font.BOLD,25));
		this.add(email);
		
		emailField=new JTextField();
		emailField.setBounds(320,230,250,30);
		emailField.setFont(new Font("Arial",Font.BOLD,20));
		this.add(emailField);
		//for password
		ImageIcon passwordImg=new ImageIcon(i2);
		JLabel passwordImgLabel=new JLabel(passwordImg);
		passwordImgLabel.setBounds(110,280,30,30);
		this.add(passwordImgLabel);
		
		JLabel password=new JLabel("Password:");
		password.setBounds(150,280,170,30);
		password.setFont(new Font("Raleway",Font.BOLD,25));
		this.add(password);
		
		passwordField=new JPasswordField();
		passwordField.setBounds(320,280,250,30);
		passwordField.setFont(new Font("Arial",Font.BOLD,20));
		this.add(passwordField);
		//for confirm password
		ImageIcon ConfirmpasswordImg=new ImageIcon(i2);
		JLabel ComfirmpasswordImgLabel=new JLabel(ConfirmpasswordImg);
		ComfirmpasswordImgLabel.setBounds(110,330,30,30);
		this.add(ComfirmpasswordImgLabel);
		
		JLabel confirmPassword=new JLabel("Confirm Password:");
		confirmPassword.setBounds(150,330,250,30);
		confirmPassword.setFont(new Font("Raleway",Font.BOLD,25));
		this.add(confirmPassword);
		
		confirmPasswordField=new JPasswordField();
		confirmPasswordField.setBounds(390,330,250,30);
		confirmPasswordField.setFont(new Font("Arial",Font.BOLD,20));
		this.add(confirmPasswordField);
		//for Phone number
		ImageIcon PhonenumImg=new ImageIcon(i6);
		JLabel PhonenumImgLabel=new JLabel(PhonenumImg);
		PhonenumImgLabel.setBounds(110,380,30,30);
		this.add(PhonenumImgLabel);
		
		JLabel phoneNum=new JLabel("Phone Number:");
		phoneNum.setBounds(150,380,250,30);
		phoneNum.setFont(new Font("Raleway",Font.BOLD,25));
		this.add(phoneNum);
		
		phoneNumField=new JTextField();
		phoneNumField.setBounds(390,380,250,30);
		phoneNumField.setFont(new Font("Arial",Font.BOLD,20));
		this.add(phoneNumField);
		//User mode
		ImageIcon userModeImg=new ImageIcon(i3);
		JLabel userModeImgLabel=new JLabel(userModeImg);
		userModeImgLabel.setBounds(110,430,30,30);
		this.add(userModeImgLabel);
		
		JLabel userMode =new JLabel();
		userMode.setText("User Mode:");
		userMode.setBounds(150,430,250,30);
		userMode.setFont(new Font("Raleway",Font.BOLD,25));
		this.add(userMode);
		
		String[] users= {"Select User Mode","Student","Teacher","Admin"};
		userComboBox=new JComboBox(users);
		userComboBox.setBounds(390,430,250,30);
		userComboBox.setFont(new Font("Arial",Font.PLAIN,20));
		userComboBox.setBorder(BorderFactory.createEmptyBorder());
		userComboBox.setBackground(Color.white);
                userComboBox.addMouseListener(this);
                userComboBox.addItemListener(this);
		this.add(userComboBox);
                
                //courses
                String[] courses= {"Select a course","BSc Hons Computer Science","BBA","BCA","CSIT"};
		courseComboBox=new JComboBox(courses);
		courseComboBox.setBounds(210,480,300,30);
		courseComboBox.setFont(new Font("Arial",Font.PLAIN,20));
		courseComboBox.setBorder(BorderFactory.createEmptyBorder());
		courseComboBox.setBackground(Color.white);
                courseComboBox.addMouseListener(this);
		this.add(courseComboBox);
                courseComboBox.setVisible(false);
                
		//Create Button
		create=new JButton("Create");
		create.setBounds(250,530,200,30);
		create.setBackground(new Color(73, 79, 85));
		create.setForeground(Color.WHITE);
		create.addMouseListener(this);
		create.setFont(new Font(null,Font.PLAIN,16));
		create.setBorder(BorderFactory.createEmptyBorder());
		create.addActionListener(this);
		create.setFocusable(false);
		this.add(create);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700,700);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String username=usernameField.getText();
		String email=emailField.getText();
		String phoneNumber=phoneNumField.getText();
		char[] confirmPassword=confirmPasswordField.getPassword();
		String userMode=userComboBox.getSelectedItem().toString();
                String studentCourse=courseComboBox.getSelectedItem().toString();
		char[] password=passwordField.getPassword();
		//email regular expression
		emailRegex="[a-zA-z0-9_\\-\\.]+[@][a-z]+[\\.][a-z]{2,3}";
		String phoneNumRegex="[9][0-9]{9}";
//		compiling emailregex using pattern
		emailPattern=Pattern.compile(emailRegex);
		Pattern phoneNumPattern=Pattern.compile(phoneNumRegex);
		
	
			if(username.equals("")||phoneNumber.equals("")||email.equals("")||userMode.equals("Select User Mode")||password.length==0||confirmPassword.length==0) {
				JOptionPane.showMessageDialog(this, "Please fill up all the fields");
				}
                 
                        else if(userMode.equals("Student")&& studentCourse.equals("Select a course")){
                            JOptionPane.showMessageDialog(this, "Please fill up all the fields");
                        }
                        
			else {
					//cheking if pattern and entered email mathches
					if(emailPattern.matcher(emailField.getText()).matches()) {
						email=emailField.getText();
						emailField.setBorder(BorderFactory.createLineBorder(Color.gray));
					}
					else {
						emailField.setBorder(BorderFactory.createLineBorder(Color.red,2));
					}
					if(phoneNumPattern.matcher(phoneNumField.getText()).matches()) {
						phoneNumber=phoneNumField.getText();
						phoneNumField.setBorder(BorderFactory.createLineBorder(Color.gray));
					}
					//checking validity of phone Number
					else {
						phoneNumField.setBorder(BorderFactory.createLineBorder(Color.red,2));
					}
					if(!emailPattern.matcher(emailField.getText()).matches()||!phoneNumPattern.matcher(phoneNumField.getText()).matches()) {
						JOptionPane.showMessageDialog(this, "Please Enter Valid Inputs","Invalid Inputs",JOptionPane.ERROR_MESSAGE);
					}
					char[] passwordChars = password; // Assuming password is char[]
			        char[] confirmPasswordChars = confirmPassword; // Assuming confirmPassword is char[]
			        //checking if password and confirmpassword match
			        if(Arrays.equals(passwordChars, confirmPasswordChars)) {
			        	passwordField.setBorder(BorderFactory.createLineBorder(Color.gray));
			    		confirmPasswordField.setBorder(BorderFactory.createLineBorder(Color.gray));
			        }
			        if (!Arrays.equals(passwordChars, confirmPasswordChars)) {
			            JOptionPane.showMessageDialog(this, "Passwords do not match");
			            passwordField.setBorder(BorderFactory.createLineBorder(Color.red,2));
			            confirmPasswordField.setBorder(BorderFactory.createLineBorder(Color.red,2));
			     
			        }
			 
				    else if(emailPattern.matcher(emailField.getText()).matches() &&
				    		phoneNumPattern.matcher(phoneNumField.getText()).matches() && Arrays.equals(passwordChars, confirmPasswordChars)){
				    		passwordField.setBorder(BorderFactory.createLineBorder(Color.gray));
				    		confirmPasswordField.setBorder(BorderFactory.createLineBorder(Color.gray));
				    	 try {
			
						    	Conn c=new Conn();
                                                        //sending values to signup
								String query="insert into signup values('"+username.trim()+"','"+phoneNumber+"','"+userMode+"','"+new String(passwordChars)+"','"+email+"','"+studentCourse+"')";
								c.s.executeUpdate(query);
								String[] response= {"OK"};
								String successTitle="SignIn Successful!!";
								this.dispose();
								new Home(userMode).setVisible(true);
								JOptionPane.showOptionDialog(this, "Welcome to the Course Management System", successTitle, JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, titleImg, response, 0);
						    }
						    catch(Exception ae){
						    	ae.printStackTrace();
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
		if(e.getSource()==create) {
			create.setBackground(Color.black);
			create.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==create) {
			create.setBackground(new Color(73, 79, 85));
		}
	}

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange()==ItemEvent.SELECTED){
            if(userComboBox.getSelectedItem().toString().equals("Student")){ 
                courseComboBox.setVisible(true);
            }
            else if(!userComboBox.getSelectedItem().toString().equals("Student")){
                courseComboBox.setVisible(false);
            }
            
        }
    }
}

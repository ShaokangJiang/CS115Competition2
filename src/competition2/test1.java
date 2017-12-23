package competition2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class test1 extends JFrame {

	private JPanel contentPane;
	private JTextField ID;
	private JTextField First;
	private JTextField Last;
	private JTextField Math;
	private JTextField Science;
	private JTextField History;
	private JTextField Physics;

	/**
	 * Launch the application.
	 * @author Shaokang Jiang
	 * @throws IOException 
	 */


	public static void main(String[] args) throws IOException {
		FileOutputStream myfile1=new FileOutputStream("Grade Standard output.txt");
		PrintWriter myPW=new PrintWriter(myfile1);
		for(int i=0;i<58;i++) myPW.print("- ");
		myPW.println();
		myPW.println("A number\t First name\t Last name\t Math\t Science\t History\t Physics\t Average\t");
		for(int i=0;i<58;i++) myPW.print("- ");
		myPW.println();
		myPW.close();
		myfile1.close();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test1 frame = new test1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test1() {
		setTitle("tester program");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		ID = new JTextField();
		ID.setText("A00000000");
		ID.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Hello! This is a tester program for class Student");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JLabel lblPleaseEnterSome = new JLabel("Please enter some details about student: ");
		
		JLabel lblId = new JLabel("ID: ");
		
		First = new JTextField();
		First.setText("");
		First.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First name: ");
		
		Last = new JTextField();
		Last.setText("");
		Last.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last name: ");
		
		JLabel lblGrade = new JLabel("Grade: ");
		
		JLabel lblMath = new JLabel("Math: ");
		
		Math = new JTextField();
		Math.setColumns(10);
		
		Science = new JTextField();
		Science.setColumns(10);
		
		JLabel lblScience = new JLabel("Science: ");
		
		History = new JTextField();
		History.setColumns(10);
		
		JLabel lblHistory = new JLabel("History: ");
		
		Physics = new JTextField();
		Physics.setColumns(10);
		
		JLabel lblPhysics = new JLabel("Physics:");
		
		JButton Next = new JButton("Next -->");
		Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileOutputStream myfile1 = new FileOutputStream("Grade Standard output.txt",true);
					PrintWriter myPW=new PrintWriter(myfile1);
					Student ss = new Student(ID.getText(), First.getText(), Last.getText(), Double.parseDouble(Math.getText()), Double.parseDouble(Science.getText()), Double.parseDouble(History.getText()), Double.parseDouble(Physics.getText()));
					String h = "\t";
					if(First.getText().length()<=6) h += "\t";  
					String b = "\t";
					if(Last.getText().length()<=6) b += "\t";  
					myPW.print(ID.getText() + "\t" + " " + First.getText() + h +" " +Last.getText() + b + " " +Double.parseDouble(Math.getText()) + "\t" + " " +Double.parseDouble(Science.getText()) + "\t" + "\t" +" " +Double.parseDouble(History.getText()) + "\t" + "\t" +" " +Double.parseDouble(Physics.getText()) + "\t" + "\t" +" ");
					myPW.printf("%.2f", ss.Average());
					myPW.println("");
					myPW.close();
					myfile1.close();
					ID.setText("A00000000");
					First.setText("");
					Last.setText("");
					Math.setText("");
					Physics.setText("");
					History.setText("");
					Science.setText("");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Something goes error, Please try again later.");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Something goes error, Please try again later.\nPlease make sure the work space can be written.");
				}
				
			}
		});
		
		JButton Finish = new JButton("Finish");
		Finish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileOutputStream myfile1 = new FileOutputStream("Grade Standard output.txt",true);
					PrintWriter myPW=new PrintWriter(myfile1);
					Student ss = new Student(ID.getText(), First.getText(), Last.getText(), Double.parseDouble(Math.getText()), Double.parseDouble(Science.getText()), Double.parseDouble(History.getText()), Double.parseDouble(Physics.getText()));
					String h = "\t";
					if(First.getText().length()<=6) h += "\t";  
					String b = "\t";
					if(Last.getText().length()<=6) b += "\t";  
					myPW.print(ID.getText() + "\t" + " " + First.getText() + h +" " +Last.getText() + b + " " +Double.parseDouble(Math.getText()) + "\t" + " " +Double.parseDouble(Science.getText()) + "\t" + "\t" +" " +Double.parseDouble(History.getText()) + "\t" + "\t" +" " +Double.parseDouble(Physics.getText()) + "\t" + "\t" +" ");
					myPW.printf("%.2f", ss.Average());
					if(Last.getText().equals("")) myPW.println("null");
					myPW.println("");
					myPW.close();
					myfile1.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Something goes error, Please try again later.");
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Something goes error, Please try again later.\nPlease make sure the work space can be written.");
					e1.printStackTrace();
				}
				Frame2 f2 = new Frame2();
		        f2.setVisible(true);
			}
		});
		
		JLabel lblClickFinishTo = new JLabel("Click finish to get standard output, click next to input next student information.");
		
		JLabel lblAuthorShaokangJiang = new JLabel("Author: Shaokang Jiang");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblClickFinishTo)
							.addContainerGap())
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblGrade, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
									.addGap(572))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblId)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(ID, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(lblFirstName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addComponent(lblPleaseEnterSome))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(First, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(Last, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
									.addGap(84))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 442, GroupLayout.PREFERRED_SIZE)
									.addContainerGap()))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblAuthorShaokangJiang)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblMath)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(Math, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(lblScience)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(Science, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(lblHistory)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(History, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(lblPhysics)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(Physics, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
								.addGap(69)))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(98)
					.addComponent(Finish, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(67)
					.addComponent(Next, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(247, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPleaseEnterSome)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(ID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblId)
								.addComponent(lblFirstName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(First, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblGrade)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(lblLastName))
								.addComponent(Last, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(30)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(lblScience))
								.addComponent(Physics, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(History, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblMath)
										.addComponent(Math, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addComponent(Science, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblHistory))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblPhysics)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblClickFinishTo)
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(Finish, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(Next, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
						.addComponent(lblAuthorShaokangJiang)))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

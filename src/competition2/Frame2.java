package competition2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class Frame2 extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JButton btnNewButton;
	private JLabel lblAtThe;
	private JLabel lblOtherwiseSoftwareWill;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
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
	public Frame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 243);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("The file output to :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		text1 = new JTextField();
		text1.setText("Click ... to choose file location");
		text1.setColumns(10);
		
		JButton button = new JButton("...");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser();
				jfc.setCurrentDirectory(new File("d://"));
				int state = jfc.showOpenDialog(null);
				if (state == 1) {
					return;
				} else {
					File f = jfc.getSelectedFile();
					text1.setText(f.getAbsolutePath());
				}
			}
		});
		
		btnNewButton = new JButton("Do it!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path = text1.getText();
		          String pattern = ".*.txt.*";
		             if(Pattern.matches(pattern, path)==false) {
		               path += ".txt";
		             }
		         copyFile("Grade Standard output.txt", path);
		         JOptionPane.showMessageDialog(null, "Thank you for your use!\n Click ok to close.");
		         System.exit(0);
			}
		});
		
		lblAtThe = new JLabel("At the file name place, write down which name you want, ");
		
		lblOtherwiseSoftwareWill = new JLabel("otherwise software will use Grade Standard output.txt");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(141)
							.addComponent(btnNewButton))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(23)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(52)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblOtherwiseSoftwareWill)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(text1, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(button)))))
					.addContainerGap(67, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(40, Short.MAX_VALUE)
					.addComponent(lblAtThe)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAtThe)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblOtherwiseSoftwareWill)
					.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(text1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addGap(18)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
	public static void copyFile(String oldPath, String newPath) { 
		try { 
		int bytesum = 0; 
		int byteread = 0; 
		File oldfile = new File(oldPath); 
		if (oldfile.exists()) { 
		InputStream inStream = new FileInputStream(oldPath); 
		FileOutputStream fs = new FileOutputStream(newPath); 
		byte[] buffer = new byte[1444]; 
		int length; 
		while ( (byteread = inStream.read(buffer)) != -1) { 
		bytesum += byteread; 
		//System.out.println(bytesum); 
		fs.write(buffer, 0, byteread); 
		} 
		inStream.close(); 
		} 
		} 
		catch (Exception e) { 
		JOptionPane.showMessageDialog(null, "Something goes error, Please try again later.\nPlease make sure the work space can be written.");
		e.printStackTrace(); 

		} 

		} 
}

package project14;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


class Password extends JFrame{
	JPasswordField jpf=new JPasswordField(10);
	public Password() {
		setLayout(new FlowLayout());
		add(new JLabel("Write Password: "));
		add(jpf);
		jpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message="Wrong password";
				JPasswordField pass=(JPasswordField)e.getSource();
				if("CorrectPassword".equals(new String(pass.getPassword())))
					message="Right password";
				JOptionPane.showMessageDialog(null, message, "info", JOptionPane.INFORMATION_MESSAGE);
				}
			
		});
	}
}

public class CheckPasword {
public static void main(String[] args) {
	run(new Password(),300,150);
}
public static void run(final Password button1, final int width, final int height) {
	   SwingUtilities.invokeLater(new Runnable() {
	     public void run() {
	   	  button1.setTitle(button1.getClass().getSimpleName());
	   	  button1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   	  button1.setSize(width, height);
	   	  button1.setVisible(true);
	     }
	   });
	 }
	} 


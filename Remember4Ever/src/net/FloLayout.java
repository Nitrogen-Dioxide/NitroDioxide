package net;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class FloLayout extends JFrame{
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passField;
	
	public FloLayout(){
		super("Hello");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("Enter text here");
		add(item2);
		
		item3 = new JTextField("uneditable", 20);
		item3.setEditable(false);
		add(item3);
		
		passField = new JPasswordField("Your Pass");
		add(passField);
		
		thehandler handler = new thehandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passField.addActionListener(handler);
	}
	
	public class thehandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			String str = "";
			if(event.getSource()==item1)
				str=String.format("field 1: %s", event.getActionCommand());
			else if(event.getSource()==item2)
				str=String.format("field 2: %s", event.getActionCommand());
			else if(event.getSource()==item3)
				str=String.format("field 3: %s", event.getActionCommand());
			else if(event.getSource()==passField)
				str=String.format("pass field: %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, str);
			System.out.println(str);
		}
	}
}

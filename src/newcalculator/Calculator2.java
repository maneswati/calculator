package newcalculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator2 extends JFrame {

	private JPanel contentPane;
	private JTextField txt;
	
	double num1,num2, result;
	String operation, answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator2 frame = new Calculator2();
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
	public Calculator2() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt = new JTextField();
		txt.setBounds(31, 11, 366, 40);
		contentPane.add(txt);
		txt.setColumns(10);
		
		JButton btnno1 = new JButton("1");
		btnno1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enternumber=txt.getText()+btnno1.getText();	
				txt.setText(enternumber);
			}
		});
		btnno1.setBounds(10, 139, 59, 35);
		contentPane.add(btnno1);
		
		JButton btnno2 = new JButton("2");
		btnno2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enternumber=txt.getText()+btnno2.getText();	
				txt.setText(enternumber);
			}
		});
		btnno2.setBounds(95, 139, 49, 35);
		contentPane.add(btnno2);
		
		JButton btnno3 = new JButton("3");
		btnno3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enternumber=txt.getText()+btnno3.getText();	
				txt.setText(enternumber);
			}
		});
		btnno3.setBounds(175, 139, 49, 35);
		contentPane.add(btnno3);
		
		JButton btnno4 = new JButton("4");
		btnno4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enternumber=txt.getText()+btnno4.getText();	
				txt.setText(enternumber);
			}
		});
		btnno4.setBounds(10, 209, 59, 40);
		contentPane.add(btnno4);
		
		JButton btnno5 = new JButton("5");
		btnno5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enternumber=txt.getText()+btnno5.getText();	
				txt.setText(enternumber);
			}
		});
		btnno5.setBounds(95, 209, 49, 40);
		contentPane.add(btnno5);
		
		JButton btnno6 = new JButton("6");
		btnno6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enternumber=txt.getText()+btnno6.getText();	
				txt.setText(enternumber);
			}
		});
		btnno6.setBounds(175, 209, 49, 40);
		contentPane.add(btnno6);
		
		JButton btnno7 = new JButton("7");
		btnno7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enternumber=txt.getText()+btnno7.getText();	
				txt.setText(enternumber);
			}
		});
		btnno7.setBounds(10, 288, 60, 35);
		contentPane.add(btnno7);
		
		JButton btnno8 = new JButton("8");
		btnno8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enternumber=txt.getText()+btnno8.getText();	
				txt.setText(enternumber);
			}
		});
		btnno8.setBounds(95, 288, 49, 35);
		contentPane.add(btnno8);
		
		JButton btnno9 = new JButton("9");
		btnno9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enternumber=txt.getText()+btnno9.getText();	
				txt.setText(enternumber);
			}
		});
		btnno9.setBounds(175, 288, 49, 35);
		contentPane.add(btnno9);
		
		JButton btnno0 = new JButton("0");
		btnno0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enternumber=txt.getText()+btnno0.getText();	
				txt.setText(enternumber);
			}
		});
		btnno0.setBounds(95, 355, 49, 34);
		contentPane.add(btnno0);
		
		JButton btnnoc = new JButton("C");
		btnnoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				txt.setText(null);
				
			}
		});
		btnnoc.setBounds(269, 139, 49, 35);
		contentPane.add(btnnoc);
		
	
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//String enternumber=txt.getText()+btndiv.getText();	
				//txt.setText(enternumber);
				
				num1=Double.parseDouble(txt.getText());
				txt.setText("");
				operation= "/";
			}
		});
		btndiv.setBounds(351, 209, 46, 40);
		contentPane.add(btndiv);
		
		JButton btninto = new JButton("*");
		btninto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//String enternumber=txt.getText()+btninto.getText();	
				//txt.setText(enternumber);
				
				num1=Double.parseDouble(txt.getText());
				txt.setText("");
				operation= "*";
			}
		});
		btninto.setBounds(269, 209, 49, 35);
		contentPane.add(btninto);
		
		JButton btnpoint = new JButton(".");
		btnpoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enternumber=txt.getText()+btnpoint.getText();	
				txt.setText(enternumber);
			}
		});
		btnpoint.setBounds(10, 355, 60, 37);
		contentPane.add(btnpoint);
		
		JButton btnmod = new JButton("%");
		btnmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enternumber=txt.getText()+btnmod.getText();	
				txt.setText(enternumber);
				
				num1=Double.parseDouble(txt.getText());
				txt.setText("");
				operation= "%";
			}
		});
		btnmod.setBounds(175, 355, 56, 34);
		contentPane.add(btnmod);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//String enternumber=txt.getText()+btnminus.getText();	
				//txt.setText(enternumber);
				
				num1=Double.parseDouble(txt.getText());
				txt.setText("");
				operation= "-";
			}
		});
		btnminus.setBounds(272, 288, 49, 35);
		contentPane.add(btnminus);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//String enternumber=txt.getText()+btnplus.getText();	
				//txt.setText(enternumber);
				
				num1=Double.parseDouble(txt.getText());
				txt.setText("");
				operation= "+";
			}
		});
		btnplus.setBounds(351, 288, 46, 35);
		contentPane.add(btnplus);
		
		JButton btnminusbracket = new JButton("(-");
		btnminusbracket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//String enternumber=txt.getText()+btnminusbracket.getText();	
				//txt.setText(enternumber);
				
			double	ops=Double.parseDouble(String.valueOf( txt.getText()));
			ops=ops*(-1);
			txt.setText(String.valueOf(ops));
				}
		});
		btnminusbracket.setBounds(272, 355, 49, 34);
		contentPane.add(btnminusbracket);
		
		JButton btnequalto = new JButton("=");
		btnequalto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				
				String answer;
				num2=Double.parseDouble(txt.getText());
				if(operation =="+")
				{
					result=num1+num2;
					answer=String.format("%.2f", result);
					txt.setText(answer);
				}
				
				else if(operation =="-")
				{
					result=num1-num2;
					answer=String.format("%.2f", result);
					txt.setText(answer);
				}
				
				else if(operation =="*")
				{
					result=num1*num2;
					answer=String.format("%.2f", result);
					txt.setText(answer);
				}
				
				else if(operation =="/")
				{
					result=num1/num2;
					answer=String.format("%.2f", result);
					txt.setText(answer);
				}
				
				if(operation =="%")
				{
					result=num1%num2;
					answer=String.format("%.2f", result);
					txt.setText(answer);
				}
			}
		});
		btnequalto.setBounds(351, 355, 46, 34);
		contentPane.add(btnequalto);
		
		JButton btnback = new JButton("<-");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace=null;
				if(txt.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(txt.getText());
					str.deleteCharAt(txt.getText().length()-1);
					backspace=str.toString();
					txt.setText(backspace);
					
				}
			}
		});
		btnback.setBounds(351, 139, 46, 35);
		contentPane.add(btnback);
	}
}

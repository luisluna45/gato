package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculadora {

	private JFrame frame;
	private JTextField txtDisplay;
	double num1;
	double num2;
	double resultado;
	String res;
	String operacion;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 264, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtDisplay.setBounds(10, 22, 229, 34);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String EnterNumber=txtDisplay.getText()+btn7.getText();
			txtDisplay.setText(EnterNumber);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 139, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(70, 139, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(129, 139, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operacion = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMult.setBounds(189, 261, 50, 50);
		frame.getContentPane().add(btnMult);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 200, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(70, 200, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(129, 200, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operacion = "-";
				
			}
		});
		btnMenos.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMenos.setBounds(189, 200, 50, 50);
		frame.getContentPane().add(btnMenos);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 261, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=txtDisplay.getText()+btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
			
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(70, 257, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(129, 261, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnMas = new JButton("+");
		btnMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operacion = "+";
				
			}
		});
		btnMas.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMas.setBounds(189, 139, 50, 50);
		frame.getContentPane().add(btnMas);
		
		JButton btnP = new JButton(".");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btnP.getText();
				txtDisplay.setText(EnterNumber);
				
			}
		});
		btnP.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnP.setBounds(10, 318, 50, 50);
		frame.getContentPane().add(btnP);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(70, 318, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String res;
				num2=Double.parseDouble(txtDisplay.getText());
				if(operacion=="+")
				{
					resultado= num1+num2;
					res=String.format("%.2f", resultado);
					txtDisplay.setText(res);					
				}else if(operacion=="-")
				{
					
					resultado=num1-num2;
					res=String.format("%.2f", resultado);
					txtDisplay.setText(res);
				}else if(operacion=="*")
				{
					resultado=num1*num2;
					res=String.format("%.2f", resultado);
					txtDisplay.setText(res);
				}else if(operacion=="/")
				{
					resultado=num1/num2;
					res=String.format("%.2f", resultado);
					txtDisplay.setText(res);
				}else if(operacion=="%")
				{
					resultado=num1%num2;
					res=String.format("%.2f", resultado);
					txtDisplay.setText(res);
					
				}
	
			}
		});
		btnEq.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEq.setBounds(189, 318, 50, 50);
		frame.getContentPane().add(btnEq);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operacion = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv.setBounds(129, 318, 50, 50);
		frame.getContentPane().add(btnDiv);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				txtDisplay.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBounds(98, 78, 50, 50);
		frame.getContentPane().add(btnC);
		
		JButton btnPorciento = new JButton("%");
		btnPorciento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operacion = "%";
			}
		});
		btnPorciento.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPorciento.setBounds(175, 78, 64, 50);
		frame.getContentPane().add(btnPorciento);
		
		JButton btnDel = new JButton("del");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String del=null;
				if(txtDisplay.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					del=strB.toString();
					txtDisplay.setText(del);
					
				}
			}
		});
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDel.setBounds(21, 78, 67, 50);
		frame.getContentPane().add(btnDel);
	}
}

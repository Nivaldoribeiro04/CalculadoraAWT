package eiita;
import java.awt.*;
import java.awt.event.*;
public class Calculadora implements ActionListener{
	Frame f;
	TextField tf1;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bcll,bdiv,bmut,bigl;
	Panel p1,p2,p3,p4;
		
		Calculadora(){
			f = new Frame();
			f.setVisible(true);
			f.setSize(300,400);
			f.setLocationRelativeTo(null);
			f.setLayout(new GridLayout(5,1));
			tf1 = new TextField();
			f.add(tf1);
			
			b0 = new Button("0");
			b0.addActionListener(this);
			
			b1 = new Button("1");
			b1.addActionListener(this);
			
			b2 = new Button("2");
			b2.addActionListener(this);
			
			b3 = new Button("3");
			b3.addActionListener(this);
			
			b4 = new Button("4");
			b4.addActionListener(this);
			
			b5 = new Button("5");
			b5.addActionListener(this);
			
			b6 = new Button("6");
			b6.addActionListener(this);
		
			b7 = new Button("7");
			b7.addActionListener(this);
			
			b8 = new Button("8");
			b8.addActionListener(this);
			
			b8 = new Button("8");
			b8.addActionListener(this);
			
			b9 = new Button("9");
			b9.addActionListener(this);
			
			badd = new Button("+");
			badd.addActionListener(this);
			
			bsub = new Button("-");
			bsub.addActionListener(this);
			
			bmut = new Button("X");
			bmut.addActionListener(this);
			
			bdiv = new Button("/");
			bdiv.addActionListener(this);
			
			bigl = new Button("=");
			bigl.addActionListener(this);
			bcll = new Button("CLL");
			bcll.addActionListener(this);
			
			p1 = new Panel();
			p1.setLayout(new GridLayout(1,4));
			p1.add(b7);
			p1.add(b8);
			p1.add(b9);
			p1.add(bmut);
			f.add(p1);
			
			p2 = new Panel();
			p2.setLayout(new GridLayout(1,4));
			p2.add(b4);
			p2.add(b5);
			p2.add(b6);
			p2.add(bsub);
			f.add(p2);
			
			p3 = new Panel();
			p3.setLayout(new GridLayout(1,4));
			p3.add(b1);
			p3.add(b2);
			p3.add(b3);
			p3.add(badd);
			f.add(p3);
			
			p4 = new Panel();
			p4.setLayout(new GridLayout(1,4));
			p4.add(bdiv);
			p4.add(b0);
			p4.add(bcll);
			p4.add(bigl);
			f.add(p4);
			
			
			f.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					f.dispose();
				}
			});
		}
		
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		

		
	}

	int op;
	String memoria,atual;
	double resultado;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b0) {
			tf1.setText(tf1.getText()+"0");
			
		}
		if(e.getSource()==b1) {
			tf1.setText(tf1.getText()+"1");
			
		}
		if(e.getSource()==b2) {
			tf1.setText(tf1.getText()+"2");
			
		}
		if(e.getSource()==b3) {
			tf1.setText(tf1.getText()+"3");
			
		}
		if(e.getSource()==b4) {
			tf1.setText(tf1.getText()+"4");
			
		}
		if(e.getSource()==b5) {
			tf1.setText(tf1.getText()+"5");
			
		}
		if(e.getSource()==b6) {
			tf1.setText(tf1.getText()+"6");
			
		}
		if(e.getSource()==b7) {
			tf1.setText(tf1.getText()+"7");
			
		}
		if(e.getSource()==b8) {
			tf1.setText(tf1.getText()+"8");
			
		}
		if(e.getSource()==b9) {
			tf1.setText(tf1.getText()+"9");
			
		}
		if(e.getSource()==badd) {
			memoria = tf1.getText();
			op = 1;
			tf1.setText("");
		}
		if(e.getSource()==bmut) {
			memoria = tf1.getText();
			op = 2;
			tf1.setText("");
			
		}
		if(e.getSource()==bsub) {
			memoria = tf1.getText();
			op = 3;
			tf1.setText("");
			
		}
		if(e.getSource()==bdiv) {
			memoria = tf1.getText();
			op = 4;
			tf1.setText("");
			
		}
		if(e.getSource()==bcll) {
			memoria = "0";
			op = 0;
			tf1.setText("");
			
		}
		if(e.getSource()==bigl) {
			atual = tf1.getText();
			if(op==1) {
				resultado = Double.parseDouble(memoria)+ Double.parseDouble(atual);
				tf1.setText(String.valueOf(resultado));
			}else if(op==2) {
				resultado = Double.parseDouble(memoria)* Double.parseDouble(atual);
				tf1.setText(String.valueOf(resultado));
			}else if(op==3) {
				resultado = Double.parseDouble(memoria)- Double.parseDouble(atual);
				tf1.setText(String.valueOf(resultado));
			}else if(op==4) {
				resultado = Double.parseDouble(memoria)/ Double.parseDouble(atual);
				tf1.setText(String.valueOf(resultado));
			}
			
		}
		
	} 

}

package registartionform;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Table  extends Frame implements ActionListener{
	TextField ft;
	 TextField lt;
	 TextField dt;
	 TextField pt;
	 TextField nt;
	 TextArea main;
	 Checkbox c;
	 Checkbox c1;
	 Table() {
	Label l=new Label("Registration Form");
	l.setBounds(120, 40,130, 30);
	l.setBackground(Color.red);
	
		 
	Label first=new Label("First name");
   first.setBounds(30, 90, 60, 20);
   ft=new TextField();
   ft.setBounds(120, 90, 150, 20);
   
   Label last=new Label("Last name");
   last.setBounds(30, 120, 60, 20);
   lt=new TextField();
   lt.setBounds(120, 120, 150, 20);
   
   Label dob=new Label("D.O.B");
   dob.setBounds(30, 150, 60, 20);
   dt=new TextField();
   dt.setBounds(120, 150, 150, 20);
   
   Label gender=new Label("Gender");
   gender.setBounds(30, 180, 60, 20);
   CheckboxGroup cbg=new CheckboxGroup();
   c=new Checkbox("Male", true, cbg);
   c.setBounds(120, 180, 50, 20);
   c1=new Checkbox("Female", false, cbg);
   c1.setBounds(180, 180, 50, 20);
   
   
   
   Label place=new Label("Place");
   place.setBounds(30, 210, 60, 20);
   pt=new TextField();
   pt.setBounds(120, 210, 150, 20);
   
   Label number=new Label("PH:Num");
   number.setBounds(30, 240, 60, 20);
   nt=new TextField();
   nt.setBounds(120, 240, 150, 20);
   
   Button b=new Button("submit");
   b.setBackground(Color.gray);
   b.setBounds(100, 270, 80, 30);
   b.addActionListener(this);
   
   
  main=new TextArea();
   main.setBounds(30, 320, 250, 250);
   main.setBackground(Color.LIGHT_GRAY);
  
   
   
   
   
   add(l);
   add(first);
   add(ft);
   add(last);
   add(lt);
   add(dob);
   add(dt);
   add(gender);
   add(c);
   add(c1);
   add(place);
   add(pt);
   add(number);
   add(nt);
   add(b);
   add(main);
   
   
   setSize(500, 700);
   setLayout(null);
   setVisible(true);
   setBackground(Color.yellow);
	
	}
	 
	 public static void main(String[] args) {
		Table t=new Table();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String firstname=ft.getText();
		String last=lt.getText();
		String dob=dt.getText();
		String gender=c.getState()? c.getLabel() : c1.getLabel();  
		String place=pt.getText();
		String number=nt.getText();
		
		
		
		
		
		
		
		main.setText("FirstName: "+firstname+"\n"+"Lastname: "+last+"\n"+"Dob: "+dob+"\n"+"Gender: "+gender+"\n"+"Place: "+place+"\n"+"Ph Num: "+number+"");
		
	}

}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class quiz extends JFrame {
	
	public int count;
	private double choice1;
	
	private String choice;
	private JTextField instruct;
	private JTextField country;
	private JTextField yes;
	
	
	
	private JRadioButton op1;                                    
	private JRadioButton op2;
	private JRadioButton op3;
	private JRadioButton op4;
	
	private ButtonGroup grp;  
	
	
	

	Random rand= new Random();
	quiz2 obj1 = new quiz2();
	
	
	
	private static String[] country_name= {"netherlands","new zealand","south africa","zimbabwe","china","thailand","austria","spain","france","brazil","germany","australia","switzerland","srilanka","italy","south korea","aegentina","canada","united kingdom","denmark","hungary","indonesia","latvia","india","russia","singapore"};
	private static String[] capital= {"amsterdam","wellington","cape town","harare","beijing","bankok","vienna","madrid","paris","brasilla","berlin","canberra","bern","colombo","rome","seoul","buenos aires","ottawa","london","copenhagen","budapest","jakarta","riga","new delhi","moscow","singapore"};
	
	
	
	public quiz(){
		 super("***COUNTRY & CAPITAL***");
		 setLayout(new FlowLayout());
		 
		
			 setVisible(true);
			 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		     setSize(600,200);

		 int z= rand.nextInt(25);
		 int y= rand.nextInt(25);
		 if(y==z || y+1==z){
				y--;
				if(y<0);
				y=y+2;
				 
				}
		 
	
	
	      country= new JTextField("                                      "+country_name[z],50);
	      country.setBackground(Color.YELLOW);
	      instruct= new JTextField("            YOU HAVE TO CHOOSE THE CAPITAL OF THE GIVEN COUNTRY         ");
	      instruct.setBackground(Color.magenta);
	      instruct.setFont(new Font("Serif",Font.BOLD,15));

          add(instruct);
          add(country);
          
          //yes= new JTextField("",50);
          //yes.setBackground(Color.GREEN);
          
          //String s2= new String("                      CONGRATULATIONS!!!.....It's CORRECT                ");
          //String s1= new String("                          OOPS!!!....incorrect choice                    ");
          
          
          op1=new JRadioButton(capital[y]);
          op2=new JRadioButton(capital[z]);
          op3=new JRadioButton(capital[y+1]);
          op4=new JRadioButton(capital[z+1]);
          
          grp= new ButtonGroup();                               //adding buttons to group button
		  grp.add(op1);
		  grp.add(op2);
		  grp.add(op3);
		  grp.add(op4);
		  
		  
          
          
		  add(op1);
          add(op2);
          add(op3);
          add(op4);
         // add(yes);
          
          JButton msg= new JButton(new AbstractAction("  HOW IT WORKS  "){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					JOptionPane.showMessageDialog(getParent(), "This is a quiz that works on core java.\n You will get a country randomly selected by the computer then you have to check the correct option, \nonce you have made your choice you have to submit the answer by clicking on SUBMIT button\n\ndeveloper: ADITYA SINGH");
				}
          }
							 
							 );
          add(msg);
          
          JButton msg1= new JButton(new AbstractAction("  SUBMIT  "){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					if(op2.isSelected())
					{	count+=10;
					JOptionPane.showMessageDialog(getParent(), "WELL DONE!!  CORRECT CHOICE\nYOUR SCORE : "+count);
					}
					else
						{count-=5;
						JOptionPane.showMessageDialog(getParent(), "OOPS!!   WRONG CHOICE!!\nThe correct answer is : "+capital[z]+"\nYOUR SCORE : "+count);
						}
					  choice=JOptionPane.showInputDialog("Do you want to play more \nPress 1 for YES\nPress 2 for NO");
						choice1=Double.parseDouble(choice);
						if(choice1==2)
						{
						JOptionPane.showMessageDialog(getParent(), "THANKS FOR PLAYING!!\nYOUR FINAL SCORE : "+count);
						setVisible(false);
						}
						else if(choice1==1){
							
							JOptionPane.showMessageDialog(getParent(),"please check the next window");
					        	setVisible(false);
					        	
					        	obj1.setVisible(true);
							    
							   
						}
						
				}
        }
							 
							 );
          add(msg1);
          add(msg);
      
        
	   
	}
          /*op1.addItemListener(new handler(s1));
        
          op2.addItemListener(new handler(s2));
          op3.addItemListener(new handler(s1));
          op4.addItemListener(new handler(s1));
          
          setVisible(false);
       }
	

	
	  private class handler implements ItemListener{
		  private String s;
		  
		  public handler(String ss){                              //constructor of handler class
			  s=ss;
			  }
		  public void itemStateChanged(ItemEvent event){               //here make sure that ''i'' of itemStateChanged is in lowercase
			  yes.setText(s);
		  }*/

	  
}	


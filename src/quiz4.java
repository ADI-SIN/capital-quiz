
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class quiz4 extends JFrame {
	
	public int count1;
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
	
	
	
	
	
	private static String[] country_name= {"china","thailand","austria","spain","france","brazil","germany","australia","switzerland","srilanka","italy","south korea"};
	private static String[] capital= {"beijing","bankok","vienna","madrid","paris","brasilla","berlin","melbourne","geneva","colombo","rome","seoul"};
	
	
	
	public quiz4(){
		 super("***COUNTRY & CAPITAL***");
		 setLayout(new FlowLayout());
		 
		
			 setVisible(true);
			 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 setSize(600,200);
		//	 quiz2 obzx=new quiz2();
			
		 int z1= rand.nextInt(11);
		 int y1= rand.nextInt(11);
		 if(y1==z1 || y1+1==z1){
				y1--;
				if(y1<0);
				y1=y1+2;
				
				}
		 
	
	
	      country= new JTextField("                                      "+country_name[z1],50);
	      country.setBackground(Color.YELLOW);
	      instruct= new JTextField("            YOU HAVE TO CHOOSE THE CAPITAL OF THE GIVEN COUNTRY         ");
	      instruct.setBackground(Color.magenta);
	      instruct.setFont(new Font("Serif",Font.BOLD,15));

          add(instruct);
          add(country);
          
          
          
          op1=new JRadioButton(capital[y1+1]);
          op2=new JRadioButton(capital[y1]);
          op3=new JRadioButton(capital[z1]);
          op4=new JRadioButton(capital[z1+1]);
          
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
					
					if(op3.isSelected())
					{	count1+=10;
					JOptionPane.showMessageDialog(getParent(), "WELL DONE!!  CORRECT CHOICE\nYOUR SCORE : "+count1);
					}
					else
						{count1-=5;
						JOptionPane.showMessageDialog(getParent(), "OOPS!!   WRONG CHOICE!!\nThe correct answer is : "+capital[z1]+"\nYOUR SCORE : "+count1);
						}
		/*			  choice=JOptionPane.showInputDialog("Do you want to play more \nPress 1 for YES\nPress 2 for NO");
						choice1=Double.parseDouble(choice);
						if(choice1==2)
						{                    */
						JOptionPane.showMessageDialog(getParent(), "THANKS FOR PLAYING!!\n\n\tdeveloper ADITYA SINGH");
						setVisible(false);
					/*	}
						else if(choice1==1){
							
							JOptionPane.showMessageDialog(getParent(),"please check the second window");
					        	setVisible(false);
					        	
							    }
							   
					        */
						
				}
        }
							 
							 );
          add(msg1);
          add(msg);
       
	}

	  

}


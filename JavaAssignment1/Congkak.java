import java.util.Random;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Congkak {

	public static void Winner1()
	{
 		ImageIcon icon = new ImageIcon("player1WinFirework.gif");
 		JPanel panel = new JPanel();
 		panel.setBackground(new Color(255, 255, 255));

		panel.setSize(new Dimension(200, 64));
		panel.setLayout(null);
		JLabel label = new JLabel("Congratulations !!!");
		label.setBounds(0, 0, 200, 64);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);

		//size of pop out for word sections
		UIManager.put("OptionPane.minimumSize",new Dimension(700, 240));

		JOptionPane.showMessageDialog(null, panel, "Celebration Time",
		JOptionPane.PLAIN_MESSAGE, icon);
 	}
	public static void Winner2()
	{
 		ImageIcon icon = new ImageIcon("player2WinFirework.gif");
 		JPanel panel = new JPanel();
 		panel.setBackground(new Color(255, 255, 255));

		panel.setSize(new Dimension(200, 64));
		panel.setLayout(null);
		JLabel label = new JLabel("Congratulations !!!");
		label.setBounds(0, 0, 200, 64);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);

		//size of pop out for word sections
		UIManager.put("OptionPane.minimumSize",new Dimension(700, 240));
	
		JOptionPane.showMessageDialog(null, panel, "Celebration Time",
		JOptionPane.PLAIN_MESSAGE, icon);
 	}
	public static void minion()	
	{
 		ImageIcon icon = new ImageIcon("minion.gif");
 		JPanel panel = new JPanel();
 		panel.setBackground(new Color(255, 255, 255));

		panel.setSize(new Dimension(200, 64));
		panel.setLayout(null);
		JLabel label = new JLabel("Too bad Too sad");
		label.setBounds(0, 0, 200, 64);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);

		//size of pop out for word sections
		UIManager.put("OptionPane.minimumSize",new Dimension(700, 240));
	
		JOptionPane.showMessageDialog(null, panel, "Hehehe",
		JOptionPane.PLAIN_MESSAGE, icon);
	 }
    public static void winner(int home1, int home2, String p1, String p2) 
	{
        	if (home1 > home2)
		{
        	    System.out.println("Player 1, " + p1 + " wins");
		    Winner1();
        	}
		else if (home1 < home2)
		{
        	    System.out.println("Player 2, " + p2 + " wins");
		    Winner2();
        	}
		else if (home1 == home2)
        	{
		    System.out.println("It is a draw");
    		}
		minion();
		System.exit( 0 );
	}

	public static void makan()	
	{
 		ImageIcon icon = new ImageIcon("makan.gif");
 		JPanel panel = new JPanel();
 		panel.setBackground(new Color(255, 255, 255));

		panel.setSize(new Dimension(200, 64));
		panel.setLayout(null);
		JLabel label = new JLabel("Makan Time!!!");
		label.setBounds(0, 0, 200, 64);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);

		//size of pop out for word sections
		UIManager.put("OptionPane.minimumSize",new Dimension(700, 240));
	
		JOptionPane.showMessageDialog(null, panel, "Nom nom nom",
		JOptionPane.PLAIN_MESSAGE, icon);
	 }

    public static void main(String[] args) 
	{
        int[] hse = {7, 7, 7, 7, 7, 7, 7, 0, 7, 7, 7, 7, 7, 7, 7, 0};

        System.out.println("  ____                   _         _");
        System.out.println(" /  __| ___  _ __   __ _| | ____ _| | __");
        System.out.println("|  |   / _ \\| '_ \\ / _` | |/ / _` | |/ /");
        System.out.println("|  |__| (_) | | | | (_| |   < (_| |   <");
        System.out.println(" \\____|\\___/|_| |_|\\__, |_|\\_\\__,_|_|\\_\\ ");
        System.out.println("                   |___/");
        
	Scanner scanner = new Scanner(System.in); //allow comp to scan and know what is user input
        
	String player1, player2;
        System.out.print("Player 1: ");
        player1 = scanner.nextLine();
        System.out.print("Player 2: ");
        player2 = scanner.nextLine();
        System.out.println();
        
	Random random = new Random();
        int starter = (random.nextInt(2)) + 1;
        int pturn = starter;
        int choice;
        int loop=0;
        int marble;
        
	System.out.print("Randomly choosing starting player: ");
        switch (starter) 
	{
            case 1:
                System.out.println("Player 1, " + player1);
                break;
            case 2:
                System.out.println("Player 2, " + player2);
                break;
        }
        for (int k = 0; k < 16; k++) {
            System.out.println("House " + (k + 1) + ": " + hse[k]);
        }
        System.out.println();

	do{ 
  	  if(pturn==1)
   	 {
      	  do{
          	System.out.print("Player 1, "+ player1 +", please select a house(1-7): ");
         	choice = scanner.nextInt();

            	do{
                	if(choice!=1&&choice!=2&&choice!=3&&choice!=4&&choice!=5&&choice!=6&&choice!=7)
                	{
                	    System.out.print("Player 1, "+player1+", re-select a house(1-7): ");
                	    choice = scanner.nextInt();
                	}
                	else if(hse[choice-1]==0)
                	{
                	    System.out.print("This house is empty. Choose a different house(1-7): ");
                	    choice = scanner.nextInt();
                	}
            	}while((choice!=1&&choice!=2&&choice!=3&&choice!=4&&choice!=5&&choice!=6&&choice!=7) || hse[choice-1]==0);

            	marble=hse[choice-1];

            	switch(choice)
            	{
                	case 1:
                	case 2:
                	case 3:
                	case 4:
                	case 5:
                	case 6:
                	case 7:

                	hse[choice-1]=0;
                	int ori8= hse[7];
                	int ori16= hse[15];

                	for(int i=choice; i<16; i++)
                	{
                	    hse[i]+=1;
                	    marble-=1;
                	    loop=i;

                	    //if all, houses on player 1's side (house 1-7) are empty, end game
                	    if(i==7 &&marble==0)
                	    {
                	            if(hse[0]==0&&hse[1]==0&&hse[2]==0&&hse[3]==0&&hse[4]==0&&hse[5]==0&&hse[6]==0)
                	                break;
                	            else
                	                break;
                	    }

                    	    //To prevent player 1's marble from entering house 16/player 2's home
                    	    if(i==15 && (ori16!=hse[i]))
			    {
                    	    	hse[i]-=1;
                    	    	marble+=1;
                    	    }
	
         	            //'makan' action
                    	    if(hse[i]==1&&marble==0)
                    	    {
                        	if(i==0||i==1||i==2||i==3||i==4||i==5||i==6)
                       		{
                            		int makan=0;

                            		for(int m=0; m<16; m++)
                               		 	System.out.println("House " + (m+1) + ": " + hse[m]);
					
					makan();
                            		System.out.println("\nMakan time!!");
                            		makan = hse[i]+hse[14-i];
                            		hse[7]+=makan;
                            		hse[14-i]=0;
                            		hse[i]=0;
                            	}
                           	else
                            		break;
                    	    }

                   	    if(marble==0)
                        	break;

              		}

               		//When got too many marbles and need to put in starting from house 1 again
               		do{
                    	if(marble!=0)
                    	{
                        	for(int i=0; i<16; i++)
                        	{
                            		hse[i]+=1;
                            		marble-=1;
                            		loop=i;

                            		//if all, houses on player 1's side (house 1-7) are empty, end game
                            		if(i==7 && marble==0)
                            		{
                                		if(hse[0]==0&&hse[1]==0&&hse[2]==0&&hse[3]==0&&hse[4]==0&&hse[5]==0&&hse[6]==0)
                                 			break;
                      	        		else
                                    			break;
                     			}

                            		//To prevent player 1's marble entering house 16/player 2's home
                            		if(i==15 && (ori16!=hse[i]))
                            		{
                                		hse[15]-=1;
                                		marble+=1;
                            		}

                            		//'makan' action
                            		if(hse[i]==1&&marble==0)
                            		{
                                		if(i==0||i==1||i==2||i==3||i==4||i==5||i==6)
                                		{
                                    			int makan=0;

                                    			for(int m=0; m<16; m++)
                                        			System.out.println("House "+ (m+1) +": " +hse[m]);

							makan();
                                    			System.out.println("\nMakan time!!");
                                    			makan = hse[i]+hse[14-i];
                                    			hse[7]+=makan;
                                    			hse[14-i]=0;
                                    			hse[i]=0;
                               			}
                                		else
                                   			break;
                            		}

                            		if(marble==0)
                                		break;
                       		}
                    	}
                	}while(marble!=0);

                	for(int k=0; k<16; k++)
                    	System.out.println("House " + (k + 1) + ": " + hse[k]);

               		if(hse[0]==0&&hse[1]==0&&hse[2]==0&&hse[3]==0&&hse[4]==0&&hse[5]==0&&hse[6]==0)
                	{
                    		System.out.println("");
                    		winner(hse[7], hse[15], player1, player2);
                    		break;
                	}
                	else if(loop==7 && marble==0)
                	{
                    		System.out.println("\nAgain !!!");
                    		break;
                	}
                	else
                	{
                    		System.out.println("");
                    		pturn=2;
                	}

            	}
        }while(loop==7 && marble==0 && (hse[0]!=0||hse[1]!=0||hse[2]!=0||hse[3]!=0||hse[4]!=0||hse[5]!=0||hse[6]!=0));
    	}

    	if(pturn==2)
    	{
        	//do{
            	System.out.print("Player 2, " + player2 +", select a house(9-15): ");
            	choice = scanner.nextInt();

            	do{
                	if(choice!=9&&choice!=10&&choice!=11&&choice!=12&&choice!=13&&choice!=14&&choice!=15)
                	{
                    		System.out.print("Player 2, "+player2+", select a house(9-15): ");
                    		choice = scanner.nextInt();
                	}
                	else if(hse[choice-1]==0)
                	{
                    		System.out.print("This house is empty. Choose a different house(9-15): ");
                    		choice = scanner.nextInt();
                	}
            	}while((choice!=9&&choice!=10&&choice!=11&&choice!=12&&choice!=13&&choice!=14&&choice!=15) || hse[choice-1]==0);

            	marble=hse[choice-1];

            	switch(choice)
            	{
                	case 9:
                	case 10:
                	case 11:
                	case 12:
                	case 13:
                	case 14:
                	case 15:

                	hse[choice-1]=0;
                	int ori16= hse[15];
                	int ori8= hse[7];

                	for(int i=choice; i<16; i++)
                	{
                   	 hse[i]+=1;
                    	marble-=1;
                    	loop=i;

                    	//if all, houses on player 2's side (house 9-15) are empty, end game
                    	if(i==15 &&marble==0)
                    	{
                          	 if(hse[8]==0&&hse[9]==0&&hse[10]==0&&hse[11]==0&&hse[12]==0&&hse[13]==0&&hse[14]==0)
                               		break;
                           	 else
                                	break;
                    	}

                    	//To prevent player2's marble entering house 8/player 1's home
                    	if(i==7 && (ori8!=hse[i]))
                    	{
                        	hse[i]-=1;
                        	marble+=1;
                    	}

                    	//'makan' action
                    	if(hse[i]==1&&marble==0)
                    	{
                        	if(i==8||i==9||i==10||i==11||i==12||i==13||i==14)
                        	{
                            		int makan=0;

                            		for(int m=0; m<16; m++)
                                	System.out.println("House " + (m + 1) + ": " + hse[m]);

					makan();
                            		System.out.println("\nMakan time!!");
                            		makan = hse[i]+hse[14-i];
                            		hse[15]+=makan;
                            		hse[i]=0;
                            		hse[14-i]=0;
                    		}
                    		else
                        		break;
                    	}

                    	if(marble==0)
                        	break;
                	}


                	//When got too many marble and need to put in starting from house 1 again
               		do{
                    	if(marble!=0)
                    	{
                        	for(int i=0; i<16; i++)
                        	{
                            	hse[i]+=1;
                            	marble-=1;
                            	loop=i;

                            	//if all, houses on player 2's side (house 9-15) are empty, end game
                            	if(i==15&& marble==0)
                            	{
                                	if(hse[8]==0&&hse[9]==0&&hse[10]==0&&hse[11]==0&&hse[12]==0&&hse[13]==0&&hse[14]==0)
                                    		break;
                                	else
                                    		break;
                            	}

                            	//To prevent player 2's marble from entering house 8/player 1's home
                            	if(i==7 && (ori8!=hse[i]))
                            	{
                                	hse[i]-=1;
                                	marble+=1;
                            	}

                            	//'makan' action
                            	if(hse[i]==1&&marble==0)
                            	{
                                	if(i==8||i==9||i==10||i==11||i==12||i==13||i==14)
                                	{
                                    		int makan=0;

                                    		for(int m=0; m<16; m++)
                                        		System.out.println("House " + (m + 1) + ": " + hse[m]);

						makan();
                                    		System.out.println("\nMakan time!!");
                                    		makan = hse[i]+hse[14-i];
                                    		hse[15]+=makan;
                                    		hse[i]=0;
                                    		hse[14-i]=0;
                                	}
                                	else
                                    		break;
                            	}

                            	if(marble==0)
                                	break;
                        	}
                    	}
                	}while(marble!=0);

                	for(int k=0; k<16; k++)
                    		System.out.println("House " + (k + 1) + ": " + hse[k]);

                	if(hse[8]==0&&hse[9]==0&&hse[10]==0&&hse[11]==0&&hse[12]==0&&hse[13]==0&&hse[14]==0)
                	{
                    		System.out.println("");
                    		winner(hse[7], hse[15], player1, player2);
				System.out.println("\nDisclaimer: \nEnter an alphabet to exit the program.");
                   		break;
                	}
                	else if(loop==15 && marble==0)
                	{
                    		System.out.println("\nAgain !!!");
                    		break;
                	}
                	else
                	{
                    		System.out.println("");
                    		pturn=1;
               		}
        	}
        	//}while(loop==15 || marble==0);
    	}
}while((hse[0]!=0||hse[1]!=0||hse[2]!=0||hse[3]!=0||hse[4]!=0||hse[5]!=0||hse[6]!=0) || (hse[8]!=0||hse[9]!=0||hse[10]!=0||hse[11]!=0||hse[12]!=0||hse[13]!=0||hse[14]!=0));



} // end main

} // end congkak

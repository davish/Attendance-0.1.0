import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class DateWin extends JFrame{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static String date;
	private JLabel askDate1;
	private JLabel askDate2;
	private JTextField ansDate;
	Attendance Win = new Attendance();
	
	// Set the Date window
	public DateWin() {
		super("Attendance");
		setLayout(new FlowLayout());
		
		// Label
		askDate1 = new JLabel("Enter Date in the desired format, ");
		add(askDate1);
		
		askDate2 = new JLabel("but please no slashes (/)");
		add(askDate2);
		
		// Text Field
		ansDate = new JTextField("Enter the Date here");
		add(ansDate);
		
		thehandler handler = new thehandler();
		ansDate.addActionListener(handler);
		
	}
	// Event Handler
private class thehandler implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			// Get the date
			if(event.getSource() == ansDate) {
				// DateWin date
				date = event.getActionCommand();
				System.out.println("DateWin " + date);
				// Window title date
				AWin.date = date;
				System.out.println("AWin " + AWin.date);
				// File name date
				ASave.date = date;
				System.out.println("ASave " + ASave.date);
				
				JOptionPane.showMessageDialog(null, "Thank You, the date is " + date);
				Win.launchWindow();
				dispose();
			}
			
			
			
			
				
			
		}
	}
}




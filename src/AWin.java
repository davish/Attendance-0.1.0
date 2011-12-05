import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;


public class AWin extends JFrame{
	private static final long serialVersionUID = 1L;
	private JTextField checkin;
	private JTextField checkout;
	private JLabel checkinlabel;
	private JLabel checkoutlabel;
	private JButton List;
	private JButton Save;
	
	static String date;
	
	public static ArrayList<String> IsHere = new ArrayList<String>();
	
	public AWin() {
		super("Attendance on "+ date) ;
		setLayout(new FlowLayout());
		
		//Checkin objects
		checkinlabel = new JLabel("Check in");
		add(checkinlabel);
		
		checkin = new JTextField(20);
		add(checkin);
		
		// Checkout objects
		checkoutlabel = new JLabel("Check out");
		add(checkoutlabel);
		
		checkout = new JTextField(20);
		add(checkout);
		
		// Buttons
		List = new JButton("List Students");
		add(List);
		
		Save = new JButton("Save to File");
		add(Save);
		
		thehandler handler = new thehandler();
		checkin.addActionListener(handler);
		checkout.addActionListener(handler);
		List.addActionListener(handler);
		Save.addActionListener(handler);
		
	}
	
private class thehandler implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			// Check in to Attendance
			if(event.getSource() == checkin) {
				IsHere.add(event.getActionCommand());
			JOptionPane.showMessageDialog(null, "You have been checked in, " +event.getActionCommand());
			}
			// Check out of Attendance
			else if (event.getSource() == checkout) {
				IsHere.remove(event.getActionCommand());
				JOptionPane.showMessageDialog(null, "You have been checked out");
			}
			else if (event.getSource() == List) {
				JOptionPane.showMessageDialog(null, IsHere);
			}
			
			else if (event.getSource() == Save) {
				ASave.WriteToFile();
				JOptionPane.showMessageDialog(null, "The list has been saved as: " + ("Who is here on " + date +".txt"));
			}
			
			
			
				
			
			}
			
		}


}	

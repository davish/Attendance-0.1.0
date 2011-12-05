import javax.swing.JFrame;


public class Attendance {
	
	
	public static void main(String[] args) {
		//Open the Main window
		
		
		DateWin DWin = new DateWin();
		DWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DWin.setSize(260,180);
		DWin.setVisible(true); 
		
		}
	
	public void launchWindow() {
		AWin Win1 = new AWin();
		Win1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Win1.setSize(260,180);
		Win1.setVisible(true);
	}
}

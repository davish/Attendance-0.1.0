import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class ASave {
	AWin List = new AWin();
	static String date;
	
	
	public static void WriteToFile() {
		System.out.println("ASave" + date);
		String filename = ("Who is here on " + date +".txt");
		try {
			FileWriter outFile = new FileWriter(filename);
			PrintWriter out = new PrintWriter(outFile);
			
		
			// Write text to file
			out.println(AWin.IsHere); // TODO: Loop through to write times of checkin
			
			out.close();
		} catch (IOException e){
			e.printStackTrace();
		}
		
		 // Moving the file to the correct directory
		
		// Target
	    File file = new File(filename);
	    
	    // Destination
	    File dir = new File("Attendance Sheets");
	    
	    // Move
	    boolean success = file.renameTo(new File(dir, file.getName()));
	    if (!success) {
	        // File was not successfully moved
	    	System.out.println("File not successfully moved. :(");
	    } 
	}
	
		
}



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw=new PrintWriter(new File("bzdury.dat"));
		while(sc.hasNextLine()) {
			String s=sc.nextLine();
			
			if(s.equals("q"))
				break;
			
			pw.println(s);
			pw.flush();
		}
	}

}

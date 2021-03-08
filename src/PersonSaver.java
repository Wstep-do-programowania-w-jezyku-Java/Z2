import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PersonSaver {

	public static void main(String[] args) throws FileNotFoundException {
		String[] imiona=new String[5];
		String[] nazwiska= {"Nowak","Kowalski","Konopnicka","Kopytko","Brynkus"};
		int[] wiek = {23,43,56,43,12};
		
		imiona[0]="Jan";
		imiona[1]="Zbigniew";
		imiona[2]="Maria";
		imiona[3]="Teresa";
		imiona[4]="Tomasz";
		
//		ArraySaver.savePeople(imiona, nazwiska, wiek);
		printPeople();
		System.out.println("Koniec");
	}
	
	private static void printPeople() throws FileNotFoundException {
		Scanner sc=new Scanner(new File("osoby.dat"));
		while(sc.hasNextLine())
			System.out.println(sc.nextLine());
	}
}

class ArraySaver{
	public static void savePeople(String[] imiona,String[] nazwiska,int[] wiek) throws FileNotFoundException {
		PrintWriter pw=new PrintWriter(new File("osoby.dat"));
		for(int i=0;i<imiona.length;i++)
			pw.printf("Imię: %s, Nazwisko: %s, Wiek: %d.%n", imiona[i],nazwiska[i],wiek[i]);
		
		pw.flush();
	}
}

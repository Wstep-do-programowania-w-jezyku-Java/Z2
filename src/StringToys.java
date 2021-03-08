
public class StringToys {

	public static void main(String[] args) {
		String txt="Dzisiaj mamy poniedziałek. Czy jutro mamy wtorek?";
		int i=txt.lastIndexOf(".");
		
		
		System.out.println(txt.substring(i+2));
	}

}

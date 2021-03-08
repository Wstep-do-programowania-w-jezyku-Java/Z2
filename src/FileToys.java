import java.io.File;

public class FileToys {

	public static void main(String[] args) {
		File f=new File("/Users/lukaszbibrzycki/Dysk Google/UP/java");
		File[] files= f.listFiles();
		for(File file: files) {
			String path=file.getAbsolutePath();
			System.out.println(path.substring(path.lastIndexOf("/")+1));
		}
	}

}

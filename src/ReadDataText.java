import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataText {

	public static void main(String[] args) throws IOException {
		
		//Approach1 - Using file reader and buffered reader
		FileReader fr = new FileReader("D:\\EclipseWorkspace\\FileHanding\\src\\Sample.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
		
		//Approach2 - Using file and scanner class and loop
		File fl = new File("D:\\EclipseWorkspace\\FileHanding\\src\\Sample.txt");
		Scanner sc = new Scanner(fl);
		
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		sc.close();
		
		//Approach3 - Using file and scanner class and delimiter
		File fl1 = new File("D:\\EclipseWorkspace\\FileHanding\\src\\Sample.txt");
		Scanner sc1 = new Scanner(fl1);
		sc1.useDelimiter("\\Z");
		System.out.println(sc1.next());
		sc1.close();
	}

}

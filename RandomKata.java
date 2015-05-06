import java.util.*;

public class RandomKata
{
	
	public static void main (String [] miku)
	{	
		Random r = new Random();
		Scanner a = new Scanner (System.in);
	
		String [] kata = {
							"JAVA",
							"WHILE",
							"METHOD",
							"INT",
							"STRING",
							"FOR",
							"DOUBLE",
							"FLOAT",
							"SCANNER",
							"BUFEREDREADER"
						 };
		String random = (kata[new Random().nextInt(kata.length)]);
		int idx = new Random().nextInt(kata.length);
		String random = (kata[idx]);
		System.out.print ("Apa arti kata ini\t: "+ kata);
		
	}
}


import java.util.*;
public class DaftarIsi
{
	public static String daftar (String judul, String halaman)
	{
		String str = judul;
		for (int i = str.length(); i<50; i++)
			str = str + ".";
		str = str + " " + halaman;
		return str;
	}
	
	public static void databab() 
	{
	}
	public static void main (String [] miku)
	{
		Scanner a = new Scanner (System.in);
		System.out.println ("Masukkan Jumlah Bab\t: ");
		int jum = a.nextInt(); 	
		
		Scanner b = new Scanner (System.in);
		int i;
		String hal;
		String jud;
		for ( i = 0; i < jum; i++)
		{
				System.out.print ("Judul Bab\t: ");
				jud = b.nextLine();
			
				System.out.print ("Halaman Bab\t: ");
				hal = b.nextLine();
			
		}
		System.out.println (jud + hal);
		
		
		
	}
	
}

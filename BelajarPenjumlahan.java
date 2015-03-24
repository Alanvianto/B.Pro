import java.util.Scanner;

public class BelajarPenjumlahan
 
{
	public static void main(String [] miku) 
	{
		 
		int point = 0; 
		int hitung = 0; 
		String keluaran = ""; 
		Scanner a = new Scanner(System.in);
		
		System.out.print( "Masukkan jumlah soal yang diinginkan\t:");
		int JUMLAH_PERTANYAAN = a.nextInt();
		while (hitung < JUMLAH_PERTANYAAN) 
		{
			int angka1 = (int)(Math.random() * 20);
			int angka2 = (int)(Math.random() * 20);

			 
			System.out.println();
			
			System.out.println("============================");
			System.out.println();
			System.out.print( "Berapakah hasil dari " + angka1 + " + " + angka2 + "? ");
			int jawab = a.nextInt();

			if (angka1 + angka2 == jawab) 
			{
				point++;
				
			System.out.println("Jawaban Anda Benar.");

			}
			else
			System.out.println("Jawaban Anda salah.\n" + angka1 + " + " + angka2 + " seharusnya " + (angka1 + angka2));

			hitung++;
			keluaran += "\n" + angka1 + "+" + angka2 + "=" + jawab +
			((angka1 - angka2 == jawab) ? " benar" : " salah");
		}
		System.out.println();
		System.out.println("============================");
		System.out.println("Total point yang anda peroleh adalah " + (point*10) );
		System.out.println("Dengan jawaban yang benar adalah " + point );
	}
}

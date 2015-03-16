import java.util.*;
public class while1
{
	public static void main (String [] miku)
	{
		Scanner a = new Scanner (System.in);
		int sum=0;
		int count=0;
		double avg=0;
		int maks=0;
		int min=0;
		int input;
		System.out.print("Masukkan Jumlah Data : ");
		int jumlah = a.nextInt();
			while (count<jumlah)
			{
				System.out.println("===========================");
				System.out.print("Masukkan Data ke  " + (count + 1) + " : ");
				input=a.nextInt();
				sum+=input;
				if (input>maks)
					maks=input;
				
				if (min==0)
					min=input;
					
				if (input<min)
					min=input;
				count++;
			}
		avg=sum/(double)jumlah;
		System.out.println("===========================");
		System.out.println("Jumlah Data = "+sum);
		System.out.println("Rata - Rata Data = "+avg);
		System.out.println("Maksimal = "+maks);
		System.out.println("Minimal = "+min);
		System.out.print("===========================");
	}
}

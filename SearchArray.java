import java.util.*;
public class SearchArray
{
	public static void main(String [] miku)
	{
		Scanner a = new Scanner(System.in);
		int bil [] = new int[100]; 
		int cari;
		int idx=-1;
		
		for (int i=0;i<bil.length; i++)
		{
			bil [i] = (int)(Math.random()*100);
		}
		System.out.print("Masukan Angka :");
		cari = a.nextInt();
		
		int i = 0;
		do
		{		
			if (cari == bil[i])
			{
				idx = i;
			}
			i++;
		}
		while(i < bil.length);	
		System.out.println("Bilangan yang akan dicari berada di index : "+idx);
		}

}	

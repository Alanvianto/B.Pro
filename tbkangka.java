import java.util.*;

public class tbkangka
{
	public static void main ( String [] miku )
	{
		String [] label = {"Gambar","Angka"};
		int score = 0;
		int scor = 0;
		for (int j = 0; j < 12; j++)
		{
			int q = (int) (Math.random()+ 0.5);
			System.out.println ((j + 1 )+ " " + label[q]);
			if ( label [q]== label [1])
			score ++;
			if (label [q] == label [0])
			scor ++;
			if ( score > scor)
			{
				System.out.println ("");
				System.out.println ("** Pemenangnya adalah Gambar **");
				System.out.println ("");
			}
			else if ( score < scor)
			{
				System.out.println ("");
				System.out.println ("** Pemenangnya adalah Angka **");
				System.out.println ("");
			}
			else if (score == scor)
			{
				System.out.println ("");
				System.out.println ("** Seri **");
				System.out.println ("");
			}
		}
		System.out.println ("====Dengan Hasil Score====");
		System.out.println ("");
		System.out.println (label [0] +"\t= " + score);
		System.out.println (label [1] +"\t= " + scor);
	}
}

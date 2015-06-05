import java.util.Scanner;

 public class TebakUltah 
{
	public static void main(String[] miku) 
	{
		int hari = 0; 
		int jawaban;

		int[][][] tanggal = {
							{{ 1, 3, 5, 7},
							{ 9, 11, 13, 15},
							{17, 19, 21, 23},
							{25, 27, 29, 31}},
							{{ 2, 3, 6, 7},
							{10, 11, 14, 15},
							{18, 19, 22, 23},
							{26, 27, 30, 31}},
							{{ 4, 5, 6, 7},
							{12, 13, 14, 15},
							{20, 21, 22, 23},
							{28, 29, 30, 31}},
							{{ 8, 9, 10, 11},
							{12, 13, 14, 15},
							{24, 25, 26, 27},
							{28, 29, 30, 31}},
							{{16, 17, 18, 19},
							{20, 21, 22, 23},
							{24, 25, 26, 27},
							{28, 29, 30, 31}}
							};

		
		Scanner masukan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Apakah Ulang Tahun Anda dalam Himpunan " + (i + 1) + "?");
			for (int j = 0; j < 4; j++) 
			{
				for (int k = 0; k < 4; k++)
				System.out.printf("%4d", tanggal[i][j][k]);
				System.out.println();
			}
			System.out.print("\nMasukkan 0 untuk Tidak dan 1 untuk Ya: ");
			jawaban = masukan.nextInt();

			if (jawaban == 1)
			hari += tanggal[i][0][0];
		}

		System.out.println("Hari Ultah Anda adalah " + hari);
	}
}

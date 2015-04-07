import java.util.*;
public class arrpenjualan
{
	public static void main (String [] miku)
	{
		int [][]databrg = {{10,4,12,2},
						{3,5,8,9},
						{2,10,6,2},
						{12,8,7,4},
						{9,5,5,11},
						{10,4,4,8},
						{6,12,12,10}};
						
		String [] hari = {"SENIN","SELASA","RABU","KAMIS","JUM'AT","SABTU","MINGGU"};
		String [] barang = {"Buku Tulis  ","Buku Gambar ","Pensil      ","Ballpoint   "};
		int harga [] = {3500,4000,2500,1500} ;
		
		int omset=0;
		int omset1=0;
		int omset2=0;
		int omset3=0;
		int omset4=0;
		for (int i=0; i<hari.length; i++)
		{
			System.out.print(hari[i] + "\t" + "\t");
			for (int j=0; j<databrg[i].length; j++)
			{
				System.out.print(databrg[i][j] + "\t" + "\t");
				omset+=databrg[i][j];
			}
			System.out.print( "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+omset );
			omset=0;
			System.out.println();
		}
		for (int a=0; a<databrg.length; a++)
		{
			omset1+=databrg[a][0];
			omset2+=databrg[a][1];
			omset3+=databrg[a][2];
			omset4+=databrg[a][3];
		}
		
		int jumlah [] = new int [4] ;
		int total [] = new int [4] ;
		int pendapatan [] = new int [7];
		int barangLaris[] = new int [4];
		int total1minggu = 0;
		int totbarang = 0;
		String terlaris;
		String tdkterlaris;
		String namahari;
		Scanner input = new Scanner (System.in);
		for (int i = 0; i<7; i++)
		{
			System.out.println("===================");
			System.out.println ("     "+hari[i]);
			System.out.println("===================");
			for (int a=0; a<4; a++)			
			{
				System.out.println("Nomer       	 	: "+ (a+1) );
   	    	    System.out.println("Nama Barang 		: "+barang[a]);
   	    	    System.out.println("Harga Satuan 		: Rp"+harga[a]);
   	    	    System.out.print("Jumlah Pembelian        : ");
				jumlah[a] = input.nextInt();
				barangLaris[a] += jumlah[a];
				total[a] = jumlah[a] * harga[a];
				totbarang = totbarang + jumlah [a];
				total1minggu = total1minggu + total [a];
				pendapatan [i] = pendapatan [i] + total [a];
   	    	    System.out.println("Jumlah Pembayaran       : "+total [a]+"\n");					
			}
			System.out.println("Pendapatan hari " + hari[i] + " adalah : Rp "+ pendapatan [i]);
		}
		int max = 0;
		max = pendapatan [0];
		namahari = hari[0];
			for (int b = 0; b < hari.length; b++)
			{
				if (pendapatan [b] > max)
				{
					max = pendapatan [b];
					namahari = hari[b];
				}
			}		
		int maxbrg = 0;
		int minbrg = 100000;
		terlaris = barang[0];
		tdkterlaris = barang[0];
			for (int c = 0; c < 4; c++)
			{
				if (barangLaris[c] > maxbrg)
				{
					maxbrg = barangLaris[c];
					terlaris = barang[c];
				}
				if (barangLaris[c] < minbrg)
				{
					minbrg = barangLaris[c];
					tdkterlaris = barang[c];
				}
			}
		System.out.println("\n\n===================================");
		System.out.println("LAPORAN PENJUALAN SELAMA 1 MINGGU");
		System.out.println("\n===================================");
	    System.out.println("Total Pendapatan selama 1 Minggu : Rp. " + total1minggu);
		System.out.println("Total Penjualan barang selama 1 Minggu : " + totbarang + " barang");
		System.out.println("Total Pendapatan terbesar di hari : " + namahari + " Rp. " + max);
		System.out.println("Barang yang Paling Laris adalah : " + terlaris + " " + maxbrg + " Barang");
		System.out.println("Barang yang Paling Sedikit adalah : " + tdkterlaris + " " + minbrg + " Barang");
		System.out.println();				
	}
}

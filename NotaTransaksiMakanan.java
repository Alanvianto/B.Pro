import java.util.*;
import java.util.Date;

public class NotaTransaksiMakanan
{
	public static void main ( String [] miku )
	{
		Scanner a = new Scanner(System.in);
		Date tgl = new java.util.Date();
		
		String[]menu={"Soto Ayam","Gado-gado","Nasi Goreng","Nasi Campur","Mie Ayam"};
		int[]harga={10000, 8000, 12000, 10000, 7000};
		String nota = "";
		int subtot = 0;
		int total = 0;
		System.out.println();
		System.out.println("Daftar Menu Makanan");
		System.out.println();
		System.out.println("Makanan \t\tHarga");
		System.out.println();
		
		for(int i = 0; i < menu.length; i++)
		{
			System.out.println((i+1) + "." + menu[i]+"\t\t"+harga[i]);
		}
		String jawab="y";
		while(jawab.equalsIgnoreCase("y"))
		{
			System.out.println();
			System.out.print("Masukkan pilan : ");
			int pil=a.nextInt();
			System.out.println();
			System.out.println(menu [ pil - 1 ] );
			System.out.println();
			
			System.out.print("Masukkan Jumlah Pesanan : ");
			int jml = a.nextInt();
			System.out.println("Harga : "+harga[pil-1]);
			subtot = harga [ pil - 1 ] * jml;
			System.out.println("Bayar : "+subtot);
			System.out.println();
			
			nota += menu [ pil - 1 ] + "\t\t"+ jml +" Porsi\t\t"+harga[pil-1]+"\t\t"+subtot+"\n-----------------------------------------------------------------\n";
			total += subtot;
			System.out.println("Pesan lagi?[Y/N]");
			jawab = a.nextLine();	
			System.out.println();
		}
		System.out.println("=================================================================");
		System.out.println("\t\t\tNota Pembayaran");
		System.out.println("");
		System.out.println("Tanggal Transaksi : " + tgl.toString());
		System.out.println("=================================================================");
		System.out.println("MENU \t\t\tJUMLAH \t\t HARGA \t\t Sub Total");
		System.out.println("-----------------------------------------------------------------");
		System.out.println(nota);
		System.out.println("=================================================================");
		System.out.println("Total bayar : "+total);
		System.out.println("=================================================================");
	}
}

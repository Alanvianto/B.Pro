public class HargaBayar
{
	public static void main (String [] miku)
	{
		int jumbrg = 40;
		int totbns = jumbrg / 2 ;
		int totbrg = jumbrg + totbns;
		int harga = 25000;
		int bayar = jumbrg * harga;
		System.out.println ("------Beli 2 Gratis 1------");
		System.out.println ("Jumlah Barang\t: "+jumbrg+" barang");
		System.out.println ("Pembayaran\t: Rp. "+bayar);
		System.out.println ("Total Bonus\t: "+totbns+" barang");
		System.out.println ("Total Barang\t: "+totbrg+" barang");
	}
}

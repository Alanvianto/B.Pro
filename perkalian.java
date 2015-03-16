import java.util.*;

public class perkalian{
	public static void main(String[] miku){
		Scanner sc=new Scanner(System.in);
		int angka1,angka2;
		Garis();
		System.out.println("         Perkalian        ");
		Garis();
		System.out.print(">Masukkan Angka pertama: ");		
		angka1=sc.nextInt();
		System.out.print(">Masukkan Angka kedua: ");		
		angka2=sc.nextInt();
		System.out.print("\nJawaban: \n"+angka1+" x "+angka2+" = ");
		for (int i=1;i<=angka2;i++)
		{
		System.out.print(angka1+" + ");		
		}
		System.out.print("\b = "+(angka1*angka2));
	}
	
	public static void Garis(){
		System.out.println("==========================");
	}
}

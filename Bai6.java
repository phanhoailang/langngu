package Baitapvenha;
import java.util.Scanner;
public class Bai6 {


			public static void main(String[] args)
			{
				// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
				Fraction ps1 = new Fraction();
				Fraction ps2 = new Fraction();
				Fraction  psThuong = new Fraction ();
				Fraction  psNhan = new Fraction ();
				Fraction  psHieu = new Fraction ();
				Fraction  psTong = new Fraction ();
				Fraction psRutgon=new Fraction();
				Fraction psNghich=new Fraction();
				System.out.println("nhap vao phan so 1");
				ps1.nhap(sc);
				System.out.println("nhap vao phan so 2");
				ps2.nhap(sc);
				System.out.println("phan so 1 la :");
				ps1.display();
				System.out.println("phan so 2 la : ");
				ps2.display();
				psTong =ps1.add(ps2);
				psHieu=ps1.sub(ps2);
				psNhan=ps1.mul(ps2);
				psThuong=ps1.div(ps2);
				System.out.println(" ket qua tong la ");
				psTong.display();
				System.out.println("ket qua hieu la ");
				psHieu.display();
				System.out.println("ket qua nhan la ");
				psNhan.display();
				System.out.println("ket qua chia la ");
				psThuong.display();
				System.out.println("nhap phan so can toi gian ");
		psRutgon.reduce();
				System.out.println("nhap phan so can nghich dao ");
				psNghich.inverse();

			}

		
	}


package Baitapvenha;
import java.util.Scanner;

public class Fraction {
	

		private int a;
	    private int b;
	    

	   
	    public Fraction() {
	        a = 0;
	        b = 0;
	       
	    }
	    public Fraction(int a ,int b) {
	    	this.a=a;
	    	this.b=b;
	    }
	    public void nhap(Scanner sc){
	    	System.out.println("nhap phan tu");
	    	a=sc.nextInt();
	    	System.out.println("nhap phan mau");
	    	b=sc.nextInt();
	    }
	    public Fraction add(Fraction ps2) {
	    	int tu = a*ps2.b+ps2.a*b;
	    	int mau=b*ps2.b;
	    	return new Fraction(tu,mau);
	    }
	    public Fraction sub(Fraction ps2) {
	    	int tu =  a*ps2.b-ps2.a*b;
	    	int mau=mau=b*ps2.b;
	    	return new Fraction(tu,mau);
	    }
	    public Fraction mul(Fraction ps2) {
	    	int tu = a*ps2.a;
	    	int mau = b*ps2.b;
	    	return new Fraction(tu,mau);
	    }
	    public Fraction div(Fraction ps2) {
	    	int tu=a*ps2.b;
	    	int mau=b*ps2.a;
	    	return new Fraction(tu,mau);
	    }
	    public void inverse() 
	    {
	    	int a,b;
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("nhap phan tu");
	    	a=sc.nextInt();
	    	System.out.println("nhap phan mau ");
	    	b= sc.nextInt();
	    	int c = a;
	    	    a=b;
	    	    b=c;
	    	    System.out.println("phan so nghich dao la "+a+"/"+b);
	    }
	    public void reduce() {
	    	int a,b;
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("nhap phan tu");
	    	a=sc.nextInt();
	    	System.out.println("nhap phan mau ");
	    	b= sc.nextInt();
	   	 for (int i = 1; i <= a && i <= b; i++) 
	   	 {
	            if (a % i == 0 && b % i == 0) 
	            {
	              int h = i;
	              int c = a/h;
	              int d = b/h;
	              System.out.println("phan so toi gian la "+c+"/"+d);
	            }
	      }
	   	
	    }
	    public void display() {
	    	System.out.println(a+"/"+b);
	    }
	}


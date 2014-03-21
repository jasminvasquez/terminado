import java.util.Scanner;


public class parte3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	  Scanner mi_Scanner=new Scanner(System.in);
	        int sum;
	        int a;
	        int n;
	        int prom;
	        sum=0;
	        for(a=1;a<=20;a++) {
	            System.out.print("Ingrese numero:");
	            n=mi_Scanner.nextInt();
	            sum=sum+n;
	        }

	        prom=sum/10;
	        System.out.print("el total de promedio de todos los numeros es:");
	        System.out.print(prom);
	    }

	}

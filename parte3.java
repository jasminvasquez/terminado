import java.util.Scanner;


public class parte3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner ab=new Scanner(System.in);
	        int sum,f,valor,prom;
	        sum=0;
	        for(f=1;f<=20;f++) {
	            System.out.print("Ingrese numero:");
	            valor=ab.nextInt();
	            sum=sum+valor;
	        }
	       
	        prom=sum/10;
	        System.out.print("el total de promedio de todos los numeros es:");
	        System.out.print(prom);
	    }

	}
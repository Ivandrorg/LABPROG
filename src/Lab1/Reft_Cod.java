package Lab1;
import java.util.Scanner;

public class Reft_Cod {
private static Scanner in;
public static void main(String[] args) {
	
int n1, n2, n3, min, max;
System.out.println("Digite tres numeros inteiros");
	in = new Scanner(System.in);
	n1 = in.nextInt();
	min = n1;
	max = n1;
		n2 = in.nextInt();
		n3 = in.nextInt();
			if(n2 < min ){
				min = n2;
			}
			if(n2 > max){
				max = n2;
			}
			if(n3 < min){
				min = n3;
			}
			if(n3 > max){
				max = n3;
			}
			System.out.println("O maior numero e " + max + " e o menor e " + min);
}
}



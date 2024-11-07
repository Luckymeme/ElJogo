import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		System.out.println("Inserta numero x: ");
		Scanner s0 = new Scanner(System.in);
		int x = s0.nextInt();
		System.out.println("Inserta numero y: ");
		Scanner s1 = new Scanner(System.in);
		int y = s1.nextInt();
		
		System.out.println("El numero X: "+x+" y el numero Y: "+y+" resultan en: ");
	}

}

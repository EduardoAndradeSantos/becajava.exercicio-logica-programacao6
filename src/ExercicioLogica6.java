import java.util.Scanner;
public class ExercicioLogica6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero1;
		int numero2;
		int resto;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = ler.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = ler.nextInt();
		
		while (numero2 != 0) {
			resto = numero1 % numero2;
			numero1 = numero2;
			numero2=resto;
		}
		System.out.println("resultado: "+numero1);
	}
}

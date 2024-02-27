import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	//ex1();
        //ex2();
    	//ex3();
    	//ex4();
    	ex5();
    }




	private static void ex1() {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        String nome = entrada.nextLine();
        System.out.println("Bom dia "+nome);
        entrada.close();
	}

	private static void ex2() {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual seu ano de nascimento? ");
		int anoNascimento = entrada.nextInt();
		
		LocalDate d2 = LocalDate.now();
		int anoAtual = d2.getYear();
		
		System.out.println("Sua idade é "+(anoAtual-anoNascimento));
		entrada.close();
	}
	
	private static void ex3() {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um numero: ");
		int n1 = teclado.nextInt();
		System.out.println("Digite agora um nome: ");
		teclado.nextLine();
		String nome = teclado.nextLine();
		System.out.println("O numero digitado foi "+n1+" e o nome foi "+nome);
		teclado.close();
	}
	
	private static void ex4() {
		// TODO Auto-generated method stub
		String nome, apelido;
		nome = "João";
		apelido = nome;
		nome = null;
		System.out.println(apelido);
	}
	
	private static void ex5() {
		// TODO Auto-generated method stub
		final int salarioMinimo = 1442;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o seu salário? ");
		int salario = entrada.nextInt();
		System.out.println("A diferença "
				+ "entra seu salário e o "
				+ "salário mínimo é: R$ "
				+ (salario - salarioMinimo) );
		entrada.close();
	}
}
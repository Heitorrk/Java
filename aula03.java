import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //exemplo1();
        //exemplo2();
        //sorteio();
        //megaSena();
        //ex3();
        ex4();
    }
    
    private static void exemplo1(){
        
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual seu peso?");
        double peso = entrada.nextDouble();
        System.out.println("Qual sua altura?");
        double altura = entrada.nextDouble();
    System.out.println("Peso: "+peso+" | Altura: "+altura+"!");

    }

    private static void exemplo2() {
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numb1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        int numb2 = entrada.nextInt();
    System.out.println("A soma dos números é "+(numb1+numb2)+" | A diferença dos números é "+(numb1-numb2));
        
   }

    private static void exemplo3() {

        Scanner entrada = new Scanner(System.in);

   }

    private static void sorteio() {

        int x = (int)(Math.random()*100);
        System.out.println("O número sorteado foi: "+x);
        int y = (int)(Math.random()*100);
        System.out.println("O número sorteado foi: "+y);
        int z = (int)(Math.random()*100);
        System.out.println("O número sorteado foi: "+z);
   }

    private static void megaSena() {

    int x1 = (int)(Math.random()*60);
    int x2 = (int)(Math.random()*60);
    int x3 = (int)(Math.random()*60);
    int x4 = (int)(Math.random()*60);
    int x5 = (int)(Math.random()*60);
    int x6 = (int)(Math.random()*60);
    System.out.println("Os números sorteados foram:\n"+x1+"\n"+x2+"\n"+x3+"\n"+x4+"\n"+x5+"\n"+x6);
   }

    private static void ex3() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a latitude da primeira cordenada: ");
        int lat1 = entrada.nextInt();
        System.out.println("Digite a longitude da primeira cordenada: ");
        int lon1 = entrada.nextInt();
        System.out.println("Digite a latitude de outra cordenada: ");
        int lat2 = entrada.nextInt();
        System.out.println("Digite a longitude de outra cordenada: ");
        int lon2 = entrada.nextInt();
        int x = lat1 - lon1;
        int y = lat2 - lon2;
        double xx = Math.pow(x, 2);
        double yy = Math.pow(y, 2);
        double xy = xx + yy;
        double resposta = Math.sqrt(xy);

        System.out.println("o resultado da equação é: "+resposta);
        entrada.close();

   }

    private static void ex4() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu peso na terra: ");
        double peso = entrada.nextFloat();
        double pesoMercurio = peso * 0.37;
        double pesoVenus = peso * 0.88;
        double pesoMarte = peso * 0.38;
        double pesoJupiter = peso * 2.64;
        double pesoSaturno = peso * 1.15;
        double pesoUrano = peso * 1.17;
        System.out.println("O peso em Mercúrio é "+pesoMercurio);
        System.out.println("O peso em Vênus é "+pesoVenus);
        System.out.println("O peso em Marte é "+pesoMarte);
        System.out.println("O peso em Júpiter é "+pesoJupiter);
        System.out.println("O peso em Saturno é "+pesoSaturno);
        System.out.println("O peso em Urano é "+pesoUrano);

   }

}

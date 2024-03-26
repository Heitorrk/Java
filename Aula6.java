import java.util.Scanner;
import java.time.LocalDateTime;

class Main {
    public static void main(String[] args) {
        
        String nome = "Heitor de Oliveira Mamede";
        
        String iniciais = nome.substring(0, 1);
        
        String ano = LocalDateTime.now().toString();
        ano = ano.substring(0, ano.indexOf("-"));
        
        int x = (int) (Math.random()*10);
        int y = (int) (Math.random()*10);
        int z = (int) (Math.random()*10);
        int w = (int) (Math.random()*10);
        
        System.out.println(nome);
        
        System.out.println(nome.substring(0, 1) + nome.substring(nome.lastIndexOf(" ") + 1) + "@estudante.edu.br");
        
        for (int i=0; i<nome.length(); i++) {
            if(nome.substring(i,i+1).equals(" ")) {
                iniciais = iniciais + nome.substring(i+1, i+2);
            }
        }
        System.out.println(iniciais + ano + x + y + z + w);
    }
}

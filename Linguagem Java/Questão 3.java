import java.util.Scanner;

public class PessoaMaisVelha {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Digite a quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();

  
        String[] nomes = new String[quantidadePessoas];
        int[] idades = new int[quantidadePessoas];

        
        for (int i = 0; i < quantidadePessoas; ++i) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.next();

            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }

  
        int indicePessoaMaisVelha = 0;
        for (int i = 1; i < quantidadePessoas; ++i) {
            if (idades[i] > idades[indicePessoaMaisVelha]) {
                indicePessoaMaisVelha = i;
            }
        }

  
        System.out.println("A pessoa mais velha é: " + nomes[indicePessoaMaisVelha] + ", com " + idades[indicePessoaMaisVelha] + " anos.");

        scanner.close();
    }
}

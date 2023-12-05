import java.util.Scanner;

public class VerificadorAprovacao {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Digite a primeira nota (0 a 100): ");
        float nota1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota (0 a 100): ");
        float nota2 = scanner.nextFloat();

    
        float media = (nota1 + nota2) / 2;

      
        if (media >= 70) {
            System.out.println("Aprovado! Média: " + media);
        } else if (media >= 40 && media < 70) {
  
            System.out.println("Em exame. Média: " + media);

   
            System.out.print("Digite a nota do exame (0 a 100): ");
            float notaExame = scanner.nextFloat();

   
            if ((media + notaExame) >= 100) {
                System.out.println("Aprovado! Média final: " + (media + notaExame));
            } else {
                System.out.println("Reprovado. Média final: " + (media + notaExame));
            }
        } else {
   
            System.out.println("Reprovado. Média: " + media);
        }

        
        scanner.close();
    }
}

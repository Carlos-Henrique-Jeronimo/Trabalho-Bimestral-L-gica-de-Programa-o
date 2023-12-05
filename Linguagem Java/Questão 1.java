import java.util.Scanner;

public class CalculadoraMulta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a velocidade máxima permitida: ");
        int velocidadeMaxima = scanner.nextInt();

        System.out.print("Digite a velocidade do motorista: ");
        int velocidadeMotorista = scanner.nextInt();

        int diferencaVelocidade = velocidadeMotorista - velocidadeMaxima;
        if (diferencaVelocidade > 0) {
            int valorMulta = diferencaVelocidade * 5;
            System.out.println("Multa de R$ " + valorMulta + ",00 por excesso de velocidade.");
        } else {
            System.out.println("Não há multa. O motorista está dentro do limite de velocidade.");
        }
        scanner.close();
    }
}

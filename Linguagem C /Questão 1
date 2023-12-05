#include <stdio.h>
#include <stdlib.h>

int main()
{
    int velocidadeMaxima, velocidadeMotorista;

    printf("Digite a velocidade máxima permitida: ");
    scanf("%d", &velocidadeMaxima);

    printf("Digite a velocidade do motorista: ");
    scanf("%d", &velocidadeMotorista);

    int diferencaVelocidade = velocidadeMotorista - velocidadeMaxima;

    if (diferencaVelocidade > 0)
    {

        int valorMulta = diferencaVelocidade * 5;

        printf("Multa de R$ %d,00 por excesso de velocidade.\n", valorMulta);
    }
    else
    {

        printf("Não há multa. O motorista está dentro do limite de velocidade.\n");
    }

    return 0;
}

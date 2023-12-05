#include <stdio.h>
#include <stdlib.h>
int main()
{

    float nota1, nota2, media, notaExame;

    printf("Digite a primeira nota (0 a 100): ");
    scanf("%f", &nota1);

    printf("Digite a segunda nota (0 a 100): ");
    scanf("%f", &nota2);

    media = (nota1 + nota2) / 2;

    if (media >= 70)
    {
        printf("Aprovado! Média: %.2f\n", media);
    }
    else if (media >= 40 && media < 70)
    {

        printf("Em exame. Média: %.2f\n", media);

        printf("Digite a nota do exame (0 a 100): ");
        scanf("%f", &notaExame);

        if ((media + notaExame) >= 100)
        {
            printf("Aprovado! Média final: %.2f\n", media + notaExame);
        }
        else
        {
            printf("Reprovado. Média final: %.2f\n", media + notaExame);
        }
    }
    else
    {

        printf("Reprovado. Média: %.2f\n", media);
    }

    return 0;
}

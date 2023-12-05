#include <stdio.h>
#include <string.h>

#define MAX_PESSOAS 100

int main()
{

    char nomes[MAX_PESSOAS][50];
    int idades[MAX_PESSOAS];
    int quantidadePessoas, i;

    printf("Digite a quantidade de pessoas: ");
    scanf("%d", &quantidadePessoas);

    for (i = 0; i < quantidadePessoas; ++i)
    {
        printf("Digite o nome da pessoa %d: ", i + 1);
        scanf("%s", nomes[i]);

        printf("Digite a idade da pessoa %d: ", i + 1);
        scanf("%d", &idades[i]);
    }

    int indicePessoaMaisVelha = 0;
    for (i = 1; i < quantidadePessoas; ++i)
    {
        if (idades[i] > idades[indicePessoaMaisVelha])
        {
            indicePessoaMaisVelha = i;
        }
    }

    printf("A pessoa mais velha é: %s, com %d anos.\n", nomes[indicePessoaMaisVelha], idades[indicePessoaMaisVelha]);

    return 0;
}

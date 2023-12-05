qtdPesso = int(input("Quantas pessoas vão ser digitadas?"))
nomes = []
idades = []
for i in range(0, qtdPesso):
    nomes.append(input("Nome:"))
    idades.append(int(input("Idade:")))
    idadeMaior = max(idades)
print(f"Quem tem a idade {idadeMaior} é a mais velha")

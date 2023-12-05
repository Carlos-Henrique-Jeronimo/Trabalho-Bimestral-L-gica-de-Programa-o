qtdPesso = int(input("Quantas pessoas vão ser digitadas?"))
nomes = []
idades = []
for i in range(0, qtdPesso):
    nomes.append(input("Nome:"))
    idades.append(int(input("Idade:")))
    idadeMaior = max(nomes)
print(f"A pessoa mais velha é {idadeMaior} ")

nota1 = int(input("Informe sua nota de 0 a 100: "))
nota2 = int(input("Informe sua segunda nota de 0 a 100:"))
media = (nota1 + nota2)/2
if (media >=70):
    print("Parabéns!!! Aprovado")
elif (media >= 40):
    print("Quase!!! Terá que fazer exame final")
else:
    print("Uma pena!! Está reprovado")

vel = int(input("Digite a velocidade máxima da avenida: "))
velMot = int(input("Digite a sua velocidade: "))
if (velMot > vel):
    multa = (velMot - vel)*5
    print(f'Irresponsavel!!! Sua multa eh de: {multa}')
elif(vel > velMot):
    print('Parabéns, está dentro das normas!!')

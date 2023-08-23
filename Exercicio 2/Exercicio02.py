def main():
    pares = list()
    impares = list()
    soma = 0

    for i in range(6):
        numero = int(input("Digite o número para ser adicionado: "))
        # Verifica se o número é par ou impar e adiciona na lista esperada
        if(numero % 2 == 0):
            pares.append(numero)
        else:
            impares.append(numero)

    # Pares
    print(f"Números pares digitados: {pares}")
    for i in range(len(pares)):
        soma = soma + pares[i]
    print(f"Soma dos números pares digitados: {soma}")


    # Impares
    print(f"Números impares digitados {impares}")
    print(f"Quantidade de números impares digitados: {len(impares)}")

if __name__ == '__main__':
    main()
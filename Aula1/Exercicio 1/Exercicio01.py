def main():

    # Cria a lista dos vetores.
    vetorA = list(range(10))
    vetorB = list(range(10))
    vetorC = list(range(10))

    print("#" * 20)

    # Recebe o vetor A do usuario.
    for i in range(10):
        # print(vetorA[i])
        vetorA[i] = int(input(f"Digite o número do vetor A na posição [{(i + 1)}]: "))

    print("#" * 20)

    # Recebe o vetor B do usuario.
    for i in range(10):
        # print(vetorA[i])
        vetorB[i] = int(input(f"Digite o número do vetor B na posição [{(i + 1)}]: "))

    print("#" * 20)

    # Calculo dos vetores A + B
    for i in range(10):
        vetorC[i] = vetorA[i] - vetorB[i]
        print(f"A subtração do vetor C [{(i + 1)}] = {vetorA[i]} - {vetorB[i]} = {vetorC[i]}")

    # #Ler a matriz
    # for i in vetorA:
    #     print(i)


if __name__ == '__main__':
    main()
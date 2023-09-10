def main():

    matriz = [[0 for _ in range(4)] for _ in range(4)]

    print("#" * 49 ) 

    for i in range(4):
        print("#", end="\t")
        for j in range(4):
            matriz[i][j] = (i + 1) * (j + 1)
            print(matriz[i][j], end="\t")
        print("\t#")

    print("#" * 49 )
if __name__ == '__main__':
    main()
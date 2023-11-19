def pesquisa_binaria(lista, item):

    baixo = 0
    alto = len(lista) - 1 # -1 é para compensar já que começa com 0

    while baixo <= alto:
        meio = (baixo + alto) // 2 # acha o meio somando o mais baixo com o mais alto e depois dividindo por 2
        chute = lista[meio] # tenta chutar o numero do meio
        if chute == item: # acerta
            return meio
        if chute > item: # chute está muito acima do procurado
            alto = meio - 1 # o numero mais alto vai passar a ser o meio - 1
        else: # chute está muito abaixo do procurado
            baixo = meio + 1 # o numero mais baixo vai passar a ser o meio + 1
    return None # não existe

minha_lista = [1, 3, 5, 7, 9]
print(pesquisa_binaria(minha_lista, 3)) # retorna 1
print(pesquisa_binaria(minha_lista, -1)) # retorna null
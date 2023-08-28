import random

def main():
    alist = [54,26,93,17,77,31,44,55,20]

    selection_sort(alist)
    print(alist)

def selection_sort(alist):
    for i in range(len(alist)):
        menor = i
        for j in range(i+1,len(alist)):
            if alist[j] < alist[menor]:
                menor = j
        if alist[i] != alist[menor]:
            aux = alist[i]
            alist[i] = alist[menor]
            alist[menor] = aux

if __name__ == '__main__':
    main()
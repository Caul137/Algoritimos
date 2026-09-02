
lista = [2, 4, 6]

def recursive_sum(n):
    if n == 0:
        return 0
    else:
        return recursive_sum(n - 1) + lista[n - 1]

print(recursive_sum(len(lista)))


numeros = [1, 2, 3, 4, 5]

def recursion_count(n):
    if n == 0:
        return 0
    else:
        items = 0
        items += recursion_count(n - 1) + 1
        return items
     
    
print(recursion_count(len(numeros)))
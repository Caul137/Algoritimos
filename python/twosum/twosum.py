target = 10
array = [1 ,2, 5, 4, 6]

def twosum():
    for i in range(len(array)):
        for j in range(i + 1,len(array)):
            if(array[i] + array[j] == target):
                 print(i,j)

twosum()
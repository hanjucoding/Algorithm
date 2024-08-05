N = int(input())
count = 0

i=1
while 1:
    if i*i <=N:
        count +=1
        i += 1
    else:
         break   
print(count)
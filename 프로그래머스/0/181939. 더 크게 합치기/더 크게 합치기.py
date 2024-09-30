def solution(a, b):
    temp1 = str(a) + str(b)
    temp2 = str(b) + str(a)
    if(int(temp1)>int(temp2)):
        return int(temp1)
    else:
        return int(temp2)
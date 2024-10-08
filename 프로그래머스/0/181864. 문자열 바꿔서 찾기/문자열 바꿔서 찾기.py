def solution(myString, pat):
    temp = myString.replace("A","X").replace("B","A").replace("X","B")
    print(temp)
    answer = 0
    return int(pat in temp)
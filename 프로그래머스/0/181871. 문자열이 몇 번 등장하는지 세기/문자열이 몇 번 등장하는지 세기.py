def solution(myString, pat):
    answer = 0
    for i in range(len(myString)-len(pat)+1):
        temp=""
        for j in range(len(pat)):
                temp += myString[j+i]
        if temp == pat:
            answer += 1
    
    return answer
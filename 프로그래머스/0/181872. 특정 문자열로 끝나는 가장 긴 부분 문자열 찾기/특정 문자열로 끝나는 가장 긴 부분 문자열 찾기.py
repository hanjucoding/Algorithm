def solution(myString, pat):
    for i in range(len(myString)-1,-1,-1):
        temp =myString[:i+1]
        if temp.endswith(pat):
            return temp
    answer = ''
    return answer
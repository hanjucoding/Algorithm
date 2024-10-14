def check(num):
    temp = str(num)
    SET = set(temp)
    for k in SET:
        if k != "5" and k != "0":
            return False
    return True
    
def solution(l, r):
    answer = []
    for i in range(l,r+1):
        if i%5==0:
            if check(i):
                answer.append(i)
    if len(answer) == 0:
        answer.append(-1)
    return answer
def solution(num_str):
    answer = 0
    temp = list(map(int,num_str))
    for i in range(len(temp)):
        answer += temp[i]
    return answer
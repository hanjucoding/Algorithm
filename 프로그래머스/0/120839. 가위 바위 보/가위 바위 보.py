def solution(rsp):
    answer = ''
    for a in rsp:
        if a=="2":
            answer += "0"
        elif a=="0":
            answer += "5"
        else:
            answer += "2"
    return answer
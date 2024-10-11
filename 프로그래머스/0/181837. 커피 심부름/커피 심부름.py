def solution(order):
    answer = 0
    for i in range(len(order)):
        answer += price(order[i])
    return answer

def price(name):
    if "latte" in name:
        return 5000
    else:
        return 4500
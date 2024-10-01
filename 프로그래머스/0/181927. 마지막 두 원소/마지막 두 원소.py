def solution(num_list):
    last = num_list[len(num_list)-1]
    last_1 = num_list[len(num_list)-2]
    if(last>last_1):
        num_list.append(last-last_1)
    else:
        num_list.append(last*2)
    return num_list
def solution(sides):
    answer = float('inf')  
    min_preimeter = float('inf')  
    sides.sort()  
    n = len(sides)

    for i in range(n):
        for j in range(i+1, n):
            for k in range(j+1, n):
                first, second, third = sides[i], sides[j], sides[k]

                if first + second > third and second + third > first and third + first > second:
                    temp = first + second + third
                    if temp < min_preimeter:
                        min_preimeter = temp
                        answer = temp  

    return answer if answer != float('inf') else None
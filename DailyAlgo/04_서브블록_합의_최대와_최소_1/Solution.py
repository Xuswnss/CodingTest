#1 정사각형 배열이므로 arr2_len을 구할 필요가 없음

def solution(array):
    answer = []
    arr1_len = len(array)
    for i in range(arr1_len):
        arr2_len = len(array[i])
        print('arryLen:', arr2_len)

    return answer      
  #2

def solution(array):
    answer = []
    arr1_len = len(array)
    arr2_len = len(array[0])
    for i in range(arr1_len):
        for j in range(arr2_len):
            answer.append(array[i][j])
            # print(answer)
    sum(answer)
    print(answer)
        
   
    return answer







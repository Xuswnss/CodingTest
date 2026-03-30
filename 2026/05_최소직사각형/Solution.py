def solution(sizes):
    answer = 0
    max_w = 0
    max_h = 0
    for i in sizes:
        width = i[0]
        height = i[1]
        # 만약 세로가 더 길다면 둘의 위치를 바꿔준다.
        if width < height: 
            width,height = height,width     
        print(f'width : {width }, height {height}')
        
        # 최댓값 찾기
        if width > max_w :
            max_w = width
        if height > max_h:
            max_h = height
        
        answer = max_w * max_h
        
   
    return answer
# def solution(n):
#     answer = True
#     for i in range(len(n)):
#         for j in range(0,len(n),-1):
#             print('num1:',n[i],'num2:',n[j])
#     return answer



#     for i in range(len(n)):
#                    ^^^^^^
# TypeError: object of type 'int' has no len()
# len은 문자열,리스트 같은 길이를 가진 자료형에 사용이 가능하다.

def solution(n):
    answer = True
    #1. 거꾸로 뒤집는다.
    n = str(n)
    print('거꾸로 뒤집은 수 :', n[::-1], '주어진 수:', n)
    if n != n[::-1]:
        answer = False
    return answer

solution(12345)
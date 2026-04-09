# 카드뭉치 
# '카드를 사용하지 않고 다음 카드로 넘어갈 수 없다.'
# GOAL의 길이만큼 순화를 돈다.
# 만약 goal[0] == cards1[0]이 같다면
#   cards1을 순회를돈다.만약에 일치하지않다면 cards2를 돈다. 일치하지 않으면 card1을 순회를 돈다.
        #결과가 goal과같다면 return True 아니라면 return False
# while 문?

# def solution(cards1, cards2, goal):
#     answer = "Yes"
#     n = len(goal)
#     for num in range(n):
#         if cards1[num] == goal[num]:
#             print('card1에 같은 값이 존재합니다.')
#             print(cards1[num])
#             cards1.pop(num)
#             print('remove cards1', cards1)
#         elif cards2[num] == goal[num]:
#             print('card2에 같은 값이 존재합니다.')
#             print(cards2[num])
#             cards2.pop(num)
#             print('remove cards2', cards2)
#         else:
#             return "No"
            
#     return answer


# cards1[num], cards2[num]처럼 goal의 인덱스를 그대로 사용한 점 (잘못된 인덱스 접근)
# cards는 앞에서부터만 사용해야 하는데 중간 인덱스에 접근한 점
# pop(num)을 사용하여 중간 요소를 제거한 점 (순서 위반)
# 리스트 길이가 줄어드는데 for문의 num은 계속 증가하여 인덱스 오류 가능성 존재
# cards1과 cards2는 각각 독립적으로 진행되어야 하는데 동일한 num으로 접근한 점
# goal 기준으로만 순회해야 하는데 cards까지 같이 순회하려 한 점
# cards2도 cards1과 동일하게 잘못된 방식으로 접근한 점
# 문제의 핵심인 “맨 앞 카드만 사용” 조건을 코드에 반영하지 못한 점
def solution(cards1, cards2, goal):
    answer ='Yes'
    n = len(goal)
    for i in goal:
        if cards1 and cards1[0] == i:
            print('cards1 == goal ')
            cards1.pop(0)
            print('remove cards1')
        elif cards2 and cards2[0] == i:
            print('cards2 == goal')
            cards2.pop(0)
            print('remove cards2')
            
        else:
            return 'No'
        
    return answer

# GREEDY 알고리즘을 사용하여 문제를 해결하는 방식입니다.
# 시공간복잡도 O(n^2), 공간복잡도` O(1)입니다.
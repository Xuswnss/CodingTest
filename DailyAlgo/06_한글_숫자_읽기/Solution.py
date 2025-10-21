def solution(hangul_numbers):
    num_dict = {
        "하나": "1", "일": "1",
        "둘": "2", "이": "2",
        "셋": "3", "삼": "3",
        "넷": "4", "사": "4",
        "다섯": "5", "오": "5",
        "여섯": "6", "육": "6",
        "일곱": "7", "칠": "7",
        "여덟": "8", "팔": "8",
        "아홉": "9", "구": "9",
        "공": "0", "영": "0"
    }

    keys_ordered = [
        "하나", "다섯", "여섯", "일곱", "여덟", "아홉",
        "일", "둘", "셋", "넷", "삼", "사", "오", "육", "칠", "팔", "구", "공", "영"
    ]

    answer = hangul_numbers
    i = 0
    while i < len(keys_ordered):
        key = keys_ordered[i]
        answer = answer.replace(key, num_dict[key])
        i += 1

    return answer
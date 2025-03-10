function solution(s1, s2) {
    let answer = 0;
    const set1 = new Set(s1)
    answer = s2.filter( i => set1.has(item)).length;
    return answer;
}

const solution = (s1, s2) => s2.filter(new Set(s1).has, new Set(s1)).length;
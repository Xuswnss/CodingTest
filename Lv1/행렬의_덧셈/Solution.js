function solution(arr1, arr2) {
    let answer = [[]];
    answer = arr1.map((row, i) => row.map((val,j) => val + arr2[i][j]))

    return answer;
}
process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    const n = data.split(" ");
    const a = Number(n[0]), b = Number(n[1]);
    const row = "*".repeat(a);
    for(let i = 0 ; i <b ; i++){
        console.log(row); // 세로개수 만큼  반복하여 출력
    }
    console.log(a);
    console.log(b);
});

document.getElementById('computation-form').addEventListener('submit', function (e) {
    e.preventDefault()
    const input = parseInt(document.getElementById('input').value)
    const outputList = document.getElementById('output');
    outputList.innerHTML = ''; 

    let steps = []
    let current = input
    let hex = ''

    if(current === 0){
        steps.push(`The final result of 0 is ${hex}`)
        hex = '0'
    }

    while(current > 0){
        const quotient = Math.floor(current / 16)
        const rem = current % 16
        const hexDigit = getHexDigit(rem)

        steps.push(`${current}/16 = ${quotient}R${rem} => hex of the remainder is ${hexDigit}`)
        hex = hexDigit + hex
        current = quotient
    }
    steps.push(`The final result of ${input} is ${hex}`)

    steps.forEach(step => {
        const li = document.createElement('li')
        li.textContent = step
        outputList.appendChild(li)
    })

})
    function getHexDigit(num){
        if(num < 10){
            return num.toString()
        }else{
            return String.fromCharCode(num - 10 + 'A'.charCodeAt(0))
        }
    }

// 3.Create a Captcha Validation using JS.

function createcaptcha() {
    let captcha = ""

    for (let index = 0; index < 6; index++) {
        captcha += String.fromCharCode(65 + Math.floor(Math.random()*(120 - 65)))
        
    }
    document.getElementById("cap").innerHTML = captcha
}


function validatecaptcha() {
    const v1 = document.getElementById("cap").innerHTML
    const v2 = document.getElementById("inpcap").value

    if (v1 == v2) {
        document.getElementById("result7").innerHTML = "Valid Captcha"
    }
    else{
        console.log(v1)
        console.log(v2)
        document.getElementById("result7").innerHTML = "InValid Captcha"
    }
}
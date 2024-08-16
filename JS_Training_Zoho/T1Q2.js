// 2.Write a JavaScript function to get the values of First and Last name of the form.

function getNames(){
    const fn = document.getElementById("firstname").value
    const ln = document.getElementById("lastname").value

    const msg = `Your Firstname is ${fn}
    Your Lastname is ${ln}`

    console.log(msg);

    // Write the result
    document.getElementById("result2").innerHTML = msg;
}

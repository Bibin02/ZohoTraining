// 1.Write a JavaScript program to calculate the volume of a sphere

function calculate(){
    const radius = document.getElementById("radinp").value
    const volume = (4/3) * (radius ** 3) * Math.PI;
    console.log(volume);

    // Write the result
    document.getElementById("result1").innerHTML = volume;
}

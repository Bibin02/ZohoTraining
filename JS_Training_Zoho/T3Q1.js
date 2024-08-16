/*
1.Create a stop watch application using HTML, CSS and JavaScript
*/

let msec = 0;
let sec = 0;
let min = 0;

let stop = true;

function stopclock() {
    stop = true;
}

function startclock() {
    let counter = 1590
    
    while (counter > 0) {
        // Wait for 10 milliseconds.
		for (let i=0; i<1000; i++){}
        sec++

        if (msec == 100) {
            msec = 0
            min++;
        }
        if (sec == 60) {
            sec = 0
            min++
        }

        document.getElementById("clock").innerHTML = `${min} : ${sec} : ${msec}`
        counter --;
    }
    
}

function resetclock() {
    min = sec = msec = 0;
    document.getElementById("clock").innerHTML = `0${min} : 0${sec} : 0${msec}`
}
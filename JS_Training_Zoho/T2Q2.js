/*
2.Write a JavaScript program to sort a list of elements using Quick sort.
Quick sort is a comparison sort, 
meaning that it can sort items of any type for which a "less-than" relation (formally, a total order) is defined.
*/

var array;

function quickSort(){
    
    array = document.getElementById("array").value

    array = array.split(" ");

    console.log("Unsorted Array -> "+array);

    array = QuickSort(array)

    // Write the result
    console.log("Sorted Array -> "+array);
    document.getElementById("result4").innerHTML = array;

}

function QuickSort(arr){
    return arr.sort((a, b) => strtonum(a) - strtonum(b));
}

function strtonum(str){
    let value = 0;
    str.split("").forEach(element => {
        value += element.charCodeAt(0);
    });
    return value
}

function QuickSort2(lower, upper){

    let pivot=lower
    let last=upper
    let temp
        
    if(lower==upper || upper<lower){
        return;
    }
    
    while(lower<=upper){
        if(lower==last+1){
            break;
        }
        if(array[lower]<=array[pivot]){
            lower++;
        }
        else if(array[upper]>array[pivot]){
            upper--;
        }
        else{
            //swapping
            temp=array[lower];
            array[lower]=array[upper];
            array[upper]=temp;
        }
        
    }
    //swapping pivot
    temp=array[pivot];
    array[pivot]=array[upper];
    array[upper]=temp;
    
    QuickSort2(pivot,upper-1);
    QuickSort2(upper+1,last);

}
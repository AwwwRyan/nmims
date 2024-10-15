// Array to store input values
let arr = [];

// Function to add value to the array
function addToArray() {
    const inputValue = document.getElementById('arrayInput').value;
    if (inputValue) {
        arr.push(inputValue);
        displayArray();
    } else {
        alert("Please enter a value!");
    }
}

// Function to remove the last value from the array
function removeFromArray() {
    if (arr.length > 0) {
        arr.pop();
        displayArray();
    } else {
        alert("Array is empty!");
    }
}

// Function to display the array
function displayArray() {
    document.getElementById('arrayDisplay').innerHTML = arr;
}
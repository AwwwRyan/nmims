// Question 1: Area of a Triangle
function calculateAreaOfTriangle() {
    const a = 5,
        b = 6,
        c = 7;
    const s = (a + b + c) / 2;
    const area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    document.getElementById("triangleArea").innerText = area.toFixed(2);
}

// Question 2: Sum of Two Integers
function computeSum() {
    const num1 = parseInt(document.getElementById("num1").value);
    const num2 = parseInt(document.getElementById("num2").value);
    let sum;
    if (num1 === num2) {
        sum = 3 * (num1 + num2);
    } else {
        sum = num1 + num2;
    }
    document.getElementById("sumResult").innerText = `Result: ${sum}`;
}

// Question 3: Reverse a Number
function reverseNumber() {
    const num = document.getElementById("numberToReverse").value;
    const reversed = num.split('').reverse().join('');
    document.getElementById("reversedNumber").innerText = reversed;
}

// Question 4: Convert First Letter of Each Word to Upper Case
function convertToUpperCase() {
    const str = document.getElementById("inputString").value;
    const result = str.split(' ').map(word => word.charAt(0).toUpperCase() + word.slice(1)).join(' ');
    document.getElementById("convertedString").innerText = result;
}

// Question 5: Find Largest of Five Numbers
function findLargest() {
    const numbers = [80, 77, 88, 95, 68]; // As in the table
    const largest = Math.max(...numbers);
    alert(`The largest number is ${largest}`);
    document.getElementById("largestNumberResult").innerText = `The largest number is ${largest}`;
}

// Question 6: Compute Average Marks and Grade
function computeAverageAndGrade() {
    const marks = [80, 77, 88, 95, 68];
    const total = marks.reduce((acc, mark) => acc + mark, 0);
    const average = total / marks.length;
    let grade;

    if (average < 60) grade = 'F';
    else if (average < 70) grade = 'D';
    else if (average < 80) grade = 'C';
    else if (average < 90) grade = 'B';
    else grade = 'A';

    document.getElementById("averageMarks").innerText = `Average Marks: ${average.toFixed(2)}`;
    document.getElementById("computedGrade").innerText = `Grade: ${grade}`;
}

// Question 7: Construct Pattern
function constructPattern() {
    let pattern = '';
    for (let i = 1; i <= 5; i++) {
        pattern += '*'.repeat(i) + '\n';
    }
    document.getElementById("pattern").innerText = pattern;
}

calculateAreaOfTriangle();
findLargest();
computeAverageAndGrade();
constructPattern();
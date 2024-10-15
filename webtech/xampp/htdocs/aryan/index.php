<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP Array Operations</title>
</head>

<body>
    <h1>PHP Array Operations</h1>
    <p>Hello, please enter your values:</p>

    <form method="POST" action="">
        <label for="numericArray">Enter Numeric Values (comma-separated):</label><br>
        <input type="text" id="numericArray" name="numericArray" required><br><br>

        <label for="nonNumericArray">Enter Non-Numeric Values (comma-separated):</label><br>
        <input type="text" id="nonNumericArray" name="nonNumericArray" required><br><br>

        <input type="submit" value="Submit">
    </form>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        // Get the input values
        $numericArray = explode(',', $_POST['numericArray']);
        $nonNumericArray = explode(',', $_POST['nonNumericArray']);

        // Clean up input (trim whitespace)
        $numericArray = array_map('trim', $numericArray);
        $nonNumericArray = array_map('trim', $nonNumericArray);

        // Function to sort the array
        function sortArray($array) {
            sort($array);
            return $array;
        }

        // Function to find the maximum value in the array
        function findMax($array) {
            if (allNumeric($array)) {
                return max($array); // Only for numeric arrays
            } else {
                return "Cannot find max value in a non-numeric array.";
            }
        }

        // Function to check if the array is numeric
        function allNumeric($array) {
            return array_reduce($array, function($carry, $item) {
                return $carry && is_numeric($item);
            }, true);
        }

        // Function to search for an item in the array
        function searchItem($array, $item) {
            $key = array_search($item, $array);
            if ($key !== false) {
                return "Item '$item' found at index $key.";
            } else {
                return "Item '$item' not found.";
            }
        }

        // Sort and display the numeric array
        echo "<h3>Sorted Numeric Array:</h3>";
        echo "<pre>";
        print_r(sortArray($numericArray));
        echo "</pre>";

        // Sort and display the non-numeric array
        echo "<h3>Sorted Non-Numeric Array:</h3>";
        echo "<pre>";
        print_r(sortArray($nonNumericArray));
        echo "</pre>";

        // Find and display the maximum value in numeric array
        echo "<h3>Maximum value in Numeric Array:</h3>";
        echo findMax($numericArray);

        // Search for an item in both arrays
        echo "<h3>Search Results:</h3>";
        echo "<p>Searching for '22' in Numeric Array: " . searchItem($numericArray, 22) . "</p>";
        echo "<p>Searching for 'banana' in Non-Numeric Array: " . searchItem($nonNumericArray, 'banana') . "</p>";
    }
    ?>
</body>

</html>

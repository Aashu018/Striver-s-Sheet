/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
     var memo = {};

  // Define the recursive function
  function fib(n) {
    // Check if the value is already stored in the memo
    if (n in memo) {
      return memo[n];
    }

    // Base cases
    if (n <= 1) {
      return n;
    }

    // Calculate and store the value in the memo
    memo[n] = fib(n - 1) + fib(n - 2);
    return memo[n];
  }

  // Call the recursive function with the desired value
  return fib(n);
};
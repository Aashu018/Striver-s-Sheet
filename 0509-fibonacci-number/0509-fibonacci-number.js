/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
    let a = 0, b = 1;
  for (let i = 0; i < n; i++) {
    let temp = a;
    a = b;
    b = temp + a;
  }
  return a;

};
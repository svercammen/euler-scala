// fibonaci stream
def fibFrom(a: BigInt, b: BigInt): Stream[BigInt] =
  a #:: fibFrom(b, a + b)

// convenience function
def fib = fibFrom(1, 1)

// get fibonaci numbers below 4 million
val numbers = fib.takeWhile(x => x < 4000000)

// filter even numbers
val evenNumbers = numbers.filter(x => x%2 == 0)

// produce sum
evenNumbers.sum
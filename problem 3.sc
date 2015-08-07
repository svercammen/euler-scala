import scala.collection.mutable.ArrayBuffer

def isPrime(n: BigInt): Boolean = {
  for (x <- BigInt(2) until n) {
    if (n % x == 0) return false
  }

  true
}

def factors(x: BigInt): List[BigInt] = {
  var i = BigInt(1)
  while (i < (x/2)) {
    i += 1

    if (isPrime(i) && x % i == 0) {   // isPrime could be used as an optimization, but in its current state requires some optimization before showing any effect
      var factorials = ArrayBuffer(i, x/i)

      val iterator = factorials.iterator
      while (iterator.hasNext) {
        val value = iterator.next()
        val newFactors = factors(value)
        if (newFactors != null) {
          factorials -= value
          newFactors.foreach(factor => factorials += factor)
        }
      }

      return factorials.toList
    }
  }

  null
}

// get factors
factors(600851475143L)

// get highest factor
factors(600851475143L).max
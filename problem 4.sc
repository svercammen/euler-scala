// calculate all products of 3-digit numbers
val products =
  for {
    i <- 100 until 1000
    j <- i until 1000
  } yield i*j

// filter numbers that are not palindromes
val palindromes = products.filter(x => x.toString == x.toString.reverse)

// find the biggest number
palindromes.max
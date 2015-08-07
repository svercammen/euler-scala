def fac(n:BigInt): BigInt = {
  if (n==1) 1
  else n*fac(n-1)
}

fac(100)


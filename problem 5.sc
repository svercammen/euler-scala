import scala.util.control.Breaks.breakable
import scala.util.control.Breaks.break

var i = 0
var result = false
do {
  i += 1

  result = true
  breakable { for (x <- (11 to 20).reverse) {
    if (i%x != 0) {
      result = false
      break
    }
  }}
} while (!result)

i
import prelude._
import lab.Lists._

val random1000 = randomIntList(0)(1000)_

val xs = random1000(10)

sort(xs)

def greater (x: Int)(y: Int): Boolean = x > y
def smaller (x: Int)(y: Int): Boolean = x < y

sortWith(greater)(xs)

sortWith(smaller)(xs)


/**
  * Created by FF on 3/10/17.
  */
class level5 {

  val reIPv4 = "(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)".r

  def areEquallyStrong(yourleft: Int, yourRight: Int, friendLeft: Int, friendRigh: Int): Boolean = {
    (yourleft max yourRight) == (friendLeft max friendRigh) && (yourleft min yourRight) == (friendLeft min friendRigh)
  }

  def arrayMaximalAdjacentDifference(inputArray: Array[Int]): Int = {
    inputArray.sliding(2).map { case Array(a, b) => (a - b).abs }.max
  }

  def isIPv4Address(a: String): Boolean = {
    a match {
      case reIPv4(a1, a2, a3, a4) =>
        a1.toInt < 256 && a2.toInt < 256 &&
          a3.toInt < 256 && a4.toInt < 256
      case _ => false
    }
  }

  def boxBlur(image: Array[Array[Int]]): Array[Array[Int]] = {
    image //.toList
      .map(row => row.sliding(3).map(_.sum).toArray)
      .transpose
      .map(row => row.sliding(3).map(_.sum).toArray)
      .map(row => row.map(_ / 9))
      .transpose
    //.map(_.toArray).toArray
  }

  def minesweeper(matrix: Array[Array[Boolean]]): Array[Array[Int]] = {
    val Y = matrix.size
    val X = matrix(0).size
    for {
      y <- 0.until(Y).toArray
    } yield for {
      x <- 0.until(X).toArray
    } yield ((for {
      a <- (y - 1).to(y + 1) if a >= 0 && a < Y
      b <- (x - 1).to(x + 1) if b >= 0 && b < X && (a != y || b != x) && matrix(a)(b)
    } yield 1).sum)
  } //> minesweeper: (matrix: Array[Array[Boolean]])Array[Array[Int]]

}

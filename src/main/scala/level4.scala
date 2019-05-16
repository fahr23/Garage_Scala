/**
  * Created by FF on 3/10/17.
  */
class level4 {

  def alternatingSums(a: Array[Int]): Array[Int] = {
    val first = a.zipWithIndex.collect { case (x, i) if i % 2 == 0 => x }
    val second = a.zipWithIndex.collect { case (x, i) if i % 2 == 1 => x }
    Array(first.sum, second.sum)
  }

  def addBorder(picture: Array[String]): Array[String] = {
    val header = "*" * (picture(0).length + 2)
    var arr = Array(header)
    picture.map("*" + _ + "*").foreach(x => arr = arr :+ x)
    arr = arr :+ header
    arr
  }

  def arraychange(inputArray: Array[Int]): Int = {

    var result = 0
    for (i <- 0 until inputArray.length - 1) {
      while (inputArray(i + 1) <= inputArray(i)) {
        inputArray(i + 1) = inputArray(i + 1) + 1
        result += 1
      }
    }
    result
  }


  def palindromeRearranging(inputString: String): Boolean = {
    val counts = ('a' to 'z').map(l => inputString.count(_ == l))
    val odds = counts.count(_ % 2 == 1)
    odds < 2
  }

}

/**
  * Created by FF on 3/10/17.
  */

import collection.mutable

class level1_2_3 {

  def centuryFromYear(year: Integer): Integer = {
    val kalan = year % 100;
    if (kalan != 0) {
      return (year - kalan) / 100 + 1
    }
    (year - kalan) / 100;
  }

  def checkPaindrome(string: String): Boolean = {
    val lenStr = string.length();
    if (lenStr == 1)
      return true;

    for (a <- 0 until lenStr) {
      if (string.charAt(a) != string.charAt(lenStr - a - 1))
        return false
    }
    return true
  }

  def adjacentElementProduct(myList: Array[Int]): Integer = {

    var max = myList(0) * myList(1);
    for (a <- 0 until myList.size - 1) {
      if (myList(a) * myList(a + 1) > max) {
        max = myList(a) * myList(a + 1)
      }
    }
    return max
  }

  def shapeArea(n: Integer): Integer = {
    val maxHeihgt = 2 * n - 1
    var shappeArea = 0;

    for (a <- 0 until n) {
      shappeArea += 2 * a + 1;
    }
    2 * shappeArea - maxHeihgt
  }

  def makeArrayConsecutive2(myList: Array[Int]): Integer = {
    val minumum = myList.reduceLeft(_ min _)
    val maximum = myList.reduceLeft(_ max _)
    var result = 0;
    for (a <- minumum until maximum) {
      if (!myList.contains(a))
        result = result + 1;
    }
    result
  }

  def almostIncreasingSequnce(sequence: Array[Int]): Boolean = {

    def removeByIndex(seq: Array[Int], index: Int): Array[Int] = {
      seq.take(index) ++ seq.drop(index + 1)
    }

    def checkSeq(seq: Array[Int], deep: Int): Boolean = {
      if (deep > 1) false
      else {
        var flag = true
        var isIncreasing = true
        var index = 0
        while (flag && index < seq.length - 1) {
          if (seq(index) < seq(index + 1))
            index += 1
          else {
            isIncreasing = checkSeq(removeByIndex(seq, index), deep + 1) || checkSeq(removeByIndex(seq, index + 1), deep + 1)
            flag = false
          }
        }
        isIncreasing
      }
    }

    checkSeq(sequence, 0)

  }

  def matrixElementsSum(matrix: Array[Array[Int]]): Int = {
    matrix.transpose.flatMap(_.takeWhile(_ != 0)).sum
  }

  def allLongestString(inputArray: Array[String]): Array[String] = {
    val longest = inputArray.map(_.length).max
    inputArray.filter(_.length == longest)
  }

  def commonCharacterCount(s1: String, s2: String): Integer = {
    val a = sToArray(s1)
    val b = sToArray(s2)
    a.zip(b).map { case (x, y) => math.min(x, y) }.sum
  }

  def sToArray(s: String): Array[Int] = {
    val a = Array.ofDim[Int](26)
    s.foreach(c => a(c - 'a') += 1)
    a
  }

  def isLucky(n: Int): Boolean = {
    //method 1
    //    val list = n.toString.toList.zipWithIndex
    //    val count = list.length
    //    val sum1 = list.collect{case(v,i) if i<count/2 =>v}.sum
    //    val sum2 = list.collect{case(v,i) if i>=count/2 =>v}.sum
    //    sum1==sum2

    //method2
    //    val s = n.toString
    //    val mid = s.length/2
    //    val a = s.slice(0, mid).map(_.toInt).sum
    //    val b = s.slice(mid,s.length).map(_.toInt).sum
    //    a==b

    //method3
    val str = n.toString
    val (arr1, arr2) = str.splitAt(str.length / 2)
    arr1.map(_.toInt).sum == arr2.map(_.toInt).sum
  }

  def sortByHeight(a: Array[Int]): Array[Int] = {

    val aStack = a
      .filter(_ != -1)
      .sortWith((v1, v2) => v1 > v2)
      .foldLeft(mutable.Stack[Int]())((m, v) => m.push(v))

    (for {v <- a} yield if (v > -1) aStack.pop() else v).toArray

  }

  def reverseParentheses(s: String): String = {
    var i = 0

    def parseL(): String = {
      var acc = ""
      while (i < s.length)
        s(i) match {
          case '(' => i += 1; acc += parseL()
          case ')' => i += 1; return acc.reverse
          case x => i += 1; acc += x
        }
      return acc
    }

    parseL()


  }


}

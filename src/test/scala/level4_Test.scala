import org.scalatest.FunSuite

/**
  * Created by FF on 3/10/17.
  */
class level4_Test extends FunSuite {

  ignore("alternatignSum") {
    val level4 = new level4()
    var inputArray = Array(50, 60, 60, 45, 70)
    var result = Array(180, 105)
    level4.alternatingSums(inputArray).sameElements(result)
  }

  ignore("addBorder") {
    val level4 = new level4()
    var inputArray = Array("abc", "ded")
    var result = Array("*****", "*abc*", "*ded*", "*****")
    level4.addBorder(inputArray).sameElements(result)
  }

  ignore("arrayChange") {
    val level4 = new level4()
    var inputArray = Array(1, 1, 1);
    var result = 3
    assert(level4.arraychange(inputArray) == result);
  }

  test("palindromeRearreging") {
    val level4 = new level4()
    val list1 = "aabb"
    assert(level4.palindromeRearranging(list1) == true)

  }


}

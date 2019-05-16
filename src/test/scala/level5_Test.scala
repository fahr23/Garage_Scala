import org.scalatest.FunSuite

/**
  * Created by FF on 3/10/17.
  */
class level5_Test extends FunSuite {

  test("areEquallyStrong") {
    val level5 = new level5()
    val yourleft = 10
    val yourrigh = 15
    val friendsRight = 10
    val friendleft = 15
    assert(level5.areEquallyStrong(yourleft, yourrigh, friendleft, friendsRight) == true)
  }

  test("arrayMaximalAdjacentDifference") {
    val level5 = new level5()
    val inputArray = Array(2, 4, 1, 0)
    assert(level5.arrayMaximalAdjacentDifference(inputArray) == 3)
  }

  test("isIP") {
    val level5 = new level5()
    val input = ".254.255.0"
    assert(level5.isIPv4Address(input) == false)
  }

  test("boxBlur") {
    val level5 = new level5()
    //create 2d array 3 rows and 3 columns
    val myArray = Array.ofDim[Int](3, 3)

    val result1 = myArray.apply(0)
    result1.update(0, 1)
    result1.update(1, 1)
    result1.update(2, 1)


    val result2 = myArray.apply(1)
    result2.update(0, 1)
    result2.update(1, 7)
    result2.update(2, 1)

    val result3 = myArray.apply(2)
    result3.update(0, 1)
    result3.update(1, 1)
    result3.update(2, 1)

    val realresult = Array.ofDim[Int](1, 1)
    realresult.apply(0).update(0, 1)


    level5.boxBlur(myArray).sameElements(realresult)
  }

  test("munesweeper") {
    val level5 = new level5()
    val myArray = Array.ofDim[Boolean](3, 3)

    val result1 = myArray.apply(0)
    result1.update(0, true)
    result1.update(1, false)
    result1.update(2, false)


    val result2 = myArray.apply(1)
    result2.update(0, false)
    result2.update(1, true)
    result2.update(2, false)

    val result3 = myArray.apply(2)
    result3.update(0, false)
    result3.update(1, false)
    result3.update(2, false)

    val realresult = Array.ofDim[Int](1, 1)
    realresult.apply(0).update(0, 1)

    val myArrayResult = Array.ofDim[Int](3, 3)
    val result11 = myArrayResult.apply(0)
    result11.update(0, 1)
    result11.update(1, 2)
    result11.update(2, 1)


    val result21 = myArrayResult.apply(1)
    result21.update(0, 2)
    result21.update(1, 1)
    result21.update(2, 1)

    val result31 = myArrayResult.apply(2)
    result31.update(0, 1)
    result31.update(1, 1)
    result31.update(2, 1)

    level5.minesweeper(myArray).sameElements(myArrayResult)
  }
}

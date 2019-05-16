import org.scalatest.FunSuite

class level6_Test extends FunSuite {

  test("arrayReplace") {
    val level6 = new level6();
    var inputArray = Array(1, 2, 1)
    var elemtoreplace = 1
    var substitute = 3
    var result = Array(3, 2, 3)
    level6.arrayReplace(inputArray, elemtoreplace, substitute).sameElements(result)
  }

  test("evenDigit") {
    val level6 = new level6();
    var input = 1221
    assert(level6.evenDigitsOnly(input) == false)
  }

  test("variableName") {
    val level6 = new level6()
    assert(level6.variableName("var_1__Int") == true)
  }

  test("alphaticShit") {
    val level6 = new level6()
    val output = level6.alphabeticShift("crazy")
    assert((output == "dsbaz") == false)
  }
}

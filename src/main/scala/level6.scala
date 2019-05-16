class level6 {
  def arrayReplace(inputArray: Array[Int], elemToReplace: Int, substitutionElem: Int): Array[Int] = {

    //    good one
    inputArray.map(i => if (i == elemToReplace) substitutionElem else i)

    //amator one
    //    for (i <- 0 to (inputArray.length - 1)) {
    //      if (inputArray(i) == elemToReplace) {
    //        inputArray(i) = substitutionElem
    //      }
    //    }
    //    inputArray
  }

  def evenDigitsOnly(n: Int): Boolean = {
    n.toString.toList.forall(x => x % 2 == 0)
  }

  def variableName(name: String): Boolean = {
    name.matches("^[a-zA-Z_][a-zA-Z_0-9]*$")
  }

  def alphabeticShift(inputString: String): String = {
    inputString.map(c => if (c == 'z) 'a' else (c + 1).toChar)
  }
}

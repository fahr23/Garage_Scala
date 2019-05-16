import org.scalatest.FlatSpec

/**
  * Created by FF on 3/10/17.
  */
class level1_2_3Test extends FlatSpec {

  it should "level1 centuryFromYear" in {
    val level1 = new level1_2_3();
    val ss = level1.centuryFromYear(1905)
    assert(20 == level1.centuryFromYear(1905))
    assert(17 == level1.centuryFromYear(1700))
  }

  ignore should "level1 paindrome" in {
    val level1 = new level1_2_3();
    assert(level1.checkPaindrome("aabaa") == true)
    assert(level1.checkPaindrome("abac") == false)
    assert(level1.checkPaindrome("a") == true)
  }

  ignore should "adjacnet level2 " in {
    val level1 = new level1_2_3();
    var myList = Array(3, 6, -2, -5, 7, 3)
    assert(level1.adjacentElementProduct((myList)) == 21)
  }

  ignore should "shape area level2" in {
    val level2 = new level1_2_3();
    assert(level2.shapeArea(2) == 5)
    assert(level2.shapeArea(3) == 13)
  }

  ignore should "makeArrayConce" in {
    val level2 = new level1_2_3();
    var myList = Array(6, 2, 3, 8)
    assert(level2.makeArrayConsecutive2(myList) == 3)
  }

  ignore should "almostincreasing" in {
    val level2 = new level1_2_3();
    var mylist1 = Array(1, 3, 2, 1)
    var mylist2 = Array(1, 2, 1, 2)
    var mylist3 = Array(1, 1, 1, 2, 3)
    var mylist4 = Array(1, 3, 2)
    var mylist5 = Array(1, 2, 3, 4, 5, 3, 5, 6)
    var mylist6 = Array(1, 1)
    var mylist7 = Array(1, 2, 3, 4, 3, 6)

    assert(level2.almostIncreasingSequnce(mylist1) == false)
    assert(level2.almostIncreasingSequnce(mylist2) == false)
    assert(level2.almostIncreasingSequnce(mylist3) == false)
    assert(level2.almostIncreasingSequnce(mylist4) == true)
    assert(level2.almostIncreasingSequnce(mylist5) == false)
    assert(level2.almostIncreasingSequnce(mylist6) == true)
    assert(level2.almostIncreasingSequnce(mylist7) == true)

  }

  ignore should "matrixElementsum" in {
    val level2 = new level1_2_3();
    val matrix = Array.ofDim[Int](3, 4);
    matrix(0)(0) = 0;
    matrix(0)(1) = 1;
    matrix(0)(2) = 1;
    matrix(0)(3) = 2;
    matrix(1)(0) = 0;
    matrix(1)(1) = 5;
    matrix(1)(2) = 0;
    matrix(1)(3) = 0;
    matrix(2)(0) = 2;
    matrix(2)(1) = 0;
    matrix(2)(2) = 3;
    matrix(2)(3) = 3;

    assert(level2.matrixElementsSum(matrix) == 9);
  }

  ignore should "testallLongestString" in {
    val level3 = new level1_2_3();
    val list1 = Array("aba", "aa", "ad", "vcd", "aba")
    val result = Array("aba", "vcd", "aba")
    assert(level3.allLongestString(list1).sameElements(result))
  }

  ignore should "testcommongCharacterCount" in {
    val level3 = new level1_2_3();
    val s1 = "aabcc";
    val s2 = "adcaa";

    val s3 = "zzzz";
    val s4 = "zzzzzzz";
    assert(level3.commonCharacterCount(s1, s2) == 3)
    assert(level3.commonCharacterCount(s3, s4) == 4)
  }

  ignore should "isLucky" in {
    val level3 = new level1_2_3()
    val n = 1230
    assert(level3.isLucky(n) == true)

    val m = 239017
    assert(level3.isLucky(m) == false)
  }

  ignore should "sortByHeight" in {
    val level3 = new level1_2_3();
    val a = Array(-1, 150, 190, 170, -1, -1, 160, 180)
    val sort = Array(-1, 150, 160, 170, -1, -1, 180, 190)

    assert(level3.sortByHeight(a).sameElements(sort))
  }

  ignore should "testreverseParantes" in {
    val level3 = new level1_2_3();

    val s = "a(bc)de";
    val result = "acbde";
    assert(level3.reverseParentheses(s).sameElements(result));


    val s1 = "a(bcdefghijkl(mno)p)q";
    val result1 = "apmnolkjihgfedcbq";
    assert(level3.reverseParentheses(s1).sameElements(result1));

    val s2 = "co(de(fight)s)";
    val result2 = "cosfighted";
    assert(level3.reverseParentheses(s2).sameElements(result2));

    val s3 = "Code(Cha(lle)nge)";
    val result3 = "CodeegnlleahC";
    assert(level3.reverseParentheses(s3).sameElements(result3));

    val s4 = "Where are the parentheses?";
    val result4 = "Where are the parentheses?";
    assert(level3.reverseParentheses(s4).sameElements(result4));

    val s5 = "abc(cba)ab(bac)c";
    val result5 = "abcabcabcabc";
    assert(level3.reverseParentheses(s5).sameElements(result5));

    val s6 = "The ((quick (brown) (fox) jumps over the lazy) dog)";
    val result6 = "The god quick nworb xof jumps over the lazy";
    assert(level3.reverseParentheses(s6).sameElements(result6));

  }


}

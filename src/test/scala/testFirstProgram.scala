import org.scalatest.funsuite.AnyFunSuite

class testFirstProgram extends AnyFunSuite{

    test("first") {
      assert(first.adder(4,5)==9)
      assert(first.adder(4,7)==11)
      assert(first.product(3,4)==12)
    }
}

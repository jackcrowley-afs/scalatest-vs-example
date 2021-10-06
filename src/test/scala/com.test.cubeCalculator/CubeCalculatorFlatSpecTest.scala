import org.scalatest.flatspec.AnyFlatSpec

class CubeCalculatorFlatSpecTest extends AnyFlatSpec {
  

    behavior of "CubeCalculator"

    it should "return 27 from 3" in {

        assert(CubeCalculator.cube(3) == 27);
    }

}

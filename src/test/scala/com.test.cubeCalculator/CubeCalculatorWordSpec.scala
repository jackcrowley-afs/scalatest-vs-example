import org.scalatest.wordspec.AnyWordSpec

class CubeCalculatorWordSpec extends AnyWordSpec {
  

    // behavior of "CubeCalculator"

    // it should "return 27 from 3" in {

    //     assert(CubeCalculator.cube(3) == 27);
    // }


    "CubeCalculator" when {
        "calling cube with 2" should {
            "return 8" in {

                assert(CubeCalculator.cube(2) == 8);
            }
        }

    }

}

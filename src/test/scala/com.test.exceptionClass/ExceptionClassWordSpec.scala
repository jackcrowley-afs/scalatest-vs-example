import org.scalatest.wordspec.AnyWordSpec

import com.exceptionClass.ExceptionClass

class ExceptionClassWordSpec extends AnyWordSpec{
  

        "ExceptionClass" when {
        "Calling throwException" should {
            "Throw an Exception Class" in {

                assertThrows[Exception]{

                    ExceptionClass.throwException;
                }
            }
        }

    }
}

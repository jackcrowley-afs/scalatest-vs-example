import org.scalatest.flatspec.AnyFlatSpec

import com.exceptionClass.ExceptionClass

class ExceptionClassSpec extends AnyFlatSpec {
  
    behavior of "ExceptionClass"

    it should "throw an Exception with causeException" in {

        assertThrows[Exception] {ExceptionClass.throwException}
    }

}

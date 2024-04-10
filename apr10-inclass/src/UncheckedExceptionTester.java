import org.junit.jupiter.api.Test;

import javax.lang.model.type.ArrayType;

import static org.junit.jupiter.api.Assertions.*;

class UncheckedExceptionTester {

  @Test
  void testAvg() {
    assertAll(
      () -> assertEquals(5, UncheckedException.mathOp(5, 10, 3)),
      // This throws an exception at runtime because it's an arithmetic error.
//      () -> assertEquals(0, UncheckedException.mathOp(5, 10, 0)),
      // To assert this, we can use "assertThrows".
      // We need to pass the exception type as the "class," and pass the code that
      // throws the exception as a lambda.
      () -> assertThrows(ArithmeticException.class, () -> UncheckedException.mathOp(5, 10, 0)),
      () -> assertDoesNotThrow(() -> UncheckedException.mathOp(5, 10, 3)));
  }
}
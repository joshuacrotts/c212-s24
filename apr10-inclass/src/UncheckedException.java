class UncheckedException {

  /* RuntimeException
     Unchecked exceptions are "runtime" exceptions.
     E.g., ArrayIndexOutOfBoundsException, NumberFormatException,
     StringIndexOutOfBoundsException, EmptyStackException,
     NullPointerException...

     We do NOT need to write code that catches these exceptions, because
     they happen naturally.
   */

  static double mathOp(int x, int y, int z) {
    try {
      return (x + y) / z;
    } catch (ArithmeticException ex) {
      System.err.printf("mathOp: exception thrown: %s\n", ex.getMessage());
      throw new RuntimeException(ex);
    }
  }
}

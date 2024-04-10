class IllegalValueException extends RuntimeException {

  /*
    We can extend exception classes to make them either checked or unchecked!
    The subclass should invoke the superclass constructor.
   */
  IllegalValueException(String msg) {
    super(msg);
  }
}

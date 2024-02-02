import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InClassExamplesTest {

  @org.junit.jupiter.api.Test
  void lastDigitLocation() {
    assertEquals(-1, InClassExamples.lastDigitLocation(""));
    assertEquals(5, InClassExamples.lastDigitLocation("hello5hello"));
    assertEquals(12, InClassExamples.lastDigitLocation("Hi7Hi4Hello10PLPLPL"));
  }

  @Test
  void chickenCounter() {
    assertAll(
            () -> assertEquals(0, InClassExamples.chickenCounter("")),
            () -> assertEquals(0, InClassExamples.chickenCounter("hellochicke")),
            () -> assertEquals(1, InClassExamples.chickenCounter("chickn")),
            () -> assertEquals(2, InClassExamples.chickenCounter("chienchicken")),
            () -> assertEquals(2, InClassExamples.chickenCounter("chickchickenen")),
            () -> assertEquals(7, InClassExamples.chickenCounter("cchchichicchickchickechickennenkenckenickenhicken")));
  }

  @Test
  void chickenCounterTR() {
    assertEquals(0, InClassExamples.chickenCounterTR(""));
    assertEquals(0, InClassExamples.chickenCounterTR("hellochicke"));
    assertEquals(1, InClassExamples.chickenCounterTR("chicken"));
    assertEquals(2, InClassExamples.chickenCounterTR("chickenchicken"));
    assertEquals(2, InClassExamples.chickenCounterTR("chickchickenen"));
    assertEquals(7, InClassExamples.chickenCounterTR("cchchichicchickchickechickennenkenckenickenhicken"));
  }

  @Test
  void chickenCounterLoop() {
    assertEquals(0, InClassExamples.chickenCounterLoop(""));
    assertEquals(0, InClassExamples.chickenCounterLoop("hellochicke"));
    assertEquals(1, InClassExamples.chickenCounterLoop("chicken"));
    assertEquals(2, InClassExamples.chickenCounterLoop("chickenchicken"));
    assertEquals(2, InClassExamples.chickenCounterLoop("chickchickenen"));
    assertEquals(7, InClassExamples.chickenCounterLoop("cchchichicchickchickechickennenkenckenickenhicken"));
  }
}
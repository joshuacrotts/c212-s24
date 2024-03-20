import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AliasTester {

  @Test
  void testAlias() {
    final A a = new A("Howdy"); // 100
    B b = new B(a); // 200
    B b2 = new B(a); // 300
    assertNotEquals(b, b2);

    b = b2; // 300
    assertEquals(b, b2);

    b2 = new B(a); // 400
    assertNotEquals(b, b2); // 300 != 400
    assertEquals(b.getA(), b2.getA()); // 100 == 100

    b2.setA(new A("Hiiiii")); // 500
    assertNotEquals(b.getA(), b2.getA()); // 100 != 500
  }

  @Test
  void testTwo() {
    E e = new E(42);
    assertEquals(42, e.getNumber());

    E[] arrOfE = new E[10];

    for (int i = 0; i < arrOfE.length; i++) {
      arrOfE[i] = new E(i);
    }

    assertNotEquals(arrOfE[2], arrOfE[5]);
    assertNotEquals(arrOfE[2].getNumber(), arrOfE[5].getNumber());

    for (int i = 0; i < arrOfE.length; i++) {
      arrOfE[i] = e;
    }

    assertEquals(arrOfE[2], arrOfE[5]);
    assertEquals(arrOfE[2].getNumber(), arrOfE[5].getNumber());
    arrOfE[7].setNumber(400);
    assertEquals(arrOfE[0].getNumber(), arrOfE[3].getNumber());
  }
}

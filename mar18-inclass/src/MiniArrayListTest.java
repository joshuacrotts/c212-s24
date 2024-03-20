import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiniArrayListTest {

  @Test
  void testMAL() {
    MiniArrayList<Integer> mal1 = new MiniArrayList<>();
    for (int i = 1; i <= 5; i++) {
      mal1.add(i * i);
    }
    assertEquals("[1, 4, 9, 16, 25, null, null, null, null, null]", mal1.toString());

//    mal1.remove(1);
//    assertEquals("[1, 9, 16, 25, null, null, null, null, null, null]", mal1.toString());

    mal1.insert(200, 2);
    assertEquals("[1, 4, 200, 9, 16, 25, null, null, null, null]", mal1.toString());
  }
}
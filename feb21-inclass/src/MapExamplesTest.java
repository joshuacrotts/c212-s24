import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MapExamplesTest {


  @Test
  void testMode() {
    assertAll(
      () -> assertEquals(Set.of(), MapExamples.mode(List.of())),
      () -> assertEquals(Set.of(3), MapExamples.mode(List.of(4, 5, 3, 2, 1, 3, 3, 4, 3))),
      () -> assertEquals(Set.of(2, 3), MapExamples.mode(List.of(2, 3, 2, 3, 2, 3, 1, 3, 2))),
      () -> assertEquals(Set.of(2), MapExamples.mode(List.of(2, 2, 2, 2, 2, 2, 2, 2, 2))));
  }

  @Test
  void testShareFirstChar() {
    Map<Character, Set<String>> exp1 = new TreeMap<>();
    assertEquals(exp1, MapExamples.shareFirstChar(List.of()));

    Map<Character, Set<String>> exp2 = new TreeMap<>();
    exp2.put('b', new TreeSet<>());
    exp2.put('s', new TreeSet<>());
    exp2.put('t', new TreeSet<>());
    exp2.get('s').addAll(Set.of("she", "sells", "sea", "shells", "shore"));
    exp2.get('t').addAll(Set.of("the"));
    exp2.get('b').addAll(Set.of("by"));
    assertEquals(exp2, MapExamples.shareFirstChar(
                          List.of("she", "sells", "sea", "shells",
                                  "by", "the", "sea", "shore")));
  }

  @Test
  void testFirstUniqueLetter() {
    assertAll(
      () -> assertEquals("m", MapExamples.firstUniqueLetter("Morning")),
      () -> assertEquals("w", MapExamples.firstUniqueLetter("sweeps")),
      () -> assertEquals("", MapExamples.firstUniqueLetter("Abra-cadabracad!")));
  }
}
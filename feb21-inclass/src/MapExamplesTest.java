import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MapExamplesTest {

  @Test
  void testMode() {
    assertEquals(Set.of(),
                 MapExamples.mode(List.of()));
    assertEquals(Set.of(),
                 MapExamples.mode(List.of()));
    assertEquals(Set.of(),
                 MapExamples.mode(List.of()));
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
    assertEquals("", MapExamples.firstUniqueLetter(""));
    assertEquals("", MapExamples.firstUniqueLetter(""));
    assertEquals("", MapExamples.firstUniqueLetter(""));
  }
}
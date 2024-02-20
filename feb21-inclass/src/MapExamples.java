import java.util.*;

class MapExamples {

  /**
   * Computes the mode of a list of numbers, which is the most-frequent
   * value, or values.
   * @param ls - list of numbers.
   * @return set of mode values, if they exist.
   */
  static Set<Integer> mode(List<Integer> ls) {
    Set<Integer> s = new HashSet<>();
    if (ls.isEmpty()) {
      return s;
    } else {
      // First, compute the frequencies.
      Map<Integer, Integer> frequencies = new HashMap<>();
      for (int v : ls) {
        if (!frequencies.containsKey(v)) {
          frequencies.put(v, 1);
        } else {
          frequencies.put(v, frequencies.get(v) + 1);
        }
      }

      // Find the highest frequency.
      int highestFreq = -1;
      for (int k : frequencies.keySet()) {
        highestFreq = Math.max(highestFreq, frequencies.get(k));
      }

      // Now, find the values that match that frequency.
      for (int k : frequencies.keySet()) {
        if (frequencies.get(k) == highestFreq) {
          s.add(k);
        }
      }
      return s;
    }
  }

  /**
   * Returns a map whose keys are the first characters of the strings
   * and whose values are sets of strings that start with that character.
   * @param ls - list of strings.
   * @return map of sets of strings.
   */
  static Map<Character, Set<String>> shareFirstChar(List<String> ls) {
    Map<Character, Set<String>> M = new HashMap<>();
    // Populate the map with the initial TreeSets.
    for (String s : ls) {
      char lc = Character.toLowerCase(s.charAt(0));
      if (!M.containsKey(lc)) {
        M.put(lc, new TreeSet<>());
      }
    }

    // Add the strings to each set.
    for (String s : ls) {
      M.get(Character.toLowerCase(s.charAt(0))).add(s);
    }
    return M;
  }

  /**
   * Returns the first unique letter in a string. If there is no unique
   * letter, then the empty string is returned.
   * @param s - string.
   * @return first unique letter as a string.
   */
  static String firstUniqueLetter(String s) {
    Map<Character, Integer> M = new LinkedHashMap<>();
    // Count the frequency of each lowercased letter.
    for (int i = 0; i < s.length(); i++) {
      String c = s.substring(i, i + 1).toLowerCase();
      if (Character.isLetter(c.charAt(0))) {
        M.put(c.charAt(0), M.getOrDefault(c.charAt(0), 0) + 1);
      }
    }

    // Find the first unique letter.
    for (char c : M.keySet()) {
      if (M.get(c) == 1) {
        return String.valueOf(c);
      }
    }
    return "";
  }
}

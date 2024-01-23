class DeFront {

  static String deFront(String s) {
    if (s.isEmpty()) {
      return s;
    } else if (s.length() == 1) {
      return s.charAt(0) == 'a' ? "a" : "";
    } else {
      String ans = "";
      if (s.charAt(0) == 'a') {
        ans += 'a';
      }
      if (s.charAt(1) == 'b') {
        ans += 'b';
      }
      return ans + s.substring(2);
    }
  }
}

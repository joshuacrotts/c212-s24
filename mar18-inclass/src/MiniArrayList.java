import java.util.Arrays;

class MiniArrayList<T> {

  private static final int DEFAULT_CAPACITY = 10;

  private T[] elements;

  private int size;

  MiniArrayList() {
    this.elements = (T[]) new Object[DEFAULT_CAPACITY];
    this.size = 0;
  }

  /**
   * Adds the element to the end of the list.
   * @param t - the element to add.
   */
  void add(T t) {
    if (this.size == this.elements.length) {
      this.resize();
    }
    this.elements[this.size] = t;
    this.size++;
  }

  /**
   * Removes the element at the given index. All elements are shifted
   * down by one.
   * @param sidx - element index to remove. We assume it is in bounds.
   */
  void remove(int sidx) {
    // Remove the element by simply shifting everything to the left.
    // This overwrites the existing value.
    this.shiftLeft(sidx);
    this.size--;
    this.elements[this.size] = null;
  }

  /**
   * Inserts the element t at the given index. All elements to its
   * right are shifted by one, which may require a resize.
   * @param t
   * @param sidx
   */
  void insert(T t, int sidx) {
    // If the array is full, let's resize.
    if (this.size == this.elements.length) {
      this.resize();
    }

    // Shift right at the given index.
    this.shiftRight(sidx);

    // Insert the element in the correct place.
    this.elements[sidx] = t;

    this.size++;
  }

  T get(int sidx) {
    return this.elements[sidx];
  }

  int size() {
    return this.size;
  }

  @Override
  public String toString() {
    return Arrays.toString(this.elements);
  }

  private void resize() {
    T[] tempArray = (T[]) new Object[this.elements.length + DEFAULT_CAPACITY];
    for (int i = 0; i < this.elements.length; i++) {
      tempArray[i] = this.elements[i];
    }
    this.elements = tempArray;
  }

  private void shiftRight(int sidx) {
    for (int i = this.size; i >= sidx; i--) {
      this.elements[i] = this.elements[i - 1];
    }
  }

  private void shiftLeft(int sidx) {
    for (int i = sidx + 1; i <= this.size; i++) {
      this.elements[i - 1] = this.elements[i];
    }
  }
}

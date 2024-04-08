class Lit implements IExpr {

  private int val;

  Lit(int val) {
    this.val = val;
  }

  @Override
  public int eval() {
    return this.val;
  }
}

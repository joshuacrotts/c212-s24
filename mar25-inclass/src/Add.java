class Add implements IExpr {

  private IExpr e1;
  private IExpr e2;

  Add(IExpr e1, IExpr e2) {
    this.e1 = e1;
    this.e2 = e2;
  }

  @Override
  public int eval() {
    return this.e1.eval() + this.e2.eval();
  }
}

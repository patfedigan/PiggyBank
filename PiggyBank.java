class PiggyBank {

  Integer total;
  Boolean broken;

  public PiggyBank() {
    total = 0;
    broken = false;
  }

  public void deposit(Integer amount) {
    if(!broken)
      total += amount;
  }

  public Integer smash() {
    broken = true;

    return total;
  }

  public boolean isBroken() {
    return broken;
  }
}

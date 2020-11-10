class Main {
  public static void main(String[] args) {
    Counter tally = new Counter();
    tally.count();
    tally.count();
    tally.count();
    tally.count();
    tally.count();
    tally.count();
    int result = tally.getValue();
    System.out.println("the counter is at: "+result);
    tally.reset();
    result = tally.getValue();
    System.out.println("the counter is at: "+result);
    tally.count();
    tally.count();
    tally.count();
    tally.count();
    result = tally.getValue();
    System.out.println("the counter is at: "+result);
  }
}
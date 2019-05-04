package org.katas.refactoring.fizzbuzz.speculative.generality.specification;

public class DividedByFiveSpecification extends AbstactSpecification {

  public boolean isSatisfiedBy(int input) {
    return input % 5 == 0;
  }
}

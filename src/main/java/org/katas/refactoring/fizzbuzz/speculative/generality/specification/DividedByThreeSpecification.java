package org.katas.refactoring.fizzbuzz.speculative.generality.specification;

public class DividedByThreeSpecification  extends AbstactSpecification{
  public boolean isSatisfiedBy(int input) {
    return input%3 == 0;
  }
}

package org.katas.refactoring.fizzbuzz.speculative.generality.specification;

public class DividedBySevenSpecification  extends AbstactSpecification{
  public boolean isSatisfiedBy(int input) {
    return input%7 == 0;
  }
}

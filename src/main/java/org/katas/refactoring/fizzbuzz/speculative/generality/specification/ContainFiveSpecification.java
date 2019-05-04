package org.katas.refactoring.fizzbuzz.speculative.generality.specification;

public class ContainFiveSpecification extends AbstactSpecification{
  @Override
  public boolean isSatisfiedBy(int input) {
    return String.valueOf(input).contains("5");
  }
}

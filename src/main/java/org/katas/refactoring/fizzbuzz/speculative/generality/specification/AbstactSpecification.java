package org.katas.refactoring.fizzbuzz.speculative.generality.specification;

public abstract class AbstactSpecification implements MatchCriteria{
  public MatchCriteria and(MatchCriteria matchCriteria) {
    return new AndSpecification(this, matchCriteria);
  }

  public MatchCriteria or(MatchCriteria matchCriteria) {
    return new OrSpecification(this, matchCriteria);
  }


  public MatchCriteria not() {
    return new NotSpecification(this);
  }
}


class AndSpecification extends AbstactSpecification implements MatchCriteria{

  private final AbstactSpecification left;
  private final MatchCriteria right;

  public AndSpecification(AbstactSpecification left, MatchCriteria right) {

    this.left = left;
    this.right = right;
  }

  @Override
  public boolean isSatisfiedBy(int input) {
    return left.isSatisfiedBy(input) && right.isSatisfiedBy(input);
  }
}



class OrSpecification extends AbstactSpecification implements MatchCriteria{


  private final AbstactSpecification left;
  private final MatchCriteria right;

  public OrSpecification(AbstactSpecification left, MatchCriteria right) {

    this.left = left;
    this.right = right;
  }

  @Override
  public boolean isSatisfiedBy(int input) {
    return left.isSatisfiedBy(input) || right.isSatisfiedBy(input);
  }
}



class NotSpecification extends AbstactSpecification implements MatchCriteria{


  private AbstactSpecification origin;

  public NotSpecification(AbstactSpecification origin) {

    this.origin = origin;
  }

  @Override
  public boolean isSatisfiedBy(int input) {
    return !origin.isSatisfiedBy(input);
  }
}
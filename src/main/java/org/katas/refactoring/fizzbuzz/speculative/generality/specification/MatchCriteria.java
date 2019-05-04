package org.katas.refactoring.fizzbuzz.speculative.generality.specification;

public interface MatchCriteria {
  boolean isSatisfiedBy(int input);

  MatchCriteria and(MatchCriteria matchCriteria) ;

  MatchCriteria or(MatchCriteria matchCriteria) ;

  MatchCriteria not() ;
}

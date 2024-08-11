package org.example.comparator_using_lambda;

import java.util.Comparator;

public class MyCompareClass implements Comparator<Integer> {
  @Override
  public int compare(Integer alpha, Integer beta) {
    return beta-alpha; //0 for same,  -1 for beta < alpha meaning low priority,
                       //1 for beta>alpha high priority;
  }
}

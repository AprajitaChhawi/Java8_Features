package org.example.lambdaexpressions;

import java.util.List;

@FunctionalInterface
public interface Sort {
  List<Integer> sort(List<Integer> list);
}

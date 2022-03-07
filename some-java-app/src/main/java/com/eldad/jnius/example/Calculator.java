package com.eldad.jnius.example;

import java.util.List;

public class Calculator {
  private int factor;
  private int steps;
  public Calculator(int initial_factor, int steps) 
  {
    this.factor = initial_factor;
    this.steps = steps;
  }

  public float calculateMean(List<Integer> numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.size(); i++) {
      sum += numbers.get(i);
    }
    return (float) sum / (float) numbers.size();
  }
  
  public float calculateFactoredMean(List<Integer> numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.size(); i++) {
      sum += numbers.get(i) * this.factor;
    }
    this.factor += this.steps;
    return (float) sum / (float) numbers.size();
  }
}

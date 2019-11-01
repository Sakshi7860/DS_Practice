package com.practice.HackerRankQue;

import java.util.Optional;

public class Test {
    public static Optional<Integer> f(int i) {
        return i % 2 == 0 ? Optional.empty() : Optional.of(i);
    }
    public static void main (String[] args) {
        System.out.println ("" + Test.f(Optional.of(3).get()).get());
    }
}
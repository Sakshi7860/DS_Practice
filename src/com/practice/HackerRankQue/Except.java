package com.practice.HackerRankQue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MyException extends Exception{}

class BadArgsException extends MyException {}

public class Except {
	public static boolean checkArgs(String[] args) throws BadArgsException {
        if (args.length != 2) {
            throw new BadArgsException();
        }
//        OtherStuff.calculate(args);
//        return true;
		return false;
    }
    public static void main(String[] args) {
    	
    	Map<String,List<Integer>> x = new HashMap();
        try {
            Except.checkArgs(args);
        
        } catch (BadArgsException b) {
            System.out.println("Bad arguments");
            System.exit(-1);
        }
        catch (MyException e) {
            System.out.println("Unknown exception");
            System.exit(-2);
        System.out.println("Success");
    }
}}
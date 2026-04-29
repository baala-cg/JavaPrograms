package com.BasicPrograms;

public class PowerOfTwoChecker {
	
	    public static boolean isPowerOfTwo(int n) {
	    	int count = 0;
	        if (n <= 0) {
	            return false;
	        }
	        while (n % 2 == 0) {
	            n /= 2;
	            count++;
	        }
	        System.out.println(count);
	        return n == 1;
	    }
	    
	    public static void main(String[] args) {
	        int n = 64;
	        System.out.println("Is " + n + " a power of two? " + isPowerOfTwo(n));
	    }
	}




package com.BasicPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
	
//	Using list
	public static boolean isValid(String s) {
		List<Character> list = new ArrayList<>();

		for (char ch : s.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				list.add(ch); // Push to the end of the list
			} else {
				if (list.isEmpty())
					return false;
				System.out.println("Size: " + (list.size() - 1));

				char top = list.remove(list.size() - 1); // Pop from the end of the list
				System.out.println("Top: " + top);
				System.out.println("Char: " + ch);
				if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
					return false;
				}
			}
		}
		return list.isEmpty();
	}

	
//	Using stack
	public static boolean isValidStack(String s) {
		Deque<Character> stack = new ArrayDeque<>();

		for (char ch : s.toCharArray()) {
			// Push opening brackets
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			// Handle closing brackets
			else {
				if (stack.isEmpty())
					return false;

				char top = stack.pop();

				if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(isValid("()")); // true
//		System.out.println(isValid("()[]{}")); // true
		System.out.println(isValid("(]")); // false
//		System.out.println(isValid("([])")); // true
	}
}

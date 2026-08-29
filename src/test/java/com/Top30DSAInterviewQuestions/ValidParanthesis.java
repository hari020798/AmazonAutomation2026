package com.Top30DSAInterviewQuestions;

import java.util.Stack;

public class ValidParanthesis {
	


	    public static boolean validParentheses(String str) {

	        Stack<Character> st = new Stack<>();

	        for (int i = 0; i < str.length(); i++) {

	            char current = str.charAt(i);

	            // Opening brackets
	            if (current == '(' || current == '[' || current == '{') {
	                st.push(current);
	            }

	            // Closing brackets
	            else {

	                if (st.isEmpty()) {
	                    return false;
	                }

	                char top = st.pop();

	                if ((current == ')' && top != '(') ||
	                    (current == ']' && top != '[') ||
	                    (current == '}' && top != '{')) {

	                    return false;
	                }
	            }
	        }

	        return st.isEmpty();
	    }

	    public static void main(String[] args) {

	        System.out.println(validParentheses("()"));
	        System.out.println(validParentheses("()[]{}"));
	        System.out.println(validParentheses("(]"));
	        System.out.println(validParentheses("([)]"));
	        System.out.println(validParentheses("{[]}"));

	    }
	}



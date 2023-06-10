package org.example;
import  java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Infix to postfix");
        System.out.println("Result is "+ solve("a*(r+o*h)"));
    }


    public static String solve(String A) {
        int n=A.length();
        StringBuilder res = new StringBuilder("");
        char ch='x';
        Stack<Character> s=new Stack<Character>();

        for (int i = 0; i < n; i++) {
            ch = A.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                res.append(ch);
            else {
                if (ch == '(') s.push(ch);  ///push directly
                else if (ch == ')') {     //pop until open bracket not found
                    while (!s.isEmpty() && s.peek() != '(')  {
                        res.append(s.peek());
                        s.pop();
                    }
                    s.pop();
                }
                else {  // pop if top precedence <= current and top!= '('
                    while (!s.isEmpty()  && s.peek() != '(' && (checkPrec(s.peek()) >= checkPrec(ch))) {
                        res.append(s.peek());
                        s.pop();
                    }
                    s.push(ch);
                }
            }
        }
        while (!s.isEmpty()) {
            res.append(s.peek());
            s.pop();
        }
        return res.toString();
    }

   static int checkPrec(char ch) {

        if (ch == '^') return 3;
        else if (ch == '/' || ch == '*') return 2;

        return 1;
    }
}
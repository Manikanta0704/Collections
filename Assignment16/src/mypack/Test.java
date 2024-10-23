package mypack;

import java.net.MulticastSocket;

public class Test {
	public static void main(String[] args) {
		int[] arr1 = { 6, 2, 4 };
		int[] arr2 = { 3, 1 };

		int rem1 = 0;
		for (int i : arr1) {
			rem1 *= 10;
			rem1= rem1 + i;
		}
		int rem2 = 0;
		for (int i : arr2) {
			rem2 *= 10;
			rem2 = rem2 + i;
		}
		System.out.println(rem1);
		System.out.println(rem2);
		System.out.println(rem1*rem2);

	}
}

//
//public class Test {
//	
//    public static String swap(String str, int i, int j) {
//        char[] charArray = str.toCharArray();
//        char temp = charArray[i];
//        charArray[i] = charArray[j];
//        charArray[j] = temp;
//        return String.valueOf(charArray);
//    }
//
//    public static void permute(String str, int start, int end) {
//        if (start == end) {
//            System.out.println(str);
//        } else {
//            for (int i = start; i <= end; i++) {
//                str = swap(str, start, i);   
//                permute(str, start + 1, end);
//                str = swap(str, start, i);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        String input = "ABC";
//        int n = input.length();
//        System.out.println("Permutations of the string \"" + input + "\":");
//        permute(input, 0, n - 1);
//    }
//}

//
//import java.util.Stack;
//
//public class Test {
//
//    public static boolean isBalanced(String str) {
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < str.length(); i++) {
//            char currentChar = str.charAt(i);
//
//            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
//                stack.push(currentChar);
//            }
//            else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
//                if (stack.isEmpty()) {
//                    return false;
//                }
//                char topChar = stack.pop();
//                if (!isMatchingPair(topChar, currentChar)) {
//                    return false;
//                }
//            }
//        }
//
//        return stack.isEmpty();
//    }
//
//    public static boolean isMatchingPair(char open, char close) {
//        return (open == '(' && close == ')') ||
//               (open == '{' && close == '}') ||
//               (open == '[' && close == ']');
//    }
//
//    public static void main(String[] args) {
//        String input = "([{}])";
//
//        if (isBalanced(input)) {
//            System.out.println("Balanced");
//        } else {
//            System.out.println("Not Balanced");
//        }
//    }
//}

package org.example;
import java.util.Stack;

public class StringProcessor {

    /**
     * Checks if the provided password is strong.
     * A strong password must contain at least one uppercase letter,
     * one lowercase letter, one digit, and one special symbol.
     */
    public static boolean isStrongPassword(String password) {
        // Check if the password contains any spaces
        if (password.contains(" ")) {
            System.out.println("Invalid Password: Password should not contain spaces.");
            return false;
        }
        // check if password has at least 8 characters
        boolean hasAtLeast8Chars = password.length() >= 8;
        //check the password
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);  // Get the character at the current index
            // Check if character is an uppercase letter
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            // Check if character is a lowercase letter
            else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            }
            // Check if character is a digit
            else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }
        boolean isStrongPassword = hasAtLeast8Chars && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
        return isStrongPassword;
    }

    /**
     * Counts the number of digits in a given sentence.
     */
    public static int calculateDigits(String sentence) {
        int digitCount = 0;  // counter for digits
        for (int i = 0; i < sentence.length(); i++) {
            // If the current character is a digit, increment the counter
            if (Character.isDigit(sentence.charAt(i))) {
                digitCount++;
            }
        }
        return digitCount;  //  total count of digits
    }

    /**
     * Calculates the number of words in a sentence.
     * Words are considered to be separated by spaces.
     */
    public static int calculateWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            // If the sentence is null or empty, return 0
            return 0;
        }

        // Split the sentence by spaces and count the resulting array length
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    /**
     * Evaluates a mathematical expression given as a string.
     * The expression can contain numbers, arithmetic operators, and brackets.
     */
    public static double calculateExpression(String expression) {
        // Stack for numbers
        Stack<Double> operands = new Stack<>();
        // Stack for operands
        Stack<Character> operators = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            // Skip any whitespace
            if (ch == ' ') {
                continue;
            }

            // If the character is a digit, extract the entire number
            if (Character.isDigit(ch)) {
                double num = 0;
                // Continue reading until all digits of the number are extracted
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + Character.getNumericValue(expression.charAt(i));
                    i++;
                }
                i--;  // Adjust the index to account for extra increment in the loop
                operands.push(num);  // Push the complete number to the operands stack
            }

            // If the character is an operator
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // Check if current operator has lower precedence and apply operations
                while (!operators.isEmpty() && hasPrecedence(ch, operators.peek())) {
                    operands.push(applyOperation(operators.pop(), operands.pop(), operands.pop()));
                }
                // Push the current operator to the operator stack
                operators.push(ch);
            }
        }

        // Apply remaining operations in the stacks
        while (!operators.isEmpty()) {
            operands.push(applyOperation(operators.pop(), operands.pop(), operands.pop()));
        }

        return operands.pop();  // Return the final result
    }

    /**
     * Helper method to check operator precedence.
     * Multiplication and division have higher precedence than addition and subtraction.
     */
    public static boolean hasPrecedence(char op1, char op2) {
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        return true;
    }

    /**
     * Helper method to apply an arithmetic operation between two operands.
     */
    public static double applyOperation(char op, double b, double a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;
        }
        return 0;
    }

}


# StringProcessor Java Project

## Overview

The **StringProcessor** class is a Java implementation that provides utility methods for various string processing tasks. It includes methods for checking password strength, counting digits and words in a sentence, and evaluating simple mathematical expressions. This project demonstrates fundamental programming concepts such as string manipulation, control structures, and stack usage for expression evaluation.

## Features

1. **isStrongPassword(String password)**  
   - Checks if the provided password meets the criteria for strength:
     - At least 8 characters in length.
     - Contains at least one uppercase letter.
     - Contains at least one lowercase letter.
     - Contains at least one digit.
     - Contains at least one special character.
   - Returns `true` if the password is strong; otherwise, returns `false`.

2. **calculateDigits(String sentence)**  
   - Counts the number of digits in the given sentence.
   - Returns the count of digits.

3. **calculateWords(String sentence)**  
   - Calculates the number of words in a given sentence, where words are defined as sequences separated by spaces.
   - Returns the count of words.

4. **calculateExpression(String expression)**  
   - Evaluates a mathematical expression provided as a string, supporting basic arithmetic operations (+, -, *, /) and parentheses.
   - Returns the result of the expression.
## Test Cases

### 1. **isStrongPassword Test Cases**
| Test Case                          | Input                   | Expected Output |
|------------------------------------|-------------------------|------------------|
| Valid strong password               | `"Meka123!"`            | `true`           |
| Missing lowercase                   | `"MEKA123!"`            | `false`          |
| Missing uppercase                   | `"meka123!"`            | `false`          |
| Missing digit                       | `"Meka!"`               | `false`          |
| Missing special character           | `"Meka1234"`            | `false`          |
| Contains spaces                     | `"Meka 123!"`           | `false`          |

### 2. **calculateDigits Test Cases**
| Test Case                              | Input                          | Expected Output |
|----------------------------------------|--------------------------------|------------------|
| Count digits in a sentence             | `"1 cat and 5 dogs"`          | `2`              |
| All digits                             | `"123456789"`                  | `9`              |
| No digits                              | `"Hello world!"`               | `0`              |
| Count a single digit                   | `"hi 1 "`                       | `1`              |
| Empty string                           | `""`                           | `0`              |

### 3. **calculateWords Test Cases**
| Test Case                          | Input                       | Expected Output |
|------------------------------------|-----------------------------|------------------|
| Normal sentence                     | `"Hello cat"`               | `2`              |
| Only spaces                        | `"   "`                      | `0`              |
| Multiple words                     | `"One two"`                 | `2`              |
| Single word                        | `"Cyber"`                   | `1`              |
| Longer sentence                    | `"Java is good"`            | `3`              |

### 4. **calculateExpression Test Cases**
| Test Case                              | Input                             | Expected Output |
|----------------------------------------|-----------------------------------|------------------|
| Basic arithmetic                       | `"3 + 59 * 9"`                    | `534.0`          |
| Simple addition                        | `"10 + 6"`                        | `16.0`           |
| Multiplication and addition            | `"100 * 2 + 12"`                 | `212.0`          |
| Expression with brackets               | `"19 * ( 8 + 19 )"`              | `513.0`          |
| Single multiplication                  | `"100 * 9"`                       | `900.0`          |
=======
# string_processing
# string_processing
# string_processing


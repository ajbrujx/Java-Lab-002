# Java-Lab-002

## Variables, Types and Operators

Be able to explain what variables are. Understand variable types, allowed names, and valid values.
Know how to create and use string, integer, floating-point, and boolean variables.

### Part 1 - LikeAGirl.java - [Like a Girl](https://www.youtube.com/watch?v=5yLXrWLvwAo)

The lab template contains a program that prints the following if you choose "0":
```
What does it mean to do something, "Like a Girl"?
Show me what it looks like to run, "Like a Girl."
Show me what it looks like to fight, "Like a Girl."
How do you think it affects them when somebody uses "Like a Girl" as an insult? Choice (good: 0, bad: 1) 0
You answered 0
Always wants to change that.
Emotional Damage 100.000000.
Did you answer like a nice person? FALSE
```
... OR the following if you choose "1":
```
What does it mean to do something, "Like a Girl"?
Show me what it looks like to run, "Like a Girl."
Show me what it looks like to fight, "Like a Girl."
How do you think it affects them when somebody uses "Like a Girl" as an insult? Choice (good: 0, bad: 1) 1
You answered 1
Good for you.
Emotional Damage 0.000000.
Did you answer like a nice person? TRUE
```

Ignore the code that you don't fully recognize and concentrate on changing the variables to alter the script to say the following if 1 is chosen:
```
What does it mean to do something, "Like a Boy"?
Show me what it looks like to run, "Like a Boy."
Show me what it looks like to fight, "Like a Boy."
How do you think it affects them when somebody uses "Like a Boy" as an insult? Choice (good: 1, bad: 2) 1
You answered 1
Good for you.
Emotional Damage 50.000000.
Did you answer like a nice person? TRUE
```
OR to say the following if 2 is chosen:
```
What does it mean to do something, "Like a Boy"?
Show me what it looks like to run, "Like a Boy."
Show me what it looks like to fight, "Like a Boy."
How do you think it affects them when somebody uses "Like a Boy" as an insult? Choice (good: 1, bad: 2) 2
You answered 2
Always wants to change that.
Emotional Damage 100.000000.
Did you answer like a nice person? FALSE
```

### Part 2 - Interpretation
Take note of the various variables and their data types. Write a brief summary in this section of the README.md file listing the:

* My code contains variables of the following type:
  * float: float is a Primitive Data Type. It can store 32 bit floating point value. A bit is used for the +/- sign of the value, an Exponent field that determines the precision (the floating of the point), and the fraction part in binary
    * emotionalDamage
  * boolean: A primitive type. It's either TRUE or FALSE. Nothing fancy. Dry toast
    * checksumOkay
    * containsChar
    * containsWhite
    * containsSpecial
    * trueOrFalse
  * char: Another primitive. Stores a single character in 
    * checksumChar
  * int: Primitive data type. Stores an integer value in 32-bit memory
    * i
  * Strings: Strings are non-primitive variables, meaning they are comprised of primitives. When the compiler scans the code, the String variables are detected, and their values are stored in the Constant Pool within the Class file. The compiler creates a char[] array and stores the individual characters into each index of the array. During runtime, the Constant pool is in the Stackframe. When the variable is declared at runtime, the variable name is created in temporary memory on the Heap, and is assigned the address of the char[] array within the Constant Pool
    * script1_gender
    * script2_verb_gender
    * script3_gender
    * script4_string
    * script5_1
    * script5_2
    * script6_float
    * script7_bool
    * scriptChoice
    * scriptDivider
    * scriptInvalid
    * verbRun
    * verbFight
    * genderBoy
    * good
    * bad
    * typeChar
    * typeSpecial
    * typeWhite
    * userString;


Variable cannot be called:
  * "public" because it is a reserved keyword
  * "1wrongvar" because it has a leading number.

Wrong variable assignment:
1. 
```
boolean trueOrFalse = "True";
```
A boolean cannot contain a String.
2.

```
String badNum = 13;
```
A String cannot contain an int.


### Part 3 - Bonus: Play around with Java String Format Specifiers.

Pick several of the Java format specifiers below and define variables of the correct type utilize **sout** and **String.format** to view the resulting formats.

![Format Specifiers](JavaStringFormatSpecifiers.png)

### Part 4 - Submission
* Just as you did last week (Reference the Lab video in your Week 1 module), create a Feature1 branch of your code
* Commit your working code to your local copy
* Push it to your Remote/origin branch (i.e. GitHub: Feature1 -> origin/Feature1)
* Then issue a Pull request to my instructor branch
    * Make sure to **COPY** the Pull request URL and submit it for the lab/assignment.

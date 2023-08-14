package Java_Basics;

public class JavaBasics{
 /*
 - Public so that it can be access from anywhere.
 - Class is the named group of properties and functions. It is basically a template or a logical construct
 - Class name and file name should be same.
 - Now we we write a funtion inside this class (boilerplate code)
 */

    public static void main(String args[]){
     /*
     - static
     - void is used so that the method should not have any return value
     - main is the name of fuction
     - String args []
     */

        System.out.print("Hello World");

      /*
      OUTPUT
       - System.out.print :- System is a class out is variable and print is method,
         this mean print the output on standard output stream.
         println and \n is used to move cursor in next line.
       - Inside print function we write what we want to print in "".
       - Terminator (;) it is statement terminator it informs compiler that code ends.

      INPUT
       - Scanner input = new Scanner(System.in) :- Scanner is class, sc is variable, new to create
         new object and System.in takes input from standard input (in this case we have keyboard).

        -Types
          next
          nextLine
          nextInt
          nextByte
          nextFloat
          nextDouble
          nextBoolean
          nextShort
          nextLong

          Eg:- Scanner input = new Scanner(System.in);
          String input = input.next()
          int otherInput= otherInput.nextInt();
      */

    }
}

/*
- Variables :- whose value can be change.
  Eg:- int a , char b
  How to define?
  int a = 10 ;  int is type of variable,  a is name of variable or identifier

- Literals :- values which are universal can't be change.
  Eg:- 2, 4, a, b

- DATATYPES:-
    byte  1byte
    bolean 1byte
    char 2byte
    float 4byte
    int 4byte
    long 8byte
    double 8byte
    short 2byte
    Every datatype has different size and memory management efficiently is all we needed.


 -Primitivies and  Non-Primitives
  Typed language is language in which we define the type of variables.
  Its examples are java, c++,python
  Javascript is a non-typed language

 - Primitive datatype


- Type Conversion & Type Casting:-
   Type conversion is convertering the datatype to different compatible datatype
   Type Casting is forcefully converting when java doesn't allows us.

 byte < short < int < float < long < double

 For conversion there are 2 possibilities
   Type compatible
   Destination > Source

 Widening / Implicit / Automatic type conversion
   when we assign smaller datatype's value to bigger datatype's value
    Eg:-int a = 2;
        long b = a ;

 Narrowing / Explicit / lossy type conversion
    when we assign bigger datatype's value to smaller datatype's value
    Eg:- float a = 25.0;
         int b = (int) a;


- Type Promotion
  While evaluationg expression values can be promoted

  Conditions for type promotion:-
    Java automatically promotd each byte, short, char to int when evaluating expression
    If a operand is long, float or double then whole expression is converted to biggest one.




- How code runs?

  SourceCode(.java)  ->Compiler-> ByteCode(.class) ->JVM(interpreter)-> MachineCode
            (Compilation)                                     (Execution)

  JDK
  JRE
  JVM
  JIT
*/



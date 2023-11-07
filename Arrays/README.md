 - Arrays
     List of Elements of the same type placed in a contiguous memory location.
      OR
     Data Structure is the collection of similar types of data.

     datatype [] variable name =new datatype [size];
     Eg:- int [] arr = new int [5];

     Operations:-
         Create
            datatype [] variable name =new datatype [size];
            Eg:- int [] arr = new int [5];
         Input
            int [] numbers = {1,2,3,4};
            String [] names = {"Anshul", "Rahul", "Ram"}
         Update
            int [] numbers = {1,2,3,4};
            numbers[2] = 5;
         Output

     - Internal Working:-
          int [] arr    -> Declaration of array
                           The array is defined in stack memory in compile time.

          arr = new int [5]  -> Initialization of array
                                 The object is created in heap memory at runtime.


    - It has 0-based indexing.
    - Default value of the array is 0 or null.
    - Values of array is itself an object and stored in different parts of the heap.
    - It is mutable that is it can change objects.
      (If two variable points to an object, if one changes another will be affected).


    Advantages of Arrays:-
      Random access
      Cache friendliness

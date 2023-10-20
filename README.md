# Data-Structures-Algorithms
This is a Repo made to hold a summary of the course from Mosh named: The Ultimate Data Structures And Algorithms.<br />
the course is divided in 3 parts:<br />
1. Linear
2. non-linear
3. search and sort

each having their own seperate packages.<br />
in this article we are going to have a summary of O notation (big O).<br />
## Big 0 Notation
From what wikipedia says:<br />
***Big O notation is a mathematical notation that describes the limiting behavior of a function when the argument tends towards a particular value or infinity***<br />
To make it more simple, this notation is used to represent the time it takes for an algorithm to run or to put it more in academical terms, to represent the time complexity of an algorithm relatively. relatively being used because we can never measure exactly how much it takes for an algorithm to run and we can estimate it's run time relative to it's input size. it is also worth mentioning that we dont measure in time (i.e seconds, milliseconds , etc) because algorithms run differently on different machines and produce different time specs with each run, even on the same machine, so the only variable that can be used is the input size of the algorithm<br />
there are many many variants of this notation but we are going to look the most common one which are:<br />
+ O(1)
+ O(n)
+ O(n ^ 2)
+ O(logn)
+ O(2 ^ n)
<br />

### O(1)
Called O of constant (Constant Complexity), this notation reprsents algorithms that always have the same run time no matter the input size.to give tou an example the get() method of ArrayList is a of O(1):<br />
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/fa5bfa10-5558-4598-a8a3-9689b36699da)<br />
the get() method is a single operation that always runs the same way. so no matter the size of the input whether it be 1 or 1000000 the get() method runs the same and returns a single value hence it has O(1).
### O(n)
Called O of N (Linear Complexity), this notation represents algorithms that increase their time complexity in correlation to their input size, meaning as the size of the input grows, the runtime of the algorithm grows a much.<br />
A great example is looping over an array:<br />
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/53e299f8-e842-4ddc-9ea9-dbb7299f466e)<br />
these loops print each element of the array and for each iteration a single operation happens, so if the size of the array is N the we have N * O(1) which will leave us with O(N). wich depends the running time of the algorithm to the size of the input.<br />
as you can see the method of looping over an array is not important, however if we have two different array in the input with respective sizes of N and M then our running time of the algorithm would be O(N + M) which is still considered as O(N) because it still depends on the input size and grows the same as them.
### O(n ^ 2)
Called O of N ^ 2 (Quadratic Complexity), this notation represents algorithms that are dependent on the input size and are much slower than algorithms of O(N). these algorithms have exponential growth.<br />
nested loops are great examples of this notation:<br />
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/9e28f519-adfb-4049-8918-51ff0274fba1)
### O(logn)
Called O of logn (Logarithmic Complexity), these are algorithms that are much more effiecient and scalable than algorithms of O(N) and O(N ^ 2).<br />
LogN is a function that approximates to a single value as it reaches infinity, so in terms of algorithms, as much as the input size grows, the runtime of the algorithm approximates to a value (or slows it's growth in other words).<br />
a perfect example for this notation is binary search which we'll discuss in it own chapter but to give you a bird's eye view a binary search is an algorithm that searchs for a value in a sorted array by splitting the array from the middle and checking if the middle value is greater or lower than the requested value and searches the corresponding half and so on.<br />
this search algorithm has O(logn) and for example if we have an unput of size 1 million then with a maximum of 19 searches we can find our desired value.
### O(2 ^ n)
Called O of 2 ^ N (Exponential Complexity), is the opposite of logarithmic growth and are the worst possible runtime and algorithm can have, because they get very slow very fast.<br />
to make understand what 2 ^ N means, think of a set of N switches, each switche can be on or off, so the total subsets of this set is 2 ^ N. the computer science example would be recursion algorithms
## Growth Chart
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/c7a91e75-813b-4a00-ac35-bee6d8472ee7)

## Arrays

* Simplest data structure
* Data is stored at contiguous memory locations
* Saves data in a sequential order
* in dynamic languages like python it's size is dynamic and can shrink or enlarge as needed but in java it is static so it's size wont shrink or enlarge
* java provides two dynamic implementation: Vector and ArrayList
* in ArrayList the size grows by 50% and in Vector it grows 100%
* Vectors are synchronized but ArrayLists are not which makes them more suitable for multi threaded applications
* they are mostly used when you know how many items you are going to have ahead of time
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/ff0e3d12-a62a-4054-acf8-64e78c94518b)<br />

## LinkedList

* Second most used Data Structure
* data is stored sequentially but they are not at contiguous memory locations and are distrubted across memory and each element (Also Called a Node) has a pointer to the next
* because of this, LinkedList can grow or shrink without having to copy the prevoius data (Automatically) but because of the pointer to other Nnodes each node consumes a bit more memory
* because memory is easily allocated and deallocated at runtime insertion and deletions are relatively easier to arrays and data need not be shifted
* the First and the Last Node are called Head and Tail repectively
* it is the backbone of some advanced Data Structures such as Stack, Queue, Graph, Hashmap, etc
* to access an element the whole list must be traversed hence no random access (using index to get the element) and harder data manipulation
* Searching for a specific value in a linked list involves traversing the list from the head node until the value is found or the end of the list is reached.
* there are three kinds of LinkedList: 1- Singly LinkedList 2- Doubly LinkedList 3- Circular LinkedList
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/0af9c22a-9604-46af-a408-72a71f78b41c)<br />
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/0975e761-6f2d-4c0e-b4de-4cae22a3396f)<br />
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/e65f767b-9c58-4b2b-90e7-9fab2a2b1e0c)<br />
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/64de7fdc-e6e7-4918-aba7-304f85c6478b)<br />

# Data-Structures-Algorithms
This is a Repo made to hold a summary of the course from Mosh named: The Ultimate Data Structures And Algorithms.<br />
be sure the check out his courses at: https://codewithmosh.com/ <br />
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

## Linear Data Structures

### Arrays

* Simplest data structure
* Data is stored at contiguous memory locations
* Saves data in a sequential order
* in dynamic languages like python it's size is dynamic and can shrink or enlarge as needed but in java it is static so it's size wont shrink or enlarge
* java provides two dynamic implementation: Vector and ArrayList
* in ArrayList the size grows by 50% and in Vector it grows 100%
* Vectors are synchronized but ArrayLists are not which makes them more suitable for multi threaded applications
* they are mostly used when you know how many items you are going to have ahead of time
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/ff0e3d12-a62a-4054-acf8-64e78c94518b)<br />

### LinkedList

* Second most used Data Structure
* data is stored sequentially but they are not at contiguous memory locations and are distrubted across memory and each element (Also Called a Node) has a pointer to the next
* because of this, LinkedList can grow or shrink without having to copy the prevoius data (Automatically) but because of the pointer to other nodes each node consumes a bit more memory
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

### Stack

* A Data Strucutre that follows LIFO (Last in First out) which mean the last element (aka top) that is inserted is the first element that comes out<br />
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/8521b79b-7907-4704-bc49-4cd42fdf902b)<br />
* Can be Implemented using ArrayList or LinkedList
* mostly used in situations where we need to undo or do things in reversed order
* stacks have four primary operations: 1- push() (used to insert a value) 2- pop() (used to return a value and delete it from the stack) 3- peek() (used to see the top element, doesn't remove anyrhing) 4- isEmpty() which all run in O(1) because we only work with the last element that was inserted<br />

### Queue

* A Data Structure that follows FIFO (First In First Out) which means the first element that is inserted is the frist elements that comes out
* Queues are literally the same thing that they represent in real life: An Actual queue<br />
![queues](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/d9960b2c-c697-420a-bacf-d44ffe31293b)<br />
* they are mostly used in situations were a resource must be shared and used among many consumers and consumers should use the resource one by one
* this makes tools such as Kafka , sophisticated queues
* most used implementations of Queues in java are ArrayDeque , LinkedList (yes they can be used is queues too) and PriorityQueue
* there is a catch with PriorityQueues: they don't follow FIFO instead they sort the data within them is ASC or DESC order depending on what the user needs and their priority (it is implied that the data type assigned should be Comparable)<br />
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/1301932d-11ae-4f0c-bd07-1f8078c9bd0e)<br />
* as a side note it is worth mentioning that PriorityQueues that are implemented using an array have enqueue of O(n) becasue of the shifting that occurres upon reaching array limit and the queue that I implemented using a stack in this section also had O(n) for both the dequeue adn peek operations beacuse data had to be transfered from one stack to the other to be in correct order

### Map And Set
* Maps are data structures that store data as key value pairs, they use arrays in the background, most used implementations are HashMap and LinkedHashMap (explain the difference later)
* HashTable is another implementation that is similar to HashMap but is considered legacy and is not used much anymore
* so they are mostly used to create spellcheckers, dictionaries, compilers and code editors
* when we insert a key value pair, values can be duplicates but keys must be unique
* Sets are maps that only work with the key hence they are used to store values that are unique and don't allow duplicates and any duplicate value in them is removed, most used impelementation is HashSet
* Maps used HashFunctions on keys to generate a hashCode to be used as a pointer to the memory that is storing the value of that specific key, hence they are deterministic meaning that they create the same hashCode for the same key
* but there are situations where two different keys generate the same hashCode that is when a collision occurres, so two pairs point to the same memory location
* there are two solutions to collisions
  - Chaining: we store a LinkedList in each cell of the array and if to keys point to the same cell (memory location) we add them to the LinkedList
  - Open Addressing: we store the key/value pairs directly into the array and when a second key points to a cell that is already occupied, we probe or look for the next empty cell. There 3 probing strategies
      1. Linear Probing: where we find the next (adjacent) empty cell by using the formula: (hashFucntion + i) % array_size. can clear clusters of data and cause poor performance when inserting or lookingUps
      2. Quadratic Probing: we make big jumps to avoid creating clusters but may end up in infinite loops with formula: (hashFunction + i^2) % array_size
      3. Double Hashing: we use a second hash to calculate the step needed with formula: (hashFunction1 + i*hashFunction2) % array_size
* out of the mentioned collision handlers mostly the chaining solution is used
* now you may wonder how can we get a value if the key points the a list, that's is where the equals() method comes in. if the key points to cell that has a LinkedList, we iterate over the list and choose a pair that maches the input key using equals method
* in maps the main operations which are add , remove and get usually work in O(1) but can scale to O(n) due to chaining
* because it is not clear what index the hashFunction creates, HashMaps don't save data in the sequence that they were inserted, so if we want to save data according to their insertion order we use LinkedHashMap

## Non Linear Data Structures

### Tree

* trees are data strucutres that store data in a hierarchy. data are stored as nodes and the lines that connect them are called edges <br />
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/aeef5d4f-d6ed-402b-a669-60a40c4a5f24)<br />
* the top node is called a root. each node can be a parent and have children. for example the root node is a parent and has two childs. a node that doesn't have a child is called a leaf node
* in this example our tree is called a Binary Tree since each node has at most two childs. we have many types of trees but they are all fundamentally the same so in this section we focus on binary tree
* trees have many application:
    1. when we want to repressent a hierarchal data such as a family tree or files on a disk
    2. in databases where trees are used for indexing
    3. autocompletion, for example when you search something in google it tries to match it to your previous searches
    4. compilers where they used something called the syntax tree to parse expressions
    5. trees are also used in compression algorithms such as JPEG and MP3
* we have a special kind of binary tree called Binary Search Tree (BST) where the value of each node is greater than it's left child and is less than it's right child
* the intersting fact about BST is that every node the left subTree a given node is less than it and every node in it's right subTree is greater than it <br />
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/b9e6187e-3679-4707-b4e5-5ef193b430b0) <br />
* the look up in BST is really fast since we only examine part of the tree not all of it, for example if we are lokking for number 1 in our tree, since 1 is smaller than 7 we go to search the left sub tree and ignore the right. the same thing happens until we find the value we are lookig for. this gives us a lookup time of O(logN) since we disregard half the tree
* the same thing happens for insertion of new node where we examine if it is smaller or greater than our current node. so we get insertion of O(logN)
* the same thing happens for deletion and we get O(logN) since we have to lookup for the value and then reconnect the remaining nodes
* ofcourse all of this depends on wether our tree is structured correctly or not
* we have two kinds of traversal in trees:
    1. Breadth First (aka level order): we visit every node that is on the same level after going to the next level. in our example it would be: [7, 4, 9, 1, 6, 8, 10] 
    2. Depth First:
       - Pre Order: we visit the Root then the left sub tree then the right sub tree e.g: [7, 4, 1, 6, 9, 8, 10]
       - In Order: we visit the left sub tree then the root and then the right sub tree e.g: [1, 4, 6, 7, 8, 9, 10] , prints the nodes in ascending order. do the reverse to get descending
       - Post Order: we visit the left sub tree then the right sub tree and finally the root e.g: [1, 6, 4, 8, 10, 9, 7] , we traverse the tree from the leaf node to the root
* recursion is powerful technique to implement repetition where we call the same function on a subset of it's input, basically breaking a problem into smaller problems. the important point in recursion is that we should have a base condition where a simple value is returned and the function is not called anymore or else it will run forever.
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/00c7ed9d-4567-4ec0-a13f-90fb8fe253e8)<br />
* in java a stack is used to keep track of recursion!!!
* we use recursion to implement various methods of tree manipulation be it traversal , validation an so on.....
* depth of a node is when we start from the root node and count the edges we take to reach our target node where as height starts from a leaf node and goes to our target root
* the height of a tree is the longest path from the leaves to root: 1 + MAX(height(left) , height(right)). the same goes for the depth of a tree where the longest route from root to a leaf is depth of the tree

### AVL Tree

* AVL tree which is also known as self balancing tree is a type of tree that evaluates itself after every insert or deletion, if the difference of the height of node in it's left and right subtrees is greater than 1 then it balances itself
* a perfect tree is a tree in which every level (except the last level) is full of nodes. 
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/938dcc94-f128-478f-a843-9e4e82e753ef)
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/d262a204-da52-4439-9f32-9d39aac964ab)
* consider a tree with nodes of 10 , 20 , 30. this would be a right skewed tree (or it is was reversed -> 30 , 20 , 10 it would be left skewed). doing operation on this kind of tree would result in O(N) because our tree has basically become a LinkedList and in order to traverse it we have to iterate through each node
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/3e95cea1-0ef9-4a9f-9d94-ecdc17c8f94c)
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/e38e0b42-8250-4bc0-a586-8597cde4fbb9)
* in order to balance itself this kind of tree uses operations called rotation which depending on what side of the tree is heavy (i.e has greater height)
* Left Rotation: we set the right child of the root as the new root and the old root as the left child of new root
  - before :<br />
   ![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/3b40f3b6-7ee8-47a1-9815-45dd2785b856)
  - after :<br />
   ![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/af1962e8-57e6-4578-a3b5-a990251aaec7)
* right Rotation: we set the left child of the root as the new root and the old root as the right child of new root
  - before :<br />
   ![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/0dd16e5e-dd0e-497a-8160-8d53403a7b6f)
  - after :<br />
   ![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/a25bd0a0-199d-4a00-8bb3-378063ac2cd6)
* left-right Rotation: when there is an imbalance in the left child right subtree, we perform a left rotation on the left child of root and then a right rotation on the root
  - before :<br />
   ![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/880b841f-4c73-4419-883b-76a43be2efa6)
  - after :<br />
   ![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/3fbae723-c4d4-4377-bf54-2aef91ce323f)
  - after after:<br />
   ![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/36c72103-1807-41bd-b943-fbbeb5686b33)
 * right-left Rotation: when there is an imbalance in the right child left subtree, we perform a right rotation on the right child of root and then a left rotation on the root
  - before :<br />
   ![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/22c6db8e-00d9-43ee-9cfe-a949080209fc)
  - after :<br />
   ![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/67a3b86d-fbda-4f27-adbe-d9c6d813903e)
  - after after:<br />
   ![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/64d18488-89fc-456c-8e57-53c1457a428e)
* in the example below we can that there is an imbalance
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/0876b9d8-7b13-42d7-aa27-683cfb0b8026)
* since it is a left skewed subtree we detach the right child of node 15 and perform a right rotation on the root
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/f810a6e5-1b9e-4051-9a56-28da574e7fc5)
* then we decide where to put the detached node which in this case is the left child of 18
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/2ef02d3b-a1a1-44dc-8fb1-d1d474bcda88)
* we have another example below
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/4742327d-bf0e-4de8-be15-39630ce2aa3b)
* we perform a left-right rotation on 10, so we left rotate 7
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/eb807b3b-b3b8-49d3-bda3-1e79e83e0cf1)
* then we perform a right rotation on 10 to get the result below
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/b5220a2e-cd13-495b-a058-68730e4abb09)

### Heaps
* heaps are a special type of binary tree that has two properties:
    - they are complete trees: every level must be completely filled except the last level that can have empty nodes and levels are filled from left to right
    - Complete:
    - ![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/bebd067e-8894-4e76-b78e-154ae4360e19)
    - not complete:
    - ![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/0b60a8eb-7839-429e-b036-b2bb2e6ce989)
    - heap propert: states taht every node must be equal or greater that their children
    - with heap property
    - ![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/453a6ddd-9d5a-42a5-b6dc-fad814bb6f6e)
    - without heap property
    - ![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/a1a77653-2a68-433e-96fe-e17e85933a45)
* we have MaxHeap where the root node has the largest value and as we go down the values get smaller and a MinHeap where the root node has the lowest value and as we go down the values get larger
* heaps are used in:
    - Sorting; we have a HeapSort
    - Graph algorithms: for example the shortest path algorithms
    - implementing priority queues
    - finding the Kth smallest/largest value
* whenever we add a new value to the tree we add it as a leaf and then check if it is bigger than it's parent, if it is we swap their places and keep doing this until it is at the right spot this called bubblingUp operation
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/d19db7a5-7c18-4037-9d91-3a888932d248)<br />
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/19740fac-cc5d-4377-a4f8-579ad4084ed3)<br />
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/6f685c15-54a5-4990-9f49-a89516761089)<br />
* whenever we remove a value, we always remove the root value and the replace it with the last node and then check if it is smaller than it's children, if it is we swap it's place with the larger child and keep doing this until it is at the right spot this called bubblingDown operation
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/6f685c15-54a5-4990-9f49-a89516761089)<br />
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/6854184e-f83f-47fa-86ca-dd3872a99de9)<br />
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/7ef0d310-b8f6-4ab0-8ab6-f490790c3176)<br />
* in these operations the largest a value can travle is the height of the tree and as we know from before height = log(n) so the time complexity of these operations is O(logn)
* HeapSort: by inserting an array of numbers in a heap and then removing the elements of the heap one by one and store the result in an array, the result would be the original array in DESC order. this is for a MaxHeap, for ASC order we need a MinHeap. in my example I stored the removed values in the same array and by changing the iteration direction i managed to sort both in DESC and ASC
* Heapify algorithm: transforming an array to a heap in place

### Trie

* Tries (which is an acronym for retrieval tree) (aka digital , radix , prefix) are a type of tree structure which not binary and is mostly used in implmentation autocompletion algorithms
* being non binary enalbes this tree to be able to store many combinations of words, and since we are using trees we are going to have proficient memory storage
![image](https://github.com/Sina-karimi81/Data-Structures-Algorithms/assets/83176938/78d0cad6-2aa4-406b-bb8e-b809a5a89c89)
*  as you can see we have stored the word bag , boy and cat in this trie. boy and bag share the same prefix that is **b** so we don't have any duplication of prefixes. the number of children a node can have is dependent on the language of choice forexample in engish a node can have 26 children
*  as rule the root node always has a null or empty charater value since a word or a phrase can start with any word and we cannot have 26 roots!
*  the lookup (noded must be traversed) , insert (existing nodes are traversed and new ones are added to them as a child) and remove (nodes must be traversed to be deleted) operations fot this structure is O(L) where L is the length of the given word and technically it is O of constant
*  the trie can be traversed in both post order and pre order fashion

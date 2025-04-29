# Assignment-4-ads
MyHashTable
A generic hash table using separate chaining for collision handling.

Supports operations: put, get, remove, contains, getKey, and bucket size inspection.

Uses a custom key class (MyTestingClass) with a manually defined hashCode() for uniform distribution.

Tested by inserting 10,000 random elements and printing the size of each bucket.

BST (Binary Search Tree)
Generic implementation for key-value storage using binary search tree logic.

Supports operations: put, get, delete, and size.

Implements in-order traversal using Java's Iterable interface.

The iterator provides both key and value access during traversal.

Supporting Classes
MyTestingClass: A class used as a custom key with an overridden hashCode() method.

Student: A simple class used as the value in the hash table tests.

Testing
The Main class demonstrates:

Insertion of 10,000 entries into the hash table with random keys.

Printing of the number of elements in each hash table bucket.

BST in-order traversal that prints both key and value for each entry.

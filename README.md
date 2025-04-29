# Assignment-4-ads
 MyHashTable & BST Java Implementation
This project includes custom implementations of:

MyHashTable<K, V> – Hash Table with separate chaining.

BST<K, V> – Binary Search Tree for key-value pairs.

Features
MyHashTable

Generic key-value support

Custom chaining with HashNode

put, get, remove, contains, getKey

Tested with 10,000 elements using a custom key class (MyTestingClass)

BST

Insertion, search, and deletion

In-order traversal with iterator

Iterator exposes both key and value

Tracks size of tree

Supporting Classes
MyTestingClass: Custom class for testing hash distribution

Student: Value class used in hash table tests

Testing
Adds 10,000 entries into the hash table

Prints bucket size distribution

BST tested using in-order traversal loop with access to both key & value

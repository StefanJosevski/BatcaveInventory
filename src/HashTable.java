//this is my way of using the hash table from lecture and how i will use it
//it is going to find which gadget as soon as possible by using O(1) on avergae

public class HashTable {
    //one node that will be a gadget and then a pointer to the next one
    //if two of them are group together, they will be combined to make the same id

    private static class Node {
        String key; //this is the gadget id


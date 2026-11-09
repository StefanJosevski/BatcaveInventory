//this is my way of using the hash table from lecture and how i will use it
//it is going to find which gadget as soon as possible by using O(1) on avergae

public class HashTable {
    //one node that will be a gadget and then a pointer to the next one
    //if two of them are group together, they will be combined to make the same id

    private static class Node {
        String key; //this is the gadget id
        Gadget value; //this is the actual gadget itself 
        Node next; //this is the next node in the chain and if it is empty it is going to be null 


    
        //we will give it a gadget id, a gadget, and the next node in the chain
        Node(String key, Gadget value, Node next) {
            this.key = key;  //saving the gadget id 
            this.value = value; // saving the gadget itself
            this.next = next; // save the link to the next node
        }
    }

    private Node[] table; //this is the array and each of the spot that holds the chain of nodes
    private int size;  //and this is how many gadgets are stored 

    //this is going to start with 16 empty spots 
    public HashTable() {
        table = new Node[16];
        size = 0;
    } 
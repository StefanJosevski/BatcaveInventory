//one of the gadgets in the Batcave inventory that Batman uses
public class Gadget {
    private String id; //it will be like BG-101 which is the item of the Gadget
    private String name; //this is the name of the Gadget like Batarang
    private int quantity; //this is how many of the gadget we have

    //this will run when we make a new gadget
    //new Gadget("BG-101", "Batarang", 10) so it is automatically going to fill these 3 things.
    public Gadget(String id, String name, int quantity) {
        this.id = id; //gadget id
        this.name = name;
        this.quantity = quantity; 
    }

    //this lets other files read the gadget's information
    public String getId() { return id;} //this is going to give back the id
    public String getName() { return name; } //this is going to give back the name
    public int getQuantity() { return quantity; } //this is going to give back the quantity
    public void setQuantity(int quantity) { this.quantity = quantity; } //this is going to set the quantity


    //this is going to chose how the gadget will look when we print it
    @Override 
    public String toString() { //this is the part that makes the line like BG-101 Batarang
    return String.format("%-8s %-16s %d", id, name, quantity); //these numbers and letters are texts and padding added
}
}



        
//one of the gadgets in the Batcave inventory that Batman uses
public class Gadget {
    private String id; 
    private String name; 
    private int quantity;

    public Gadget(String id, String name, int quantity) {
        this.id = id; 
        this.name = name;
        this.quantity = quantity; 
    }

    public String getId() { return id;} 
    public String getName() { return name; } 
    public int getQuantity() { return quantity; } 
    public void setQuantity(int quantity) { this.quantity = quantity; } 

    @Override 
    public String toString() {
    return String.format("%-8s %-16s %d", id, name, quantity);
}
}



        
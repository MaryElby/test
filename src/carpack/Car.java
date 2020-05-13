package carpack;

public class Car {
    protected String colour;
    private int numWheels;

    public Car(String colour, int numWheels) {
        this.setColour(colour);
        this.setNumWheels(numWheels);
    }

    public void printDetails(){
        System.out.println("Colour is "+ this.getColour());
        System.out.println("Wheel count is "+ this.getNumWheels());
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
}
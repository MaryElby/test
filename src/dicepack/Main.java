package dicepack;

import carpack.Car;
import dicepack.Dice;
import dicepack.LoadedDice;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Car myCar = new Car("Black",18);
        Car myOtherCar = new Car("Red",4);
        myCar.printDetails();
        myCar.
        int[] myArray = new int[4] ;
        Car[] myCarArray = new Car[2];
        Dice myDice = new Dice();
        LoadedDice myLoadedDice = new LoadedDice();
        myCarArray[0] = myCar;
        myCarArray[1] = myOtherCar;
        myLoadedDice.dicecolour = "Green";

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.asList(myCarArray));
        System.out.println(myCarArray[0].getColour());

        //got this out of the help text for asList
        List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
        System.out.println(Arrays.asList(stooges));
        //this just rounds the float to an int, it doesn't fail
        myArray[0] = (17 /4);

        System.out.println(Arrays.toString(myArray));

        int diceValue = myDice.throwDice(myDice);
        System.out.println("You rolled a " + diceValue);
        System.out.println("Let's play Yahtzee!");
        for (int i=1;i < 6;i++){
            diceValue = myDice.throwDice(myDice);
            System.out.println("You rolled a " + diceValue);
        }
        System.out.println("My turn");
        int j =1;
        while (j<6){
            diceValue = myLoadedDice.throwDice(myLoadedDice);
            System.out.println("I rolled a " + diceValue);
            j++;
        }
    }

}

package dicepack;

public class LoadedDice extends Dice {
    int loadvalue = 1;

    public int throwDice(Dice thisdice){
        int Dicevalue = ((int) (Math.random() * 6));
        if (Dicevalue ==0)
        {
            Dicevalue=1;
        }
        if (Dicevalue < 6) {
            Dicevalue+=loadvalue;
        }
        //System.out.println(Dicevalue);
        return Dicevalue;
    }
}

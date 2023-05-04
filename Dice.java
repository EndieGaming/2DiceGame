public class Dice
{
    int sides = 6;
    public Dice()
    {
         
    }
    public int rollDie()
    {
        return (int)(Math.random()*6)+1;
    }
}

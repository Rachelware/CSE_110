package Fruit;

import java.util.Scanner;

public class MultiClass
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        Fruit one = new Fruit("Apple", FruitColors.Red, true);
        System.out.println(one.getName());
        System.out.println(one.getColor());
        System.out.println(one.getRipe());
        System.out.println(one.eat());
        System.out.println(one.eat() + "\n");

        one = new Fruit("Banana", FruitColors.Yellow, false);
        System.out.println(one.getRipe());
        one.sitOnCounter();
        System.out.println(one.getRipe());
        one.sitOnCounter();
        System.out.println(one.getRipe());
        one.sitOnCounter();
        System.out.println(one.getRipe());
        System.out.println(one.eat());
        FruitBowl fb = new FruitBowl(false, "", 5, one, new Fruit());
        System.out.println(fb.getFirstFruit().eat());
        
        Fruit f1 = new Fruit("Grapefruit", FruitColors.Yellow, true);
        Fruit f2 = Fruit.copyFruit(f1);
        f2.sitOnCounter();
        System.out.println(f1 + "\n" + f2);
        
    }
}

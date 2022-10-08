package lab4.MoreOOP.src.main.java.lotr;

import java.util.Random;

public abstract class Noble extends Character{
    private final static Random randomGenerator = new Random();

    public Noble(int min, int max){
        super(randomGenerator.nextInt(max-min)+min, randomGenerator.nextInt(max-min)+min);
    }

    public Integer get_kick_power(int max){
        return randomGenerator.nextInt(max);
    }
}

package lab4.MoreOOP.src.main.java.lotr;

public class Elf extends Character {
    public Elf(){
        super(10, 10);
    }

    public void kick(Character c) {
           if (getPower()>c.getPower())
               c.setHp(0);
           else
                c.setPower(c.getPower()-1);
    }
}
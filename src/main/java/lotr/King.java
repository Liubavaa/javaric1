package lab4.MoreOOP.src.main.java.lotr;

public class King extends Noble{
    public King(){
        super(5, 15);
    }
    public void kick(Character c){
        c.setHp(c.getHp() - get_kick_power(getPower()));
    }
}

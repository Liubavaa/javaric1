package lab4.MoreOOP.src.main.java.lotr;

public class Knight extends Noble{
    public Knight(){
        super(2, 12);
    }
    public void kick(Character c){
        c.setHp(c.getHp()- get_kick_power(getPower()));
    }
}

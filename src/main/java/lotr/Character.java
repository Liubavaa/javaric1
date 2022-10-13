package lab4.MoreOOP.src.main.java.lotr;

import lombok.Setter;
import lombok.Getter;

@Getter @Setter
public class Character{
    private int power;
    private int hp;

    public Character(int hp, int power){
        setHp(hp);
        setPower(power);
    }

    public void kick(Character c){

    };

    boolean isAlive(){
        return getHp()>0;
    };

    public void setHp(int hp){
        this.hp = Math.max(0, hp);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}

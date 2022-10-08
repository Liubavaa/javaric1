package lab4.MoreOOP.src.main.java.lotr;

public class GameManager {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        fight(CharacterFactory.createCharacter(), CharacterFactory.createCharacter());
    }
    public static void fight(Character c1, Character c2){
        System.out.println("Fight between " + c1 + " and " + c2 + " starts!");
        for (int i = 1; c1.isAlive()&& c2.isAlive(); i++){
            c1.kick(c2);
            c2.kick(c1);
            System.out.println("After "+ i +" round: " + c1 + " " + c2);
        }
        if (!c1.isAlive() && !c2.isAlive())
            System.out.println("Wow, they killed each other");
        else if (!c1.isAlive())
            System.out.println("First fighter died. Winner " + c2);
        else
            System.out.println("Second fighter died. Winner " + c1);
    }
}

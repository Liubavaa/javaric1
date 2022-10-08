package lab4.MoreOOP.src.main.java.lotr;

import org.reflections.*;
import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        createCharacter();
    }
    public static Character createCharacter() throws InstantiationException, IllegalAccessException {
        Reflections ref = new Reflections("");
        Set<Class<? extends Character>> classes = ref.getSubTypesOf(Character.class);
        Class<?> res = classes.toArray(new Class<?>[5])[new Random().nextInt(5)];
        while (res.getSimpleName().equals("Noble"))
            res = classes.toArray(new Class<?>[5])[new Random().nextInt(5)];
        return (Character) res.newInstance();
    }
}

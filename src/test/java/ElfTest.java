package lab4.MoreOOP.src.test.java;

import lab4.MoreOOP.src.main.java.lotr.Character;
import lab4.MoreOOP.src.main.java.lotr.Elf;
import lab4.MoreOOP.src.main.java.lotr.Hobbit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElfTest {
    private Character character;

    @BeforeEach
    public void init() {
        character = new Elf();
    }

    @Test
    public void testToString(){ assertEquals("Elf{hp=10, power=10}", character.toString());
    }

    @Test
    public void testKick() {
        Character hobbit = new Hobbit();
        character.kick(hobbit);
        assertEquals(0, hobbit.getHp());
    }
}


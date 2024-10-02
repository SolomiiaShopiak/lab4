import org.reflections.Reflections;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    @SuppressWarnings("unchecked")
    public Character createCharacter() { 
        // Factory Method Pattern
        Random random = new Random();

        Reflections reflections = new Reflections("lab4.src.main.java");
        Set<Class<? extends Character>> subClasses = reflections.getSubTypesOf(Character.class);

        int randomIndex = random.nextInt(subClasses.size());
        Class<? extends Character> randomCharacterClass = subClasses.toArray(new Class[0])[randomIndex];

        try {
            return randomCharacterClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }

        return null;
      }
}

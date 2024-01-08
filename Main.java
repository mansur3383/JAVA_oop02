import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    }

    static ArrayList<Heroes> heroesWhite = new ArrayList<>();
    static ArrayList<Heroes> heroesBlack = new ArrayList<>();
    static ArrayList<Heroes> generateCommand (int n) {
        ArrayList<Heroes> commandHeroes = new ArrayList<>();
        Random random = new Random();
        int rand;
        for (int i = 0; i < 10; i++) {
            rand = random.nextInt(1,5) + n;
            switch (rand) {
                case 1:
                    commandHeroes.add(new Crossbower(getName()));
                    break;
                case 2:
                    commandHeroes.add(new Monk(getName()));
                    break;
                case 4:
                    commandHeroes.add(new Peasant(getName()));
                    break;
                case 3:
                    commandHeroes.add(new Pikeman(getName()));
                    break;
                case 5:
                    commandHeroes.add(new Rogue(getName()));
                    break;
                case 6:
                    commandHeroes.add(new Sniper(getName()));
                    break;
                case 7:
                    commandHeroes.add(new Wizard(getName()));
                    break;
            }
        }
        return commandHeroes;
    }

    static String getName() {
        return NameofHeroes.values()[new Random().nextInt(NameofHeroes.values().length-1)].name();
    }
}

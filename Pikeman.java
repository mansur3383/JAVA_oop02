public class Pikeman extends Heroes{
    public Pikeman(String nameHero) {
        super(100, 100, 5, new int[]{20, 30}, nameHero);
    }

    @Override
    public String toString() {
        return ("Копейщик: " + nameHero + " " + "здоровье: " + health + "/" + healthMax + " броня: " + armor);
    }
    
}

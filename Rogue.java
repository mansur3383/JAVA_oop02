ublic class Rogue extends Heroes {

    public Rogue(String nameHero) {
        super(100, 100, 5, new int[]{20, 30}, nameHero);
    }

    @Override
    public String toString() {
        return ("Разбойник: " + nameHero + " " + "здоровье: " + health + "/" + healthMax + " броня: " + armor);
    }
}

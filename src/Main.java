public class Main {
    public static void main(String[] args) {
        magic magic = new magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();
        Hero[] heroes = {magic, medic, warrior};
        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }

        }
    }
}

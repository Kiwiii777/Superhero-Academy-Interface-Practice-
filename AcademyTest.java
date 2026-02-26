public class AcademyTest {
    public static void main(String[] args) {
        Hero hero1 = new FireHero("Jayron", 100);
        Hero hero2 = new ElectricHero("Zapp", 120);
        Hero[] Academy = new Hero[2];
        Academy[0] = hero1;
        Academy[1] = hero2;

        for (int i = 0; i < 2; i++) {
            Academy[i].usePower();
            Academy[i].train();
            Academy[i].getPowerLevel();
            System.out.println("\n\n");
        }
    }
}
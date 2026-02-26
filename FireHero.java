public class FireHero extends Hero {
    public FireHero(String name, int powerLevel) {
        super(name, powerLevel);
    }

    @Override
    public void usePower() {
        System.out.println("The hero released a blazing fireball!");
        int rand = (int)(Math.random()*8)+5;
        powerLevel -= rand;
        if (powerLevel < 0) powerLevel = 0;
        System.out.println("The hero has " + powerLevel + " power left!");
    }
}
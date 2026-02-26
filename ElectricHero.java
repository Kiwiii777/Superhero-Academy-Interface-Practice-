public class ElectricHero extends Hero {
    public ElectricHero(String name, int powerLevel) {
        super(name, powerLevel);
    }

    @Override
    public void usePower() {
        System.out.println("The hero sent a fierce shockwave!");
        int rand = (int)(Math.random()*11)+5;
        powerLevel -= rand;
        if (powerLevel < 0) powerLevel = 0;
        System.out.println("The hero has " + powerLevel + " power left!");
    }
}
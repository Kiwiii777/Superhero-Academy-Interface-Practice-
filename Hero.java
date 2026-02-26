public abstract class Hero {
    public String name;
    public int powerLevel;

    public abstract void usePower();

    public Hero(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    public void train() {
        powerLevel+=10;
        System.out.println(name + " now has a power of " + powerLevel);
    }

    public int getPowerLevel() {
        return powerLevel;
    }
}
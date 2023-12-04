public class LuckFactor {
    public int rollTheDie() {
        return (int) Math.ceil(Math.random()*6);
    }

    public boolean dodged(double chance) {
        if (Math.random() <= chance) {
            return true;
        }
        return false;
    }
}

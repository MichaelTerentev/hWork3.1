public abstract class Metal {
    private final int endurance;
    protected Metal(int endurance) {
        this.endurance = endurance;
    }
    public int getEndurance() {
        return endurance;
    }
}

public class Sword<T extends Metal> {
    T material;
    public Sword(T material) {
        this.material = material;
    }
    public boolean testEndurance() {
        return material.getEndurance() > 49;
    }
}

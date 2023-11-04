package Flyweight.v1;

// The total memory usage of 1 Bullet object is ~1.1KB
public class Bullet {
    public String direction; // 8 bytes
    public double speed; // 8 bytes
    public CoOrdinate currentCoOrdinate; // 24 bytes
    public CoOrdinate targetCoOrdinate; // 24 bytes
    public double radius; // 8 bytes
    public String colour; // 16 bytes
    public double weight; // 8 bytes
    public double maxDamage; // 8 bytes
    public double maxRange; // 8 bytes
    public byte[] image; // 1 KB
}

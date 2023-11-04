package Flyweight.v2;

// The total memory usage of 1 Bullet object is ~80 bytes
public class Bullet {
    public String direction; // 8 bytes
    public double speed; // 8 bytes
    public CoOrdinate currentCoOrdinate; // 24 bytes
    public CoOrdinate targetCoOrdinate; // 24 bytes
    public RifleBulletType bulletType; // 8 bytes
}

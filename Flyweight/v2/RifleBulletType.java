package Flyweight.v2;
// Only one RifleBulletType object will be created & it will
// reference by the multiple bullet objects
public class RifleBulletType {
    public double radius; // 8 bytes
    public String colour; // 16 bytes
    public double weight; // 8 bytes
    public double maxDamage; // 8 bytes
    public double maxRange; // 8 bytes
    public byte[] image; // 1 KB
}

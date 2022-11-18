
public class MegaZombie extends Zombie {
    int damage;
    Power power;
    public MegaZombie(int damage, int speed, int health, int size, int height){
        super(size, speed, health);
        this.damage = damage;
        this.power = Power.Acid;
    }
    enum Power {
        Flame,
        Radiation,
        Acid
    }

    public static void main(String[] args){
        MegaZombie boss = new MegaZombie(75,10,500,10,10);
        System.out.println(boss.damage);
        System.out.println(boss);
    }
}



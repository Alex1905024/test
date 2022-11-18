public class Zombie {
    int speed;
    int height;
    public Zombie(int height, int health, int speed){
        this.speed = speed;
        this.height = height;

    }
    public static void main(String[] args){
        Zombie zom1 = new Zombie(5,10,5);
        System.out.println(zom1.speed);
        System.out.println(zom1.height);
    }
}



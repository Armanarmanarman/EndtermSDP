import java.util.concurrent.ThreadLocalRandom;

public class Hero2 implements Hero2Interface, Hero {
    float hp = 100;
    int pistoldmg = 15;
    int rifledmg = 30;
    int hedmg = 40;
    public void pistolShot(){
        System.out.println("Shooters turn to make damage");

        System.out.println("pistol shot -15hp");
    }
    public void rifleShot(){
        System.out.println("Shooters turn to make damage");

        System.out.println("rifle shot -30hp");
    }
    public void throwHandGrenade(){
        System.out.println("Shooters turn to make damage");

        System.out.println("Naids damage -40hp");
    }

    @Override
    public int fight(){

        int randomNum = ThreadLocalRandom.current().nextInt(1, 4);
        if( randomNum == 1){
            pistolShot();
            return pistoldmg;
        }
        if(randomNum ==2 ){
            rifleShot();
            return rifledmg;
        }
        throwHandGrenade();
        return  hedmg;
    }

    @Override
    public void makeDmg(int damage) {
        hp-= damage;
    }
}

import java.util.concurrent.ThreadLocalRandom;

public class Hero1 implements Hero1Interface, Hero{
    float hp = 100;
    int catanadmg = 40;
    int suricendmg = 15;
    int arrowdmg = 30;
    public void hitByCatana(){
        System.out.println("Samurais turn to make damage");
        System.out.println("Catana hit -40hp");
    }
    public void throwSuricen(){
        System.out.println("Samurais turn to make damage");

        System.out.println("Shuriken hit -15hp");
    }
    public void arrowHit(){
        System.out.println("Samurais turn to make damage");
        System.out.println("Arrow hit -30hp");
    }

    @Override
    public int fight() {

        int randomNum = ThreadLocalRandom.current().nextInt(1, 4);
        if( randomNum == 1){
            hitByCatana();
            return catanadmg;
        }
        if(randomNum ==2 ){
            throwSuricen();
            return suricendmg;
        }
        arrowHit();
        return  arrowdmg;
    }
    @Override
    public void makeDmg(int damage){
        hp -= damage;
    }




}

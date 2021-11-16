public class Main {

    static HeroFactory crateHeroByType(String s){
        if(s.equalsIgnoreCase("Samurai")){
            return new Hero1Factory();
        }
        if(s.equalsIgnoreCase("Shooter")){
            return new Hero2Factory();
        }else{
            throw new RuntimeException( s + " is unknown hero.");
        }
    }
    public static void main(String[] args) {

        HeroFactory SamuraiFactory =   crateHeroByType("Samurai");
        HeroFactory ShooterFactory =   crateHeroByType("Shooter");
        Hero1 Samurai = (Hero1) SamuraiFactory.createHero();
        Hero2 Shooter = (Hero2) ShooterFactory.createHero();

        while(true) {
            Shooter.makeDmg(Samurai.fight());
            if (Shooter.hp < 0) {
                System.out.println("SAMURAI WINS!");
                System.out.println("Samurai left with " + String.valueOf(Samurai.hp) + " hp");
                Hero1 SamuraiUpgraded = new AdapterHero1toHero2();

                break;
            }
            Samurai.makeDmg(Shooter.fight());
            if (Samurai.hp < 0) {
                System.out.println("Shooter WINS");
                System.out.println("Shooter left with " + String.valueOf(Shooter.hp) +" hp");
                Hero2 SamuraiUpgraded = new AdapterHero2toHero1();

                break;
            }
        }


    }




}

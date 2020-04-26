package ir.ac.kntu;

public class Solider {
    private int number ;
    private int health = 100 ;
    private Rifle rifle ;
    private boolean dead = false ;


    //solider creation

    public Solider(int number , Rifle rifle ){
        this.number=number;
        this.rifle=rifle;

    }


    //getters
    public int getHealth() {
        return health;
    }

    public int getNumber() {
        return number;
    }

    public Rifle getRifle() {
        return rifle;
    }

    public boolean getDead(){
        return dead;
    }


    //setters

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRifle(Rifle rifle) {
        this.rifle = rifle;
    }

    //dead?
    public boolean checkIfDead(){
        if(this.health==0||this.health<0){
            setDead(true);
        }
        return true;
    }

    public String soliderSattus(){
        String health = String.valueOf(this.getHealth());
        String isDead = String.valueOf(this.getDead());

        return "health : "+health+" Dead?:  "+isDead;
    }




}

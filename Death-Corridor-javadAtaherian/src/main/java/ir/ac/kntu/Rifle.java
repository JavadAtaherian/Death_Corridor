package ir.ac.kntu;

public class Rifle {
    private int successRate ;
    private int failureRate  ;
    private int damage ;
    private boolean sniper ;
    private boolean scope ;
    private boolean highCal ;


    public Rifle(boolean sniper , boolean scope , boolean highCal){

        //booleans settings
        setScope(scope);
        setHighCal(highCal);
        setSniper(sniper);


        if (sniper){
            if (highCal){
                setDamage(30);

            }

            if (!highCal){
                setDamage(20);
            }

            if (scope){

                int bonus = getScopeBonus();

                if (highCal){
                    setSuccessRate(60+bonus-10);
                }
                if (!highCal){
                    setSuccessRate(60+bonus);
                }
//                setSuccessRate(60+bonus);

            }
            if (!scope){
                if (highCal){
                    setSuccessRate(60-10);
                }
                if (!highCal){
                    setSuccessRate(60);
                }
            }

            setFailureRate(100-getSuccessRate());

        }
        if (!sniper){

            if (highCal){
                setDamage(20);
                setSuccessRate(40);
            }

            if (!highCal){
                setSuccessRate(50);
                setDamage(10);
            }
            setFailureRate(100-getSuccessRate());
        }


    }


    //getters


    public int getDamage() {
        return damage;
    }

    public int getFailureRate() {
        return failureRate;
    }

    public int getSuccessRate() {
        return successRate;
    }

    public boolean getSniper() {
        return sniper;
    }

    public boolean getHighCal() {
        return highCal;
    }

    public boolean getScope() {
        return scope;
    }

    public void setFailureRate(int failureRate) {
        this.failureRate = failureRate;
    }

    //setters


    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHighCal(boolean highCal) {
        this.highCal = highCal;
    }

    public void setScope(boolean scope) {
        this.scope = scope;
    }

    public void setSniper(boolean sniper) {
        this.sniper = sniper;
    }

    public void setSuccessRate(int successRate) {
        this.successRate = successRate;
    }


    //zoom bonus
    public int getScopeBonus(){
        int bonus= RandomHelper.nextInt(11)+5;
        return bonus;
    }

    public String getRifleStatus(){
        String isSnipe=null;
        String hasScope=null;
        String isHighCal=null;

        if (this.getSniper()){
             isSnipe= "Sniper Rifle";
        }
        if (!this.getSniper()){
            isSnipe="Assault Rifle";
        }

        if (this.getScope()){
            hasScope = "with Scope";
        }
        if (!this.getScope()){
            hasScope="Without Scope";
        }

        if (this.getHighCal()){
            isHighCal = "using High Caliber ammo";
        }
        if (!this.getHighCal()){
            isHighCal="without High Caliber ammo";
        }


        String status = "this solider is fighting with "+isSnipe+hasScope+isHighCal;
        return status;
    }


}



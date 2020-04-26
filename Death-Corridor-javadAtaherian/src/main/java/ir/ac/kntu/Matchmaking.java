package ir.ac.kntu;

import java.util.LinkedList;
import java.util.Scanner;

public class Matchmaking {
    static LinkedList<Solider> leftside = new LinkedList<>();
    static LinkedList<Solider> rightside = new LinkedList<>();

    static LinkedList<Solider> leftSideGraveyard = new LinkedList<>();
    static LinkedList<Solider> rightSideGraveyard = new LinkedList<>();



    public static void createArmy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of the corridor:");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            int sniper = RandomHelper.nextInt(2);
            int scope = RandomHelper.nextInt(2);
            int highCal = RandomHelper.nextInt(2);
            Rifle rifle = new Rifle(binaryToBoolean(sniper),binaryToBoolean(scope),binaryToBoolean(highCal));
            leftside.add(new Solider(i,rifle));
        }

        for (int i = 0; i < size; i++) {
            int sniper = RandomHelper.nextInt(2);
            int scope = RandomHelper.nextInt(2);
            int highCal = RandomHelper.nextInt(2);
            Rifle rifle = new Rifle(binaryToBoolean(sniper),binaryToBoolean(scope),binaryToBoolean(highCal));
            rightside.add(new Solider(i,rifle));
        }
    }





    public static void fight(Solider solider1 , Solider solider2){

       while (solider1.getDead()){
           int newnumber = RandomHelper.nextInt(leftside.size());
           solider1 = leftside.get(newnumber);
       }

        while (solider2.getDead()){
            int newnumber = RandomHelper.nextInt(rightside.size());
            solider2 = leftside.get(newnumber);
        }


        fightStatus(solider1,solider2);
        int solider1hitchance = RandomHelper.nextInt(100);
        int solider2hitchance = RandomHelper.nextInt(100);


        if (solider1hitchance<=solider1.getRifle().getSuccessRate()){
            int leftDamaged = solider1.getHealth()-solider2.getRifle().getDamage();
            solider1.setHealth(leftDamaged);
        }
       if (solider2hitchance<=solider2.getRifle().getSuccessRate()){
           int rightDamaged = solider2.getHealth()-solider1.getRifle().getDamage();
           solider2.setHealth(rightDamaged);
       }

        System.out.println("solider number"+solider1.getNumber()+"with : "+  solider1.soliderSattus()+"    and    " +"solider number"+solider2.getNumber()+"with : "+ solider2.soliderSattus());
        solider1.checkIfDead();
        solider2.checkIfDead();

        if (solider1.getDead()){
            leftSideGraveyard.add(solider1);
        }
        if (solider2.getDead()){
            rightSideGraveyard.add(solider2);
        }


    }

    public static void fightStatus(Solider solider1 , Solider solider2){
        System.out.println("###########"+"solider(Left)"+solider1.getNumber()+"  vs  "+"solider(Right)"+solider2.getNumber()+"##########");
        System.out.println("solider"+solider1.getNumber()+"  : Health: "+solider1.getHealth()+solider1.getRifle().getRifleStatus()+ "  Vs  "
                +"solider"+solider2.getNumber()+"  : Health: "+solider2.getHealth()+solider2.getRifle().getRifleStatus());




    }


    public static void startWar(int size){
        int roundCounter = 1;
        while(!(leftSideGraveyard.size()==size||rightSideGraveyard.size()==size)){
            System.out.println("--------ROUND"+roundCounter+"--------");
            int randnum1 = RandomHelper.nextInt(leftside.size());
            int randnum2 = RandomHelper.nextInt(rightside.size());
            fight(leftside.get(randnum1),rightside.get(randnum2));
            roundCounter++;

        }

        if (leftSideGraveyard.size()==size){
            System.out.println("*******************RIGHT SIDE WON*************************");
        }
        if (rightSideGraveyard.size()==size){
            System.out.println("*******************LEFT SIDE WON************************");
        }
    }

    public static boolean binaryToBoolean(int number){
        if (number==1){
            return true;
        }
        return false;
    }


}

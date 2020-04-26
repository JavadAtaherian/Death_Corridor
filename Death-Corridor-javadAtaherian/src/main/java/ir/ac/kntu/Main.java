package ir.ac.kntu;

public class Main {
    public static void main(String[] args) {

//        System.out.println(RandomHelper.nextInt(2));
//        System.out.println(RandomHelper.nextInt(2));
//        System.out.println(RandomHelper.nextInt(2));
//        System.out.println(RandomHelper.nextInt(2));
//        System.out.println(RandomHelper.nextInt(2));
//        System.out.println(RandomHelper.nextInt(2));
//        System.out.println(RandomHelper.nextInt(2));
//        System.out.println(RandomHelper.nextInt(2));
//        System.out.println(RandomHelper.nextInt(2));
//        System.out.println(RandomHelper.nextInt(2));
//        System.out.println(RandomHelper.nextInt(2));


//        Rifle rifle = new Rifle(false,false,false);
//        System.out.println(rifle.getDamage());
//        System.out.println(rifle.getSuccessRate());
//        System.out.println(rifle.getFailureRate());

//       Matchmaking.createArmy();
//
////        for (int i = 0; i < 10; i++) {
////            System.out.println(Matchmaking.rightside.get(i).getRifle().getSniper());
////
////        }
//
//        Matchmaking.fight(Matchmaking.leftside.get(0) , Matchmaking.rightside.get(4));
//
//        System.out.println(Matchmaking.leftside.get(0).getHealth());
//        System.out.println(Matchmaking.rightside.get(4).getHealth());

        Matchmaking.createArmy();
        int theSize = Matchmaking.leftside.size();
        Matchmaking.startWar(theSize);




    }

}

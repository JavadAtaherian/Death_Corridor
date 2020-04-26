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


        Rifle rifle = new Rifle(false,false,false);
        System.out.println(rifle.getDamage());
        System.out.println(rifle.getSuccessRate());
        System.out.println(rifle.getFailureRate());

    }

}

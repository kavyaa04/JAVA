import java.util.Random;

class RandomNumbers{
    public static void main(String[]args){
        Random r = new Random();
        
        //int
        int num1= r.nextInt(1,100);
        System.out.println( num1);

        int num2= r.nextInt(1,100);
        System.out.println( num2);

        int num3= r.nextInt(1,100);
        System.out.println( num3);

        int num4=r.nextInt();
        System.out.println( num4);

        //double
        double dnum1= r.nextDouble();
        System.out.println( dnum1);

        //boolean
        boolean bnum1 = r.nextBoolean();
        System.out.println( bnum1);

        //char
        char cnum1 = r.nextBoolean() ? 'Y' : 'N';
        System.out.println( cnum1);




    }
}
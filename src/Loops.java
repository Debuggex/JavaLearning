public class Loops {

    public static void main(String[] args) {


        /**
         * WHILE AND DO WHILE come into action when we know the condition to be satisfied but does not know number of steps
         * FOR and FOREACH come into action when we know the number of steps
         */
        int a = 0;

//        while(a!=100){
//            System.out.println("I am while Loop");
//        }
//
//        do{
//            System.out.println("I am Do while Loop");
//        }while(a!=100);

        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9,10};
            for (int i = 0; i < arr.length; i+=2) {
            System.out.println(arr[i]);
        }
        for (int i: arr) {
            System.out.println(i);
        }

        // i = 0
        // i + 2 = 2 , i will be unchanged
        // i+=2 = (i = i+2), i will change

        // 1/2 + 1/3 + 1/4 + ............ 1/n


    }


}

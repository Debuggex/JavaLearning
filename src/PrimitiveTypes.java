public class PrimitiveTypes {

    public static void main(String[] args) {
        // decimal values -> 5.6, 8.9
        // whole numbers -> 5,96,82
        /**
         * INTEGER is wrapper Class that can hold values of int type + it provides additional methods and properties + use with
         * java collection
         */

        /**
         * int, short, long only support whole number values
         * float can only hold decimal values -> 32 bits -> 56.66
         * double can hold both decimal values -> 64 bits -> 45.56
         */

        byte a = Byte.MIN_VALUE; // 8 bit 2^8 = 256 // -128-----------0--------------127
        // 01111111
        // 10000000 --> 1's Compliment
        // 00000001 --> 2's Compliment
//        System.out.println(a);
        short b = 2 + 3; // 16 bit
        char f = 'a' + 3; // 16 bit
//        System.out.println(f);
        int c = 555; // 32 bit
        long d = (long) 3.5; // 64 bit 2^64
//        System.out.println(d);
        long e = Long.MIN_VALUE;
        float g = 1.2f; // 32 bit // only holds decimal values
        double h = 5d; // 64 bit // both decimal + whole number

        String str = new String();
        str = "Vinay";
        // by nature, it is a class // by usage, it is primitive data type
        String str1 = new String();
        str1 = "Vinay";
//        System.out.println(str.equals(str1));

        int i1 = 130; // > 128
        int i2 = 130; // > 128

        System.out.println(i1==i2);
//        System.out.println(i1.equals(i2));


//
//      // == vs equals
        // Pooling concept
//        System.out.println(str.charAt(0)); // arr[0]
//        System.out.println(e);
    }

    /**
     * @UPCOMING_LECTURE
     */

}

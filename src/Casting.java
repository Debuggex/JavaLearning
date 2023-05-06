public class Casting {

    public static void main(String[] args) {

        int a =5;
        long b = a;


        char c = 'c';
        int d = (int) 5.6;


        String str = "99";
        Integer i1;
        Long l1 = 21474836478L;
        i1 = l1.intValue();
        System.out.println(i1);


        // l1 = 100
        // l2 = 90
        // l1.compareTo(l2) = +1
    }

}

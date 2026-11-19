public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        
        int numOdd = 0, two_before = 0, one_before = 1;
        for (int i = 0; i < x; i++) {
            if(i == 0){
                System.out.print(1);
                numOdd++;
            }
            else{
                int current = two_before + one_before;
                System.out.print(current);
                if(current % 2 == 1){
                    numOdd++;
                }
                two_before = one_before;
                one_before = current;
            }
            if (i < x - 1) 
                System.out.print(" ");

        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}

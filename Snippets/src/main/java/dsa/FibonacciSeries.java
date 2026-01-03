package dsa;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 =0 , n2 = 1, temp = 0;
        System.out.print(n1 +" "+ n2+ " ");
        for (int i = 0; i < 10; i++) {
            temp = n1+n2;
            n1 = n2;
            n2 = temp;
            System.out.print(temp+" ");
        }
    }
}

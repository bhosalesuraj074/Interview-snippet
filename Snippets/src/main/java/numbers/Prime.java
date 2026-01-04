package numbers;

public class Prime {
    public static boolean isPrime(int num){
        for (int i=2;i< num ; i++){
            if (num % i ==0)
                return  false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(String.format("Is number is prime %d", 17)+ " : " + isPrime(17));
        System.out.println(String.format("Is number is prime %d", 12)+ " : " + isPrime(12));
    }
}

package numbers;

public class SecondHighest {
    public static void main(String[] args) {
        int arr [] =  {13,48,92,45,18};
        int highest, secondHighest;
        if (arr[0] > arr[1]){
            highest = arr[0];
            secondHighest = arr[1];
        }else {
            highest = arr[1];
            secondHighest = arr[0];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest){
                secondHighest = highest;
                highest = arr[i];
            }
            if (secondHighest < arr [i] && highest > arr[i] ){
                secondHighest = arr[i];
            }
        }


        System.out.println("Second highest: "+ secondHighest);


    }
}

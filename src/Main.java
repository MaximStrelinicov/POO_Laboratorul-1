import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        int[] myArry = {2 , 4 , 6, 8 ,10};
        int b = 0 ;
        System.out.println("inreoduceti un numar de tip integer petru variabila b");
        try {
             b = new Scanner(System.in).nextInt();
        }catch(Exception myErr){
            System.err.println(myErr.getClass());
            System.exit(1);
        };
        for(int i = 0 ; i< myArry.length;i++){
            if(myArry[i] < b){
                System.out.println("Elementul din tablou " + myArry[i] + " < Elemnetul  b " + b);
            } else if (myArry[i] > b) {
                System.out.println("Elementul din tablou " + myArry[i] + " > Elemnetul  b " + b);
            } else if (myArry[i] == b) {
                System.out.println("Elementul din tablou " + myArry[i] + " = Elemnetul  b " + b);
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(b);
        list.add(5);
        list.add(7);
        list.add(8);
        System.out.println("Elementele din lista sunt :");

        for(int num : list) {
            System.out.println(num);
        }
        System.out.println("Elementele pare din lista");
        list.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }
}

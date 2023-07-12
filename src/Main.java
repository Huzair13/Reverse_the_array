import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the Array !!");
        int size=scanner.nextInt();

        System.out.println("Enter the Array Elements");
        int array[]=new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }

        //calling the reverse Array function
        ReverseArray(array,size);

    }

    private static void ReverseArray(int[] array, int size) {
        int start=0;
        int end=size-1;
        while(start<=end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        System.out.println("REVERSED ARRAY !!!!");
        for(int i: array){
            System.out.print(i+" ");
        }
    }
}
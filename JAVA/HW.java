

import java.util.*;
class HW{

public static void main(String[] args) {
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 5 intergers");
    for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }
    sc.close();
    System.out.println("largest: "+largest(arr));
    System.out.println("smallest: "+smallest(arr));
    System.out.println("sum: " +sum(arr));
    System.out.println("product: " +product(arr));

}

public static int largest(int[] arr){
    int a=0;
    for(int i=0; i<arr.length; i++){
        if(i==0){
            a=arr[i];
        }
        else{
            if(a<arr[i]){
                a=arr[i];
            }
        }
    }
    return a;
}

public static int smallest(int[] arr){
    int a=0;
    for(int i=0; i<arr.length; i++){
        if(i==0){
            a=arr[i];
        }
        else{
            if(a>arr[i]){
                a=arr[i];
            }
        }
    }
    return a;
}

public static int sum(int[] arr){
    int a=0;
    for(int i=0; i<arr.length; i++){
        a+=arr[i];
    }
    return a;
}

public static int product(int[] arr){
    int a=1;
    for(int i=0; i<arr.length; i++){
        a*=arr[i];
    }
    return a;
}

}
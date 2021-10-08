import java.util.Scanner;
public class Solution{


    public static Scanner scn = new Scanner(System.in);

    public static int oddfactors(int n){
        int count = 0;
        for(int i = 2; i * i <= n; i++){
            while(n % i == 0 ){
                if(i % 2 != 0) count++;
             
                n = n / i;
            }
        }
        
        if(n != 1)
            count++;
    
        return count;
	}

    public static int evenfactors(int n){
        int count = 0;
                for(int i = 2; i * i <= n; i++){
                    while(n % i == 0 ){
                        if(i % 2 == 0) count++;
                     
                        n = n / i;
                    }
                }
                
                if(n != 1)
                    count++;
            
                return count;
            }
            public static int primefactors(int n){
                int count = 0;
                        for(int i = 2; i * i <= n; i++){
                            while(n % i == 0 ){
                                 count++;
                             
                                n = n / i;
                            }
                        }
                        
                        if(n != 1)
                            count++;
                    
                        return count;
                    }


    

    public static void ans(int[] arr){
        int maxOdd = 0; int maxEven = 0; int maxPrime = 0;
        for(int i = 0; i < arr.length;i++){
            if(oddfactors(arr[i]) >- maxOdd) maxOdd = arr[i];
            if(evenfactors(arr[i]) > maxEven) maxEven = arr[i];
            if(primefactors(arr[i]) > maxPrime) maxPrime =arr[i];
        }
        System.out.println(maxOdd + " has max Odd factors");
        System.out.println(maxEven + " has max Even factors");
        System.out.println(maxPrime + " has max Prime factors" );
    }

    public static void main(String[] args) {
        
        int n = 10;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        // ans(arr);



    }
}
import java.io.*;
import java.util.*;

public class ques {
    public static Scanner scn = new Scanner(System.in);

    public static int span(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0] - arr[arr.length - 1];
    }

    public static int countOfChar(String str, char a) {

        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == a)
                count++;
        }
        return count;
    }

    public static boolean bagOf(String str1, String str2) {

        boolean flag = false;
        if (str2.length() > str1.length())
            return flag;

        int i = 0;

        while (i != str2.length()) {
            char ch = str2.charAt(i);
            int c1 = countOfChar(str2, ch);
            int c2 = countOfChar(str1, ch);
            if (c1 == c2) {
                flag = true;
                i++;
            } else {
                break;
            }

        }

        return flag;

    }

    public static void barChart(int[] arr) {

        int maxEle = -(int) 1e8;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxEle)
                maxEle = arr[i];
        }

        // System.out.println(maxEle);

        for (int i = maxEle; i >= 1; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] <= i) {
                    System.out.print("*	");

                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void display(int[] arr) {
        for (int val : arr)
            System.out.print(val + " ");
    }

    public static int[] reverse(int[] arr) {
        int[] ans = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }

    public static void twoSumArray(int[] arr, int[] arr2) {
        arr = reverse(arr);
        arr2 = reverse(arr2);
        int sizeAns = Math.max(arr.length, arr2.length);
        int idx = Math.min(arr.length, arr2.length);
        int[] ans = new int[sizeAns];

        for (int i = 0; i < idx; i++) {
            ans[i] = arr[i] + arr2[i];

        }

        for (int i = idx; i < sizeAns; i++) {
            ans[i] = arr2[i];
        }

        ans = reverse(ans);
        display(ans);

    }

    public static void rotate(int[] a, int k) {

        int n = a.length;
        k = k % n;
        if(k < 0) k = k + n;
        // if (k == 0)
        //     display(a);
        int[] arr = new int[n];
        int j = 0;
        for (int i = a.length - k; i < a.length; i++) {
            arr[j] = a[i];
            j++;
        }

        System.out.println(j);
        for (int i = 0; i < a.length - k; i++) {
            arr[j] = a[i];
            j++;
            display(arr);
            System.out.println();
        }

      

    }


    public static void brokenEco(int n,int[] arr, int k){
        //   Arrays.sort(arr);
            n = arr.length; int diff = (int)1e8; int idx = 0; int ans = 0;
            for(int i = 0; i < n; i++){
    
                if(Math.abs(arr[i] - k) < diff){
                    diff = Math.abs(arr[i] - k);
                   ans = arr[i];
                    idx = i;
                } 
            }
    
            if(ans == k) System.out.println(k);
            else {
                
                if(ans > k){
                     System.out.println(arr[idx] );
                     System.out.println(arr[idx -1 ] );
                }
                
                else{
                    System.out.println(arr[idx + 1] );
                    System.out.println(arr[idx] );
                    
                }
                
            }
           
    
        }


        
    public static void firstLast(int n,int[] arr, int k){
        n = arr.length; int i = 0; int j = n - 1; int lowIdx = 0; int high = 0;
          for( i = 0; i < arr.length; i++){
              if(arr[i] == k){
                lowIdx = i;
                break;
              }

          }

          for( i = j; i > 0; i--){
            if(arr[i] == k){
              high = i;
              break;
            }

        }

          System.out.println(lowIdx);
          System.out.println(high);
           
    
        }

        

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();

        firstLast(n, arr, k);

        // int[] arr1 = new int[n];

        // for (int i = 0; i < n; i++) {
        //     arr1[i] = scn.nextInt();
        // }

        // int m = scn.nextInt();
        // int[] arr2 = new int[m];
        // for (int i = 0; i < m; i++) {
        //     arr2[i] = scn.nextInt();
        // }

        // twoSumArray(arr1, arr2);
        // String str1 = "abcdeef";
        // String str2 = "abee";

        

    }

}
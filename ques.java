import java.math.BigInteger;
import java.util.*;

public class ques {
    public static Scanner scn = new Scanner(System.in);

    // Simple Array Sum

    public static int simpleArraySum(List<Integer> ar) {

        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum = sum + ar.get(i);
        }
        return sum;
    }

    // Compare the triplets
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here

        int countA = 0;
        int countB = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i))
                countA++;
            if (a.get(i) < b.get(i))
                countB++;

        }
        List<Integer> list = new ArrayList<Integer>();
        list.add(countA);
        list.add(countB);
        return list;

    }

    // Big sum

    public static long aVeryBigSum(List<Long> ar) {
        long count = 0;
        for (int i = 0; i < ar.size(); i++) {
            count = count + ar.get(i);
        }
        return count;
    }

    // Diagonal Difference
    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int m = arr.get(0).size();
        int d1 = 0;
        int d2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j)
                    d1 = d1 + arr.get(i).get(j);
                if (i + j == n - 1)
                    d2 = d2 + arr.get(i).get(j);
            }
        }
        return Math.abs(d1 - d2);
    }
    // Plus minus

    public static void plusMinus(List<Integer> ar) {

        double countP = 0;
        double countN = 0;
        double counto = 0;
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) < 0)
                countN++;
            if (ar.get(i) > 0)
                countP++;
            if (ar.get(i) == 0)
                counto++;
        }
        System.out.println(countP / ar.size());
        System.out.println(countN / ar.size());
        System.out.println(counto / ar.size());
    }

    // Staircase

    public static void staircase(int n) {
        int nsp = n - 1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print(" ");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("#");
            }
            System.out.println();
            nst++;
            nsp--;
        }

    }

    // MiniMax

    public static void miniMaxSum(List<Integer> ar) {
        Collections.sort(ar);
        long Mxsum = 0;
        long Mnsum = 0;
        for (int i = 1; i < ar.size(); i++) {
            Mxsum = ar.get(i) + Mxsum;
        }
        for (int i = 0; i < ar.size() - 1; i++) {
            Mnsum = ar.get(i) + Mnsum;
        }

        Long l2 = Long.valueOf(Mnsum);
        Long l3 = Long.valueOf(Mxsum);

        System.out.print(l2 + " " + l3);

    }

    // Birthday Candles

    public static int birthdayCakeCandles(List<Integer> arr) {
        int count = 0;
        int maxEle = (int) -1e8;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > maxEle)
                maxEle = arr.get(i);

        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == maxEle)
                count++;
        }
        return count;
    }

    // Time Conversion

    public static String timeConversion(String str) {

        String ans = str.substring(0, 2);
        // System.out.println(ans);
        String sub2 = str.substring(str.length() - 2);
        // System.out.println(sub2);
        int num = Integer.parseInt(ans);

        // System.out.println(num);

        if (sub2.charAt(0) == 'P') {
            if (num <= 11)
                num = 12 + num;

            ans = num + str.substring(2, 8);
        }

        if (sub2.charAt(0) == 'A') {
            if (num == 12)
                num = 0;
            String str1 = Integer.toString(num);
            ans = "0" + str1 + str.substring(2, 8);
        }

        return ans;

    }

    // Grading Students
    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> ans = new ArrayList<Integer>();
        int size = grades.size();
        int ele;
        for (int i = 0; i < size; i++) {
            ele = grades.get(i);
            if (ele >= 38) {

                if (ele % 5 == 3) {
                    ele = ele + 2;
                    ans.add(ele);
                }

                else if (ele % 5 == 4) {
                    ele = ele + 1;
                    ans.add(ele);
                }

                else {
                    ans.add(ele);
                }

            }

            else {
                ans.add(ele);
            }

        }

        return ans;

    }

    // Apple and Oranges

    public static void countApplesAndOranges(int sD, int tD, int aL, int bL, List<Integer> apples,
            List<Integer> oranges) {

        int n = apples.size();

        int m = oranges.size();
        int ap;
        int op;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            ap = apples.get(i);
            if (ap + aL >= sD && ap + aL <= tD) {
                count1++;

            }
        }
        System.out.println(count1);
        for (int i = 0; i < m; i++) {
            op = oranges.get(i);
            if (bL + op <= tD && bL + op >= sD) {
                count2++;

            }
        }
        System.out.println(count2);

    }

    // Number Line Jumps
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        String ans = "";
        if (v1 > v2) {

            if ((x1 - x2) % (v2 - v1) == 0)
                ans = "YES";
            else
                ans = "NO";
        } else
            ans = "NO";
        return ans;

    }

    // Between two sets

    public static int getGCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGCD(n2, n1 % n2);
    }

    public static int getLCM(int n1, int n2) {
        if (n1 == 0 || n2 == 0)
            return 0;
        else {
            int gcd = getGCD(n1, n2);
            return Math.abs(n1 * n2) / gcd;
        }
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int result = 0;

        // Get LCM of all elements of a
        int lcm = a.get(0);
        for (Integer integer : a) {
            lcm = getLCM(lcm, integer);
        }

        // Get GCD of all elements of b
        int gcd = b.get(0);
        for (Integer integer : b) {
            gcd = getGCD(gcd, integer);
        }

        // Count multiples of lcm that divide the gcd
        int multiple = 0;
        while (multiple <= gcd) {
            multiple += lcm;

            if (gcd % multiple == 0)
                result++;
        }

        return result;
    }

    // Breaking The record

    public static List<Integer> breakingRecords(List<Integer> scores) {

        List<Integer> ans = new ArrayList<Integer>();
        int maxEle = scores.get(0);
        ;
        int minEle = scores.get(0);
        ;
        int countMax = 0;
        int countMin = 0;
        int size = scores.size();
        for (int i = 0; i < size; i++) {

            if (maxEle > scores.get(i)) {
                maxEle = scores.get(i);
                countMax++;
            }
        }

        for (int i = 0; i < size; i++) {

            if (minEle < scores.get(i)) {
                minEle = scores.get(i);
                countMin++;
            }
        }

        ans.add(countMin);
        ans.add(countMax);
        return ans;

    }

    // SubArray Divisions
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int ans = 0;
        for (int i = 0; i <= s.size() - m; i++) {

            for (int j = 0; j < m; j++) {
                ans = ans + s.get(j + i);
            }
            if (ans == d) {
                count++;
            }

            ans = 0;
        }

        return count;
    }

    // Divisible Sum Pairs

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        n = ar.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    if (i < j && i != j)
                        count++;
                }

            }

        }
        return count;

    }
    // Mirgratory Birds

    public static int migratoryBirds(List<Integer> ar) {
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int fans = 0;
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) == 1)
                c1++;
            if (ar.get(i) == 2)
                c2++;
            if (ar.get(i) == 3)
                c3++;
            if (ar.get(i) == 4)
                c4++;
            if (ar.get(i) == 5)
                c5++;
        }
        int[] ans = { c1, c2, c3, c4, c5 };
        int max = (int) -1e8;
        for (int i = 4; i >= 0; i--) {

            if (ans[i] >= max) {
                max = ans[i];
                fans = i;
            }

        }
        return fans + 1;

    }

    // Day of the Programmer
    public static String dayOfProgrammer(int n) {
        String str1 = "13.09.";
        String str2 = "12.09.";
        String str3 = "26.09.1918";
        String ans = "";

        if (n == 1918) {
            ans = str3;
        }

        else if (n % 4 == 0 && n != 1918) {

            if (n > 1918) {
                if (n % 100 == 0) {

                    if (n % 400 == 0)
                        ans = str2 + n;
                    else
                        ans = str1 + n;
                }

                else
                    ans = str2 + n;
            }
            if (n < 1918) {
                ans = str2 + n;
            }

        }

        else if (n % 4 != 0) {
            ans = str1 + n;
        }
        return ans;
    }

    // Bill Divison
    public static void bonAppetit(List<Integer> ar, int k, int b) {

        int sum = 0;
        int ans = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum = sum + ar.get(i);
        }

        if ((sum - ar.get(k)) / 2 == b)
            System.out.print("Bon Appetit");
        else
            System.out.print(Math.abs(b - (sum - ar.get(k)) / 2));

    }

    // Sales by match

    public static int sockMerchant(int n, List<Integer> ar) {
        n = ar.size();
        int count = 0;
        Collections.sort(ar);
        System.out.println(ar);
        for (int i = 0; i < n - 1; i++) {
            if (ar.get(i) == ar.get(i + 1)) {
                i++;
                count++;
            }

        }
        return count;
    }

    // Drawing Book
    public static int pageCount(int n, int p) {
        int ans1 = 0;
        // ===================================
        if (n % 2 == 0) {
            if (p % 2 == 0)
                ans1 = (n - p) / 2;
            else {

                if (n - p == 1)
                    ans1 = 1;
                else {
                    ans1 = (n - p - 1) / 2;
                }

            }

        }
        if (n % 2 != 0) {
            if (p % 2 == 0)
                ans1 = (n - p - 1) / 2;
            else
                ans1 = (n - p) / 2;

        }
        // ===================================

        int ans2 = 0;
        if (p % 2 == 0)
            ans2 = p / 2;
        if (p % 2 != 0)
            ans2 = (p - 1) / 2;

        int ans3 = Math.min(ans1, ans2);
        return ans3;

    }

    // Couting Valleys
    public static int countingValleys(int steps, String path) {
        steps = path.length();

        int sumChecker = 0;
        int ans = 0;
        for (int i = 0; i < steps; i++) {
            char ch = path.charAt(i);
            if (ch == 'D')
                sumChecker--;
            if (ch == 'U')
                sumChecker++;

            if (sumChecker == 0 && path.charAt(i) == 'U')
                ans++;
        }
        return ans;

    }

    // E-Shop
    public static int getMoneySpent(int[] keyboards, int[] drives, int budget) {
        int n = keyboards.length;
        int m = drives.length;
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum = keyboards[i] + drives[j];
                if (sum > ans && sum <= budget) {
                    ans = sum;
                }

            }
        }

        if (ans == 0)
            return -1;
        else
            return ans;

    }

    // Cats and Mouse

    public static String catAndMouse(int x, int y, int z) {
        String ans = "";
        int c1 = Math.abs(x - z);
        int c2 = Math.abs(y - z);

        if (c1 < c2)
            ans = "Cat A";
        if (c1 > c2)
            ans = "Cat B";
        if (c1 == c2)
            ans = "Mouse C";
        return ans;
    }

    // Magic Square

    public static int formingMagicSquare(List<List<Integer>> arr) {
        List<Integer> row = new ArrayList<Integer>();
        List<Integer> ans = new ArrayList<Integer>();

        int allMagic[][] = { { 4, 9, 2, 3, 5, 7, 8, 1, 6 }, { 4, 3, 8, 9, 5, 1, 2, 7, 6 },
                { 2, 9, 4, 7, 5, 3, 6, 1, 8 }, { 2, 7, 6, 9, 5, 1, 4, 3, 8 }, { 8, 1, 6, 3, 5, 7, 4, 9, 2 },
                { 8, 3, 4, 1, 5, 9, 6, 7, 2 }, { 6, 7, 2, 1, 5, 9, 8, 3, 4 }, { 6, 1, 8, 7, 5, 3, 2, 9, 4 }, };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                row.add(arr.get(i).get(j));
            }
        }

        for (int i = 0; i < 8; i++) {
            int sumRow = 0;
            for (int j = 0; j < 9; j++) {

                sumRow = sumRow + Math.abs(allMagic[i][j] - row.get(j));

            }
            ans.add(sumRow);
        }
        Collections.sort(ans);
        return ans.get(0);

    }

    // Picking Numbers

    public static int pickingNumbers(List<Integer> arr) {
        int hash[] = new int[101];
        int ans = -(int) 1e8;

        for (int i = 0; i < arr.size(); i++) {
            int idx = arr.get(i);
            hash[idx]++;
        }

        for (int i = 1; i < 100; i++) {
            ans = Math.max(ans, hash[i] + hash[i - 1]);
        }
        return ans;

    }

    // Hurdle Race
    public static int hurdleRace(int k, List<Integer> height) {
        int maxEle = -(int) 1e8;
        for (int i = 0; i < height.size(); i++) {

            if (maxEle < height.get(i))
                maxEle = height.get(i);

        }
        if (k >= maxEle)
            return 0;

        return maxEle - k;

    }

    // Designer PDF

    public static int designerPdfViewer(List<Integer> h, String word) {
        List<Integer> len = new ArrayList<Integer>();
        int breadth = word.length();
        int nch;
        for (int i = 0; i < word.length(); i++) {
            nch = word.charAt(i);
            int idx = nch - 97;
            len.add(h.get(idx));
        }
        int maxEle = -(int) 1e8;
        for (int i = 0; i < len.size(); i++) {
            if (maxEle <= len.get(i))
                maxEle = len.get(i);
        }

        int area = maxEle * breadth;
        return area;

    }

    // Utopian Tree
    public static int utopianTree(int h) {

        int ans = 1;
        for (int n = 1; n <= h; n++) {
            if (n % 2 != 0) {
                ans = ans * 2;
            } else {
                ans++;
            }
        }
        return ans;
    }

    // Angery Professor

    public static String angryProfessor(int k, List<Integer> a) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) <= 0)
                count++;
        }
        if (count < k)
            return "YES";
        return "NO";
    }

    // Beautiful Days
    public static int reverse1(int n) {
        int ans = 0;
        while (n != 0) {
            int remainder = n % 10;
            ans = ans * 10 + remainder;
            n = n / 10;
        }
        return ans;
    }

    public static int beautifulDays(int l1, int l2, int k) {
        int count = 0;
        for (int i = l1; i <= l2; i++) {
            int d = i - reverse1(i);
            if (d % k == 0)
                count++;
        }
        return count;
    }

    // Viral Advertising

    public static int viralAdvertising(int n) {
        int liked = 2;
        int cum = 2;
        for (int i = 0; i < n; i++) {
            liked = (liked * 3) / 2;
            cum = cum + liked;
        }
        return cum - liked;
    }

    // Sequence Equation
    public static int idx(List<Integer> p, int data) {
        int ans = 0;
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i) == data)
                ans = i;
        }
        return ans;
    }

    public static List<Integer> permutationEquation(List<Integer> p) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < p.size(); i++) {
            int id = idx(p, i + 1) + 1;
            int ans = idx(p, id) + 1;
            list.add(ans);
        }

        return list;
    }

    // Find Digits

    public static int findDigits(int n) {
        int count = 0;
        String str1 = Integer.toString(n);
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int a = ch - '0';
            if (a == 0)
                continue;
            if (n % a == 0)
                count++;

        }

        return count;

    }

    public static int moonDFS(ArrayList<Integer>[] graph, int src, boolean[] vis) {
        vis[src] = true;
        int size = 0;
        for (Integer e : graph[src]) {
            if (!vis[e])
                size += moonDFS(graph, e, vis);
        }
        return size + 1;
    }
    // Journey to the Moon

    public static long journeyToMoon(int n, int[][] astronaut) {
        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        for (int[] a : astronaut) {
            graph[a[0]].add(a[1]);
            graph[a[1]].add(a[0]);
        }

        ArrayList<Integer> sizeArray = new ArrayList<>();
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!vis[i])
                sizeArray.add(moonDFS(graph, i, vis));
        }

        long ssf = 0, res = 0;
        for (int ele : sizeArray) {
            res += ele * ssf;

            ssf += ele;
        }
        return res;

    }

    public static int saveThePrisoner(int n, int m, int s) {

        int ans = ((m - 1) + (s - 1)) % n + 1;
        return ans;

    }

    // extra long factorial

    public static void extraLong(int n) {

        BigInteger bi = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        System.out.print(bi);

    }

    // Stick Length

    // public static int minimum(List<Integer> arr) {
    // int minEle = (int) 1e9;
    // for (int i = 0; i < arr.size(); i++) {
    // if (arr.get(i) < minEle)
    // minEle = arr.get(i);
    // }
    // return minEle;
    // }

    // public static int findCount(List<Integer> arr, int ele) {
    // int count = 0;
    // for (int i = 0; i < arr.size(); i++) {
    // if (ele == arr.get(i))
    // count++;
    // }
    // return count;
    // }

    public static List<Integer> cutTheSticks(List<Integer> list) {
        List<Integer> ll = new ArrayList<Integer>(list.size());
        Collections.sort(list);
        ll.add(list.size());
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) != list.get(i - 1))
                ll.add(list.size() - i);
        }
        return ll;

    }

    // String append Delete

    public static String appendAndDelete(String s, String t, int k) {
        int count = 0;
        String str = "Yes";
        int m = s.length();
        int n = t.length();

        int diff = n - m;

        if (diff > 0) {
            if (diff % 2 == 0 && k % 2 == 0)
                str = "Yes";
            else if (diff % 2 != 0 && k % 2 != 0)
                str = "Yes";
            else
                str = "No";
        }

        for (int i = 0; i < Math.min(m, n); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                count++;

                System.out.println(s.charAt(i) + " " + count + " " + t.charAt(i));
            } else {
                break;
            }

        }

        if (m + n <= k)
            return str;

        else {

            if (count == m && count == n && k >= 2)
                return str;

            if (k < (m + n) - (2 * count))
                str = "No";
        }
        return str;

    }

    public static int count(int n, int k, int[] h) {
        int ans = 1;
        for (int i = 0; i < h.length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < h.length; j++) {

                if (h[i] >= h[j])
                    count++;

            }
            if (count >= k)
                ans++;

        }
        return ans;
    }

    // Insertion Sort

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isGreater(int[] arr, int j, int i) {

        if (arr[i] < arr[j]) {
            return true;
        } else {
            return false;
        }
    }

    // Insertion

    public static void insertionSort1(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (isGreater(arr, j, j + 1)) {
                    swap(arr, j, j + 1);
                } else {
                    break;
                }
            }
        }
    }

    // Super Reduced Strings

    public static String superReducedString(String s) {
        String str = "Empty String";
        if (s.length() == 1)
            return s;
        int i = 0;
        int j = 1;

        while (j < s.length()) {
            if (s.charAt(0) == s.charAt(1)) {
                s = s.substring(2);
            } else if (s.charAt(i) != s.charAt(j)) {
                i++;
                j++;
            }

            else {
                s = s.substring(0, i) + s.substring(j + 1);
                i = i - 1;
                j = j - 1;
            }
        }

        System.out.println(i + " " + j);
        if (s.length() == 0)
            return str;
        return s;

    }

    // mars Exploration

    public static int marsExploration(String s) {
        int count = 0;
        String sos = "SOS";
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != sos.charAt(i % 3))
                count++;

        }
        return count;
    }

    // Pangram

    public static String panagram(String s) {
        s = s.toLowerCase();
        String ans = "pangram";
        String str = "abcdefghijklmnopqrstuvwxyz";
        int i = 0, j = 0, count = 0;
        ;
        while (i < str.length() && j < s.length()) {
            if (str.charAt(i) != s.charAt(j)) {
                j++;
            }

            else if (str.charAt(i) == s.charAt(j)) {
                i++;
                j = 0;
                count++;
            }

        }
        if (count != 26)
            ans = "not pangram";
        System.out.println(count);
        return ans;

    }



    // public static void weightedUniformStrings(String s) {

    //     List<Integer> ll = new ArrayList<Integer>();

    //     for (int i = 0; i < s.length() - 1; i++) {
          
    //         int w = s.charAt(i) - 96;
    //         int currW = 
    //         if(s.charAt(i) == s.charAt(i+1)){

    //         }

    //     }

    // }

    // Palindrome Array

    public static boolean palindromeArray(ArrayList<Integer> arr) {
        boolean flag = true;
        int i = 0, j = arr.size() - 1;
        while (i < arr.size() / 2) {
            if (arr.get(i) == arr.get(j)) {
                i++;
                j--;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static String funnyString(String s) {
        String ans = "Funny";
        ArrayList<Integer> ll1 = new ArrayList<Integer>();

        for (int i = 0; i < s.length() - 1; i++) {
            ll1.add(Math.abs(s.charAt(i) - s.charAt(i + 1)));
        }

        if (!palindromeArray(ll1))
            ans = "Not Funny";
        return ans;

    }

    // GemStone

    // public static int gemstones(List<String> arr) {
    // int j = 0, count = 0;
    // for(int i = 1; i < arr.size(); i++){
    // String str = arr.get(j);
    // String str2 = arr.get(i);

    // int len = str.length();

    // for(int k = 0 ; k < len; k++){
    // if(str.charAt(k) == str2.charAt(k)) count++;

    // }

    // }

    // }

    // Alternating Character
    public static int alternatingCharacters(String s) {

        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {

                count++;
            }
        }
        return count;

    }

    // Love Letter

    public static int theLoveLetterMystery(String s) {

        int i = 0;
        int j = s.length() - 1;
        int count = 0;
        if (s.length() == 1)
            return count;

        while (i < s.length() / 2) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                count = count + Math.abs(s.charAt(i) - s.charAt(j));
                i++;
                j--;
            }
        }

        return count;
    }

    // hackerRank String
    public static String hackerrankInString(String s) {
        String str = "hackerrank"; int count = 0; String ans = "YES";
        if(s.length() < str.length()) ans = "NO";
    
        for (int i = 0; i < s.length(); i++) {
           if(count < 10 && s.charAt(i) == str.charAt(count)){
               count++;
           }
        }
        System.out.println(count);
        if(count != 10) ans = "NO";
        return ans;     
    }


    

    public static String swapChars(String str, int lIdx, int rIdx) {
        StringBuilder sb = new StringBuilder(str);
        char l = sb.charAt(lIdx), r = sb.charAt(rIdx);
        sb.setCharAt(lIdx, r);
        sb.setCharAt(rIdx, l);
        return sb.toString();
    }

    public static String pass(String str){
        // String ans = str.replace("*", "");
        str = str.replace("*", "");
           
            for(int i = 0; i < str.length() - 1; i++){
                if(str.charAt(i+1) >= 'a' && str.charAt(i+1) <= 'z' && str.charAt(i) <= 'Z'  && str.charAt(i) >= 'A' ){
                   str =  swapChars(str, i+1, i);
                } 

            }

           
            return str;

    }

    public static String decryptPassword(String s) {

        String str = pass(s);
        int i = 0; int j = str.length() - 1;

        while(i != j){
            if(str.charAt(i) <= '9' && str.charAt(i) >= '1' && str.charAt(j) == '0') {
                str =  swapChars(str, i, j);
               
                i++;
                j--;
            }
            else{
                j--;
            } 
          
        }
        str = str.replace("0", "");
        return str;
        }

    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<Integer>();
        // list.add(1);
        // list.add(2);
        // list.add(7);
        // list.add(3);
        // list.add(2);
        // list.add(1);
        String str2 = "51Pa*0Lp*0e";
       
        System.out.println(decryptPassword(str2));

        // swapChar(str2,'a','b');
        // int[] count = {9,5,6,7,4};
        // insertionSort1(count);
        // for(int i = 0; i < count.length; i++){
        // System.out.print(count[i] + " ");

        // }
        // String str = scn.nextLine();
        // int n = scn.nextInt();
        // int[] count = new int[n];
        // String str2 = "abccddde";

        // // System.out.print(panagram(str2));
        // weightedUniformStrings(str2);

    }

}

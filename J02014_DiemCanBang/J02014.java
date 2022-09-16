import java.util.*; 
public class J02014 { 
    public static void main(String[] agrs) { 
        Scanner sc = new Scanner(System.in); 
        int x =sc.nextInt(); 
        while(x>0) { 
            x--; 
            int n = sc.nextInt(); 
            int sumL = 0; 
            int sumR = 0; 
            int[] a = new int[n]; 
            int prime = -1; 
            for (int i = 0; i < n; i++) { 
                a[i] = sc.nextInt(); 
                sumR += a[i]; 
            } 
            sumR -= a[0]; 
            for (int i = 1; i < n; i++) { 
                if (sumR == sumL) { 
                    prime = i; 
                    break; 
                } 
                else { 
                    sumR -= a[i]; 
                    sumL += a[i-1]; 
                } 
            } 
            System.out.println(prime); 
        } 
    } 
}
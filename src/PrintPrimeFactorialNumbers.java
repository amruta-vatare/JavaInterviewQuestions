import java.util.Scanner;



public class PrintPrimeFactorialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc.nextInt();
        getFact(no);
    }

    public static void getFact(int n){
        boolean foundFactor = false;
        if(isPrime(n))
            System.out.print(" "+n);

        for(int i = 2;i<n-1;i++){
            if(foundFactor)
                break;
            for (int j = 1;j<n-1;j++){
                if(i*j == n){
                    foundFactor = true;
                    if(isPrime(i) && isPrime(j)){
                        System.out.print(" "+i);
                        System.out.print(" "+j);
                    }else if(isPrime(i)){
                        System.out.print(" "+i);
                        getFact(j);
                    }else if(isPrime(j)){
                        System.out.print(" "+j);
                        getFact(i);
                    }else
                    {
                        getFact(i);
                        getFact(j);
                    }
                }else{
                    continue;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2 ;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

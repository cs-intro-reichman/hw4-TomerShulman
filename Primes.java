public class Primes {
    public static void main(String[] args) {
        int n =Integer.parseInt(args[0]);
        boolean[]arr= new boolean[n+1];
        int p=2;
        int count=0;
        for (int i = 2; i < arr.length; i++) {
            arr[i]=true;
        }
        while (p<Math.sqrt(n)) { 
            if (arr[p]){
                for (int index = p+1; index < n+1; index++) {
                    if (index%p==0) {
                        arr[index]=false;
                    }
                }
            }
            p++;
        }
        System.out.println("Prime numbers up to "+n+":");
        for (int i = 2; i < n+1; i++) {
            if (arr[i]==true) {
            count++;
            System.out.println(i);
            }
        }
        System.out.println("There are "+count+" primes between 2 and "+n+" ("+(int)(count * 100.0)/n+"% are primes)");
    }
}
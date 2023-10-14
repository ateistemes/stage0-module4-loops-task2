package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int k = 1;
        while( k <= printToInclusive){
            if(isPrime(k)){
                System.out.println(k);
            }
            k++;
        }
    }
    public boolean isPrime(int k){
        if( k <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(k);i++){
            if(k % i == 0){
                return false;
            }
        }
        return true;
    }
}

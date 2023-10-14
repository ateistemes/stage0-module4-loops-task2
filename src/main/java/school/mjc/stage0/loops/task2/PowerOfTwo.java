package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if( power < 0){
            System.out.println("too much power");
        }else{
            int k = 1;
            int cnt = 0;
            while(cnt <= power){
                cnt++;
                System.out.println(k);
                k*=2;
            }
        }
    }
}

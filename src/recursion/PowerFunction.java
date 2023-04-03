package recursion;

public class PowerFunction {

    public static int pow(int A, int B, int C) {
        if(A == 0)
            return 0;
        else if(B == 0)
            return 1;

        long result = 0L;
        long power = pow(A, B/2, C)%C;
        if(B%2 == 0){
            result = (power%C * power%C)%C;
        }else{
            result = ((power%C) * (power%C) * A%C)%C;
        }
        if(result < 0){
            return (int) ((result%C + C)%C);
        }else
            return (int)(result % C);
    }

    public static void main(String[] args) {
        pow(2, 10, 3);
    }
}

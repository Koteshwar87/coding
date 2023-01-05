package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class FactorsSortComparator {
    private static int factors(int n){
        int ans = 0;
        for(int i = 1; i * i <= n; i++){

            if(n % i == 0){
                ans += 2;
            }
//            System.out.println("i = " + i + " ans = " + );
            if(i*i == n){
                ans--;
            }
        }
        System.out.println("n = " + n + " factors = " + ans);
        return ans;
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        A.sort((lhs, rhs) -> {
            int factorLhs = factors(lhs);
            int factorRhs = factors(rhs);
            if (factorLhs == factorRhs){
                return lhs-rhs;
            }else {
                return factorLhs-factorRhs;
            }
            /*if(factorLhs < factorRhs)
                return factorLhs;
            else if(factorLhs > factorRhs)
                return false;
            else {
                if(lhs < rhs)
                    return true;
                else
                    return false;
            }*/
        });
        return A;
    }

    public static void main(String[] args) {
//        System.out.println(solve(new ArrayList<>(Arrays.asList(6,8,9))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(36, 13, 13, 26, 37, 28, 27, 43, 7))));
//        factors(26);
    }
}

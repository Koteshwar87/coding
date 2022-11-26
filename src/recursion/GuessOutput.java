package recursion;

public class GuessOutput {

    public static void main(String[] args) {
        func(5);
    }

    static void func(int num){
        if (num == 0)
            return;

//        System.out.println(num);
        System.out.println("Before func call");

        func(num-1);

        System.out.println("After func call");
        System.out.println(num);
    }
}

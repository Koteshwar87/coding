package bitmanipulations;

public class Basics {
    public static void main(String[] args) {
        int i = 5; // 0 1 0 1
        for(int j = 0; j < 4; j++){
            if((i & (1<<j)) != 0){
                System.out.println("jth bit = " + j);
            }
        }
    }
}

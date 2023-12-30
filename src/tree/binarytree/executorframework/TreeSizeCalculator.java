package tree.binarytree.executorframework;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
public class TreeSizeCalculator implements Callable<Integer> {
    Node root;
    ExecutorService executorService;

    TreeSizeCalculator(Node root, ExecutorService executorService){
        this.root = root;
        this.executorService = executorService;
    }

    @Override
    public Integer call() throws Exception {

        if(root == null){
            return 0;
        }

        TreeSizeCalculator leftTree = new TreeSizeCalculator(root.left, executorService);
        Future<Integer> leftCountFuture = executorService.submit(leftTree);

        TreeSizeCalculator rightTree = new TreeSizeCalculator(root.right, executorService);
        Future<Integer> rightCountFuture = executorService.submit(rightTree);

        return 1 + leftCountFuture.get() + rightCountFuture.get();
    }
}

class Client{
    public static void main(String[] args) {

    }
}
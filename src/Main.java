import java.util.Random;

public class Main {
    static public void main(String[] args){
        Random r = new Random();
        BinarySearchTree example = new BinarySearchTree();
        for(int i = 0; i<10; i++){
           example.insert(r.nextInt(211)+11);
        }
        example.inorder();
        System.out.println("\n avg "+example.fingAvg());
        System.out.println("\n max "+example.findMax());
        System.out.println("\n min "+example.findMin());
    }
}


public class DoWhileLoops
{
    public static void main(String[] args) {   
        int i = 0;
        do {
            System.out.println("i ="+ i);
            i++;
        } while (i < 15);

        int k = 6;
        do {
            System.out.println("k =" + k); 
            k--;
        } while (k > 5);
        int a = 0;
        int b = 15;
        do {
            System.out.println("a =" + a);
            System.out.println("b =" + b);
            a++;
            b++;
        }
        while (a < 10 && b <= 20); 
    }
}

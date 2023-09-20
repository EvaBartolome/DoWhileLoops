
public class WhileLoops
{
public static void main(String[] args) {   
    int i = 0;
    while (i < 15)
    {
        i++;
        System.out.println("i ="+ i);
    }
    int k = 6;
    while (k > 5)
    {
        k--;
        System.out.println("k =" + k);
    }
    int a = 0;
    int b = 20;
    while (a < 10 && b <= 20) 
    {
        a++;
        b++;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }
}
}

import java.util.Scanner;

public class TwoPowerrN implements ISubscriber {
    public static int power(int N)
    {
        return (int) Math.pow(2,N);
    }

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int result = (int)power(N);
        System.out.println(result);
    }
}

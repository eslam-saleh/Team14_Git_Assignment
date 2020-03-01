
import java.util.Scanner;

public class TwoPowerrN implements ISubscriber {
    public static int power(int N)
    {
        return (int) Math.pow(2,N);
    }

    @Override
    public void notifySubscriber(String input){
        int result = (int)power(Integer.parseInt(input));
        System.out.println(result);
    }

}

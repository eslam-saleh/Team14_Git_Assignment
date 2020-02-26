public class CircleVolum implements ISubscriber{
    @Override
    public void notifySubscriber(String input) {
        // TODO Auto-generated method stub
        double pi = 22/7.0 ,volume = 0.0 , c = 4/3.0;
        volume = c * pi * Math.pow( Double.parseDouble(input) , 3);
        System.out.println("CircleVolume = " + volume);
    }
}

package src;

public class SphereSurfaceArea implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        double pi = 22/7.0;
        double surfaceArea = 0;
        surfaceArea = ((4 * pi) *  (Math.pow( Double.parseDouble(input) , 2)));
        System.out.println("Sphere Surface Area: " + surfaceArea);
    }
}

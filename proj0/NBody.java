public class NBody {
    public static double readRadius(String filenmae) {
        In in = new In(filenmae);
        int num = in.readInt();
        double radius = in.readDouble();
        return radius;
    }
}

public class BmiService {
    public double bodyMassIndex(int weight, double height) {
        double result = weight / (height * height);
        return result;
    }
}

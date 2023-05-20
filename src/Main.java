public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myIndex = service.bodyMassIndex(70, 1.7);
        System.out.println(myIndex);
    }
}

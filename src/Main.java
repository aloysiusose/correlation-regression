public class Main {

    public static void main(String[] args) {
        double [] A = {1,2,3,4,5,6};
        double [] B = {2,4,7,9,12,14};

        Correlation corr = new Correlation();
        Regression regression = new Regression();
        regression.getRegression(A,B);


    }
}
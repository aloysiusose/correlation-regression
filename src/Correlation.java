import java.util.Arrays;

public class Correlation {

    static public double getCorrelation(double [] X, double []Y){
        int N = X.length;
        double SumX = Arrays.stream(X).sum();
        double SumY = Arrays.stream(Y).sum();
        double [] XY = new double[N];
        double []XSquared = new double[N];
        double []YSquared = new double[N];

        for(int i=0; i<N; i++){
            XY[i] = X[i] * Y[i];
            XSquared[i] = X[i] * X[i];
            YSquared [i] = Y[i] * Y[i];

        }
        double SumXY = Arrays.stream(XY).sum();
        double SumXSquared = Arrays.stream(XSquared).sum();
        double SumYSquared = Arrays.stream(YSquared).sum();

        double rCoeff = (N*SumXY - SumX*SumY)/Math.sqrt((N*SumXSquared-(SumX*SumX))*(N*SumYSquared-(SumY*SumY)));


        System.out.println("rCoeff= " + rCoeff);
        return rCoeff;

    }
}

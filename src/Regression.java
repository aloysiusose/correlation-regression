import java.util.Arrays;

public class Regression {



    public void getRegression(double[] X, double[] Y){
        int N = X.length;
        // using the get correlation method of the correlation clas to provide the pearson corr coeff'
        double rCoeff = Correlation.getCorrelation(X, Y);

        double Xbar = (Arrays.stream(X).sum()/N);
        double Ybar = (Arrays.stream(Y).sum()/N);

        // i need to calculate the standard deviation of X and Y

        double [] meanDeviationOfX = new double[N];
        double [] meanDeviationOfY = new double[N];
        double [] meanDeviationOfXSquared = new double[N];
        double [] meanDeviationOfYSquared = new double[N];

        for(int i = 0; i < N; i++){
            meanDeviationOfX[i] = (X[i]-Xbar);
            meanDeviationOfXSquared[i] = meanDeviationOfX[i]*meanDeviationOfX[i];
            meanDeviationOfY[i] = (Y[i]- Ybar);
            meanDeviationOfYSquared[i] = meanDeviationOfY[i]*meanDeviationOfY[i];
        }

        double sumMeanDeviationOfX = Arrays.stream(meanDeviationOfXSquared).sum();
        double sumMeanDeviationOfY = Arrays.stream(meanDeviationOfYSquared).sum();

        double standardDeviationX = Math.sqrt(sumMeanDeviationOfX/(N-1));
        double standardDeviationY = Math.sqrt(sumMeanDeviationOfY/(N-1));


        //calculate the slope
        double slope = ((rCoeff*standardDeviationY)/standardDeviationX);

        double intercept = Ybar - (slope*Xbar);
        //calculate the intercept

        System.out.println("The line of equation is: Y = " + slope + "X " + intercept);
    }
}

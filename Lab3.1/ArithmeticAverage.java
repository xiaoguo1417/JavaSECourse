public class ArithmeticAverage extends Average{
    double sum;
    double arithmeticAverage;

    //求算数平均数
    @Override
    public double compute(int[] a){
        for(int number:a){
            sum += number;
        }
        arithmeticAverage = sum / a.length;
        return arithmeticAverage;
    }
}

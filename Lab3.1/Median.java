public class Median extends Average{
    double median;

    @Override
    public double compute(int[] a){
        //冒泡排序
        for(int i = 0;i < a.length;i++){
            for(int j = 0;j < a.length - i - 1;j++){
                if (a[j] > a[j+1]) {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        //输出排序后测试
        for(int i = 0;i < a.length;i++){
            System.out.print(a[i] + "  ");
        }
        System.out.println();

        //求中位数
        if(a.length%2 == 0){
            median = ((double)a[(a.length/2)-1] + (double)a[a.length/2]) / 2;
        } else {
            median = a[(a.length-1)/2];
        }
        return median;
    }
}

public class Main {
    public static void main(String args[]) {
        System.out.println("Starting...");
        Data d1 = new Data(4,4);
        d1.repopulate();
        System.out.println(d1);
        int[][] data2 = {{10,50,40},{20,40,20},{30,50,30}};
        Data d2 = new Data(data2);
        System.out.println(d2);
        System.out.println(d2.countIncreasingCols());
        int[][] data3 = {{10,540,440,440},{220,450,440,190}};
        Data d3 = new Data(data3);
        System.out.println(d3);
        System.out.println(d3.countIncreasingCols());
    }
}
public class p {
    public static int maxProfit(int[] prices) {
        int size = prices.length;
        if(size == 0)
            return 0;

        int profit = 0;
        int min = prices[0];
        for(int i=1;i<size;i++){
            if(prices[i]-min > 0) {
                profit += prices[i]-min;
                min = prices[i];
            }
            min = Math.min(min,prices[i]);
        }
        return profit;
    }

    public static int palinArray(int[] a, int n)
    {
        int f = 0;
        if(n < 1) return 0;
        for(int i = 0; i<n; i++){
            int num = a[i];
//            System.out.println(num);
            int reverse = 0;
            while(num != 0) {
                int remainder = num % 10;
                reverse = reverse * 10 + remainder;
                num = num / 10;
            }
            System.out.println(reverse);
            if(a[i] == reverse){
                f = 1;
                System.out.println(f);
            }
            else {
                f = 0;
                System.out.println(f);
            }
//            System.out.println(f);
        }
        return f;
    }
    public static void main(String[] args) {
        int a [] ={111, 21, 339, 444, 555};
        int p = palinArray(a,5);
        System.out.println(p);
    }
}

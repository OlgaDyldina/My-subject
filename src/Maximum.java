public class Maximum {
    public void max(int a, int b, int c, int d) {
        // write your code here

    }
        public static void main (String[] args){
            int a = 4;
            int b = 9;
            int c = 1;
            int d = 20;
            int max = 0;
            if (a > b && a > c && a > d) {
                max = a;
            } else if (b > a && b > c && b > d) {
                max = b;
            } else if (c > a && c > b && c > d) {
                max = c;
            } else {
                max = d;
            }
            System.out.println(max);
        }

}

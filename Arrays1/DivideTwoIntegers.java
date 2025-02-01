public class DivideTwoIntegers {
    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = -1;
        System.out.println(divide(dividend, divisor));
    }

    public static int divide(int dividend, int divisor) {
//        long lDividend = (long)dividend;
//        long lDivisor = (long)divisor;
//        return lDividend/lDivisor;


        if (divisor == -1 && dividend == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return dividend / divisor;
        }
    }
//        return (divisor == -1) ? -dividend : dividend/divisor;
//         int intVal = 0;
//         if(divisor == -1) {
//             intVal = (dividend*-1);
//         } else{
//             intVal=    dividend/divisor;
//            }
//         return Math.abs(intVal);
}

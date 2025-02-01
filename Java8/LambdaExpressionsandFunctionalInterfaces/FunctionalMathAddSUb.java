package Java8.LambdaExpressionsandFunctionalInterfaces;

interface MathOperation{
    int operation(int a , int b);
}
public class FunctionalMathAddSUb {
    public static void main(String[] args) {
        MathOperation add = (a,b) -> a+b;

        System.out.println(add.operation(5,3));
    }
}

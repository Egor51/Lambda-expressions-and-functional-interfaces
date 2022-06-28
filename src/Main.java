import java.util.function.*;

class Calculator{
            static Supplier<Calculator> instance = Calculator::new;

            BinaryOperator<Integer> plus = (x, y) -> x + y;
            BinaryOperator<Integer> minus = (x, y) -> x - y;
            BinaryOperator<Integer> multiply = (x, y) -> x * y;


            BinaryOperator<Integer> devide = (x, y) -> x > 0 && y > 0 ? x / y : 0;

        //  BinaryOperator<Integer> devide = (x, y) -> {
        //            if( x > 0 && y > 0){
        //                 return x / y;
        //            } else {
        //                 return 0;
        //            }
        //  };
        // На ноль делить нельзя!

            UnaryOperator<Integer> pow = x -> x * x;
            UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

            Consumer<Integer> println = System.out::println;
            Predicate<Integer> isPositive = x -> x > 0;

        }

        public class Main {

            public static void main(String[] args) {
                Calculator calc = Calculator.instance.get();

                int a = calc.plus.apply(1, 2);
                int b = calc.minus.apply(1,1);
                int c = calc.devide.apply(a, b);

                calc.println.accept(c);
            }
        }

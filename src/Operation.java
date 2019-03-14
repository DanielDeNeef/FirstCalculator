import java.security.InvalidAlgorithmParameterException;

public interface Operation {

    Expression perform(Expression left,Expression right);

    public class Addition implements Operation{
        @Override
        public Expression perform(Expression left, Expression right) {

            return new Literal(left.getValue()+right.getValue());
        }
    }

    public class Substraction implements Operation{
        @Override
        public Expression perform(Expression left, Expression right) {

            return new Literal(left.getValue()-right.getValue());
        }
    }

    public class Division implements Operation{
        @Override
        public Expression perform(Expression left, Expression right) {

            try {
                return new Literal(left.getValue() / right.getValue());

            }catch (ArithmeticException ae){
                System.out.println("Error division by zero is not allowed");
                return null;
            }
        }
    }

    public class Multiplication implements Operation{
        @Override
        public Expression perform(Expression left, Expression right) {
            return new Literal(left.getValue()*right.getValue());
        }
    }

}

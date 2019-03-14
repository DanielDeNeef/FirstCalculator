public class MainApp {
    public static void main(String[] args) {

        CompoundExpression cal = new CompoundExpression(new Literal(10),new Literal(0),new Operation.Division());
        System.out.println(cal.getValue());

    }
}

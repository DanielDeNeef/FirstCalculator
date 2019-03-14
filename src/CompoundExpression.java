public class CompoundExpression extends Expression{
    private Expression left;
    private Expression right;
    private Operation op;

    public CompoundExpression(Expression left, Expression right, Operation op) {
        this.left = left;
        this.right = right;
        this.op = op;
    }

    @Override
    int getValue() {
        int result;
        try {
            result = op.perform(new Literal(left.getValue()), new Literal(right.getValue())).getValue();
        }catch (NullPointerException npe){
            return 0;
        }
        return result;
    }
}

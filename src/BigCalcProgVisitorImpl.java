/**
 * @author Jonas Demski
 * @id 11739260
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class BigCalcProgVisitorImpl extends BigCalcProgBaseVisitor<BigDecimal> {

    Map<String ,BigDecimal> vars=new HashMap<>();

    @Override
    public BigDecimal visitExpressionStatement(BigCalcProgParser.ExpressionStatementContext ctx) {
        BigDecimal res=BigDecimal.ZERO;
        for(var stmt:ctx.statement()){
            System.out.println("Statement: "+stmt.getText());
            res=visit(stmt);
            System.out.println("\tTemp res: "+res.toString());
        }
        return res;//Return last value
    }

    @Override
    public BigDecimal visitMulDiv(BigCalcProgParser.MulDivContext ctx) {
        final BigDecimal left = visit(ctx.expression(0));
        final BigDecimal right = visit(ctx.expression(1));
        if (ctx.op.getText().equals("*")) {
            return left.multiply(right);
        } else {
            return left.divide(right, 10, RoundingMode.HALF_UP);
        }
    }

    @Override
    public BigDecimal visitAddSub(BigCalcProgParser.AddSubContext ctx) {
        final BigDecimal left = visit(ctx.expression(0));
        final BigDecimal right = visit(ctx.expression(1));
        if (ctx.op.getText().equals("+")) {
            return left.add(right);
        } else {
            return left.subtract(right);
        }
    }

    @Override
    public BigDecimal visitNum(BigCalcProgParser.NumContext ctx) {
        return new BigDecimal(ctx.Number().getText());
    }

    @Override
    public BigDecimal visitIdent(BigCalcProgParser.IdentContext ctx){
        String key=ctx.Identifier().getText();
        if(vars.containsKey(key))
            return vars.get(key);
        return BigDecimal.ZERO;
    }

    @Override
    public BigDecimal visitExpres(BigCalcProgParser.ExpresContext ctx){
        return visit(ctx.expression());
    }

    @Override
    public BigDecimal visitAssign(BigCalcProgParser.AssignContext ctx){
        return visit(ctx.assignment());
    }

    @Override
    public BigDecimal visitAssignment(BigCalcProgParser.AssignmentContext ctx) {
        String key=ctx.Identifier().getText();
        BigDecimal value=visit(ctx.expression());
        vars.put(key,value);
        return value;
    }

}


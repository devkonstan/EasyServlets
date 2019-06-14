package CalcWithLambdas;

import java.util.stream.Stream;

public enum MathOperation {

    ADD("+", (float v1, float v2)-> v1+v2),
    SUB("-", (float v1, float v2)-> v1-v2),
    MULTI("*", (float v1, float v2)-> v1 * v2),
    DIV("/", (float v1, float v2)-> v1 / v2),

    NOT_SUPPORTED("", (float v1, float v2)-> Float.MIN_VALUE);

    private String operation;
    private MathFunction function;

    MathOperation(String operation, MathFunction function) {
        this.operation = operation;
        this.function = function;
    }

    public static MathOperation getMathOperation(String operation) {
        return Stream.of(values())
                .filter((MathOperation mathOperation) ->{
                    return mathOperation.operation.equals(operation);
                })
                .findAny().orElse(NOT_SUPPORTED);

//        for (MathOperation mathOperation : values()) {
//            if (mathOperation.operation.equals(operation)){
//                return mathOperation;
//            }
//        }
//        return NOT_SUPPORTED;
    }

    public float doFunction(float v1, float v2) {
        return function.calculate(v1, v2);
    }
}
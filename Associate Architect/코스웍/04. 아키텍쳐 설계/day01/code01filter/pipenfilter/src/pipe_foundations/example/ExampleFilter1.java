package pipe_foundations.example;

import pipe_foundations.Pipe;
import pipe_foundations.SimpleFilter;

public class ExampleFilter1 extends SimpleFilter<Integer, String> {
    public ExampleFilter1(Pipe<Integer> input, Pipe<String> output) {
        super(input, output);
    }

    @Override
    protected String transformOne(Integer in) {
        String out = Integer.toString(in);
        System.out.println("filtered " + Integer.toString(in) + " to " + out);
        delayForDebug(100);
        return out;
    }
}

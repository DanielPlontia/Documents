package pipe_foundations.example;

import pipe_foundations.Pipe;
import pipe_foundations.SimpleFilter;

public class ExampleFilter2 extends SimpleFilter<Integer, Integer> {
    public ExampleFilter2(Pipe<Integer> input, Pipe<Integer> output) {
        super(input, output);
    }

    @Override
    protected Integer transformOne(Integer in) {
        Integer out = in * 10;
        System.out.println("filtered " + in + " to " + out);
        delayForDebug(100);
        return out;
    }
}

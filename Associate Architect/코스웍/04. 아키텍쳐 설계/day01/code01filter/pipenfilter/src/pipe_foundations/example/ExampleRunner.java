package pipe_foundations.example;

import pipe_foundations.*;

public class ExampleRunner {
    public static void main(String[] args) {
        // create pipes
        final Pipe<Integer> genToFilter2 = new PipeImpl<Integer>();
        final Pipe<Integer> Filter2ToFilter1 = new PipeImpl<Integer>();
        final Pipe<String> filter1ToOut = new PipeImpl<String>();

        // create components that use the pipes
        final Generator<Integer> generator = new ExampleGenerator(genToFilter2);
        final Filter<Integer, Integer> filter2 = new ExampleFilter2(genToFilter2, Filter2ToFilter1);
        final Filter<Integer, String> filter1 = new ExampleFilter1(Filter2ToFilter1, filter1ToOut);
        final Sink<String> sink = new ExampleSink(filter1ToOut);

        // start all components
        generator.start();
        filter1.start();
        filter2.start();
        sink.start();

        System.out.println("runner finished");
    }
}

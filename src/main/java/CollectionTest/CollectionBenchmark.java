package CollectionTest;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@Warmup(iterations = 2)
@Measurement(iterations = 3)
public class CollectionBenchmark {


    private static final int SIZE = 1000;

    private List<Integer> linkedList;
    private List<Integer> arrayList;

    private Integer intToFind;
    private Integer extraElement;

    @Setup
    public void setCollections() {
        linkedList = new LinkedList<>();
        arrayList = new ArrayList<>();

        for (int i = 0; i < SIZE; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }
        intToFind = new Random().nextInt(SIZE);
        extraElement = new Random().nextInt(SIZE);

    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testFindElementAddAtArrayList(Blackhole blackhole) {
        blackhole.consume(arrayList.contains(intToFind));
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testFindElementAtLinkedList(Blackhole blackhole) {
        blackhole.consume(linkedList.contains(intToFind));
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testAddElementAtArrayList(CollectionBenchmark state) {
//        blackhole.consume(arrayList.add(0, extraElement));
        state.arrayList.add(0, extraElement);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testAddElementAtLinkedList(CollectionBenchmark state) {
//        blackhole.consume(arrayList.add(0, extraElement));
        state.linkedList.add(0, extraElement);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testDeleteElementAtArrayList(CollectionBenchmark state) {
        state.arrayList.remove(SIZE - 1);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testDeleteElementAtLinkedList(CollectionBenchmark state) {
        state.linkedList.remove(SIZE - 1);
    }
}

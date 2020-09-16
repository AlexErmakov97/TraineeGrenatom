package CollectionTest;


import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
    public class CollectionFinderBenchmarkTest {
        private static final int SET_SIZE = 10000;

        private Set<String> hashSet;
        private Set<String> treeSet;

        private String stringToFind;

        @Setup
        public void setupCollections() {
            hashSet = new HashSet<>(SET_SIZE);
            treeSet = new TreeSet<>();

            for (int i = 0; i < SET_SIZE; i++) {
                final String value = String.valueOf(i);
                hashSet.add(value);
                treeSet.add(value);
            }

            stringToFind = String.valueOf(new Random().nextInt(SET_SIZE));
        }

        @Benchmark
        @BenchmarkMode(Mode.AverageTime)
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        public void testHashSet(Blackhole blackhole) {
            blackhole.consume(hashSet.contains(stringToFind));
        }

        @Benchmark
        @BenchmarkMode(Mode.AverageTime)
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        public void testTreeSet(Blackhole blackhole) {
            blackhole.consume(treeSet.contains(stringToFind));
        }
    }


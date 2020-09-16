package CollectionTest;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Fork(value = 2, warmups = 1)
public class ArrayListBenchmark {
    @State(Scope.Thread)
    public static class MyState {

        List<Employee> employeeArrayList = new ArrayList<>();

        long iterations = 100000;

        Employee employee = new Employee(100L, "Harry");

        int employeeIndex = -1;

        @Setup(Level.Trial)
        public void setUp() {
            for (long i = 0; i < iterations; i++) {
                employeeArrayList.add(new Employee(i, "John"));
            }

            employeeArrayList.add(employee);
            employeeIndex = employeeArrayList.indexOf(employee);
        }
    }

    @Benchmark
    public void testAddArray(MyState state) {
        state.employeeArrayList.add(new Employee(state.iterations + 1, "John"));
    }

    @Benchmark
    public void testAddAtArray(MyState state) {
        state.employeeArrayList.set((int) (state.iterations), new Employee(state.iterations, "John"));
    }

    @Benchmark
    public boolean testContainsArray(MyState state) {
        return state.employeeArrayList.contains(state.employee);
    }

    @Benchmark
    public int testIndexOfArray(MyState state) {
        return state.employeeArrayList.indexOf(state.employee);
    }

    @Benchmark
    public Employee testGetArray(MyState state) {
        return state.employeeArrayList.get(state.employeeIndex);
    }

    @Benchmark
    public boolean testRemoveArray(MyState state) {
        return state.employeeArrayList.remove(state.employee);
    }
}

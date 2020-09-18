package CollectionTest;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.HashMap;

public class MainCollection {
    public static void main(String[] args) throws Exception {
        HashMap <Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"SAS");
        hashMap.put(3,"DAS");
        hashMap.put(4,"PAR");
        hashMap.put(30,"DER");
        System.out.println(hashMap.toString());
        System.out.println(TestHashMap.changeKeyToValue(hashMap).toString());

//        org.openjdk.jmh.Main.main(args);

//        final Options options = new OptionsBuilder()
//                .include(CollectionFinderBenchmarkTest.class.getSimpleName())
//                .forks(1)
//                .build();
//        new Runner(options).run();

//        final Options options = new OptionsBuilder()
//                .include(CollectionBenchmark.class.getSimpleName())
//                .forks(1)
//                .build();
//        new Runner(options).run();

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//        SpeedOfCollections speedOfCollections = new SpeedOfCollections(arrayList);
//        SpeedOfCollections speedOfCollections1 = new SpeedOfCollections(linkedList);
//
//        System.out.println("timeAddOperation array " + speedOfCollections.timeAddOperation());
//        System.out.println("timeAddOperation list " + speedOfCollections1.timeAddOperation());
//        System.out.println("timeAddOperation array " + speedOfCollections.timeAddAtOperation());
//        System.out.println("timeAddOperation list " + speedOfCollections1.timeAddAtOperation());
//        System.out.println("timeGetOperation array " + speedOfCollections.timeGetOperation());
//        System.out.println("timeGetOperation list " + speedOfCollections1.timeGetOperation());

    }
}

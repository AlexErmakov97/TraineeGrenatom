package CollectionTest;

import java.util.Date;
import java.util.List;

public class SpeedOfCollections {
    List collection;

    public SpeedOfCollections(List collection) {
        this.collection = collection;
    }

    public long timeAddOperation(){
        Date startLinked = new Date();
        long linkedTime;
        for(int i = 0; i < 1000000; i++) {
            //операция .add .insert. remove. get .set с начала середины, и конца списка
            //k - кол-во операций
            collection.add(i);
        }
        Date finishLinked = new Date();
        linkedTime = finishLinked.getTime() - startLinked.getTime();
        return linkedTime;
    }

    public long timeAddAtOperation(){
        Date startLinked = new Date();
        long linkedTime;
        collection.add(0, 111);
        Date finishLinked = new Date();
        linkedTime = finishLinked.getTime() - startLinked.getTime();
        return linkedTime;
    }

    public long timeGetOperation(){
        Date startLinked = new Date();
        long linkedTime;
        collection.get(50000);
        Date finishLinked = new Date();
        linkedTime = finishLinked.getTime() - startLinked.getTime();
        return linkedTime;

    }

}

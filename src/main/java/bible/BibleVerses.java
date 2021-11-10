package bible;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BibleVerses {
    private List<String> verses = null;

    public BibleVerses() {
        this.verses = Arrays.asList("Jezis kristus ke to s nami", "Jesis je doma.");
    }

    public String getVers(){
        Random random= new Random();
        int i = random.nextInt(verses.size());
        return verses.get(i);

    }

}

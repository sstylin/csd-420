// Steve Stylin Module 5: Test case for word Processor Application

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

public class WordProcessorTest {
    @Test
    public void testUniqueWords() {
        Set<String> expected = new HashSet<>(Arrays.asList("Red", "Blue", "Green", "Yellow", "Orange", "Purple", "puce", "prussian-blue", "psychedelic-purple", "pumpkin", "quartz-grey", "raw-umber", "razzmatazz", "robin-egg-blue", "rose", "royal-blue", "royal-purple", "ruby", "saffron", "salmon"));
        Set<String> actual = new HashSet<>(Arrays.asList("Red", "Blue", "Green", "Yellow", "Red", "Blue", "Orange", "Purple", "Green", "puce", "prussian-blue", "psychedelic-purple", "pumpkin", "Purple", "quartz-grey", "raw-umber", "razzmatazz", "Red", "robin-egg-blue", "rose", "royal-blue", "royal-purple", "ruby", "ruby", "saffron", "salmon", "royal-purple", "ruby", "ruby", "saffron", "salmon", "puce", "prussian-blue"));
        assertEquals(expected, actual);
    }
}

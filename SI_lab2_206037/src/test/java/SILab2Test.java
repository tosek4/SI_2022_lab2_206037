import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SILab2Test {
    @Test
    void everyStatementTest(){
        //Nodes: 7,8,40
        RuntimeException ex1 = assertThrows(RuntimeException.class, () -> SILab2.function(new ArrayList<>()));
        assertEquals("List length should be greater than 0", ex1.getMessage());
        //Nodes: 7,10,11,12,13,40
        RuntimeException ex2 = assertThrows(RuntimeException.class, () -> SILab2.function(Arrays.asList("0","#","0","#", "0")));
        assertEquals("List length should be a perfect square", ex2.getMessage());
        //Nodes: 7,10,11,12,15,16,17,18,19,20,25,26,27,28,29,30,33,32,34,37,40
        List<String> result1  = SILab2.function(Arrays.asList("0", "#", "0", "0", "0", "#", "0", "0", "0"));
        assertEquals("1", result1.get(0));
        assertEquals("2", result1.get(2));
        assertEquals(Arrays.asList("1","#", "2", "0", "2", "#", "0", "0", "1"), result1);
        //Nodes: all
        List<String> result2  = SILab2.function(Arrays.asList("0", "#", "0", "#", "0", "#", "0", "0", "0"));
        assertEquals("3", result2.get(4));
    }

    @Test
    void everyBranchTest(){
        //Nodes: 7,8,40
        RuntimeException ex1 = assertThrows(RuntimeException.class, () -> SILab2.function(new ArrayList<>()));
        assertEquals("List length should be greater than 0", ex1.getMessage());
        //Nodes: 7,10,11,12,13,40
        RuntimeException ex2 = assertThrows(RuntimeException.class, () -> SILab2.function(Arrays.asList("0","#","0","#", "0")));
        assertEquals("List length should be a perfect square", ex2.getMessage());
        //Nodes: 7,10,11,12,15,16,17,18,19,20,25,26,27,28,29,30,33,32,34,37,40
        List<String> result1  = SILab2.function(Arrays.asList("0", "#", "0", "0", "0", "#", "0", "0", "0"));
        assertEquals("1", result1.get(0));
        assertEquals("2", result1.get(2));
        assertEquals(Arrays.asList("1","#", "2", "0", "2", "#", "0", "0", "1"), result1);
        //Nodes: all
        List<String> result2  = SILab2.function(Arrays.asList("0", "#", "0", "#", "0", "#", "0", "0", "0"));
        assertEquals("3", result2.get(4));
    }
}

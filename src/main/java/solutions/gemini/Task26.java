package solutions.gemini;

import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Task26 {
    /**
    From a list of integers, remove all elements that occur more than once.
    Keep order of elements left the same as in the input.
    >>> removeDuplicates(Array.asList(1, 2, 3, 2, 4))
    [1, 3, 4]
     */
    public List<Integer> removeDuplicates(List<Integer> numbers) {
Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> result = new ArrayList<>();
        for (Integer num : numbers) {
            if (frequencyMap.get(num) == 1) {
                result.add(num);
            }
        }
        return result;
    }
}

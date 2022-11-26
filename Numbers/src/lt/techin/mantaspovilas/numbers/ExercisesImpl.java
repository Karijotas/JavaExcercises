package lt.techin.mantaspovilas.numbers;

import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;


public class ExercisesImpl implements Exercises {

    ArrayList<Integer> numbers = new ArrayList<>();

    @Override
    public Integer findSmallest(List<Integer> list) {
        return list.stream().mapToInt(v -> v).min().orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Integer findLargest(List<Integer> list) {
        return list.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
    }

    @Override
    public boolean isEqual(Object o, Object o1) {
        return o.equals(o1);
    }

    @Override
    public boolean isSameObject(Object o, Object o1) {
        return (o.equals(o1) && o.hashCode() == o1.hashCode());
    }

    @Override
    public List<Integer> consume(Iterator<Integer> iterator) {
        ArrayList<Integer> consumed = new ArrayList<>();
        iterator.forEachRemaining(consumed::add);
        return consumed;
    }

    @Override
    public int computeSumOfNumbers(int i) {
        return NumberGenerator.getNext(i);
    }

    @Override
    public int computeSumOfNumbers(int i, NumberFilter numberFilter) {
        return NumberGenerator.getNext(i, numberFilter);
    }

    @Override
    public List<Integer> computeNumbersUpTo(int i) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int j = 1; j < i; j++ ){
            newList.add(j);
        }
        return newList;
    }

    @Override
    public Map<Integer, Integer> countOccurrences(List<Integer> list) {
        return null;
    }

    @Override
    public IntegerGenerator createIntegerGenerator(int i, int i1) {
        return new NumberGenerator(i, i1);
    }

    @Override
    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        return new NumberGenerator(1, 100);
    }
}

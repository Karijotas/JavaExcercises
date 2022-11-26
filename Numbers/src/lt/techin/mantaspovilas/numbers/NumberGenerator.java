package lt.techin.mantaspovilas.numbers;

import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

public class NumberGenerator implements IntegerGenerator {
    private int size;
    private int i = 1;
    private int from;
    private int to;
    private NumberFilter filter;



    public NumberGenerator(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Integer getNext() {
        while (i < to) {
            return i++;
        }
      return null;
    }

    public static Integer getNext(int to) {
        int i = 0;
        while (i <= to) {
            return i++;
        }
        return null;
    }

    public static Integer getNext(int to, NumberFilter filter) {
        int i = 0;
        while (i <= to) {
            if (true){
                return i++;
            }

        }
        return null;
    }
}

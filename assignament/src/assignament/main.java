package assignament;


public class main {
    public static void main(String[] args){
        int[] array = {5, 2, 9, 1, 5};

        sortContext context = new sortContext();

        // Use Bubble Sort strategy
        context.setSortingStrategy(new bubbleSort());
        context.performSort(array);

        // Use Quick Sort strategy
        context.setSortingStrategy(new quickSort());
        context.performSort(array);
    }
}

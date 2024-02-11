package assignament;


public class sortContext {
    private sortingStrategy sortingStrategy;

    public void setSortingStrategy(sortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] array) {
        sortingStrategy.sort(array);
    }
}

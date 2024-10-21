public class MySorts {

    // Public method that starts the quicksort process
    public static void quicksort(IList<Integer> list) {
        if (list != null && list.size() > 1) {
            quicksortHelper(list, 0, list.size() - 1);
        }
    }

    // Recursive helper method that performs the sorting
    private static void quicksortHelper(IList<Integer> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quicksortHelper(list, low, pivotIndex - 1);
            quicksortHelper(list, pivotIndex + 1, high);
        }
    }

    // Method to determine the pivot and partition the array around it
    private static int partition(IList<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (list.get(j) <= pivot) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, high);
        return i + 1;
    }

    // Method to swap two elements in the list
    private static void swap(IList<Integer> list, int i, int j) {
        Integer temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

}

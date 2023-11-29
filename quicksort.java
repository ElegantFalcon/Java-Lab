public class quicksort {

    public static void main(String[] args) {
        String[] names = {"niks", "sheez", "nandu", "roshin", "deepak"};
        
        System.out.println("Before sorting:");
        printArray(names);
        
        quickSort(names, 0, names.length - 1);
        
        System.out.println("After sorting:");
        printArray(names);
    }
    
    public static void quickSort(String[] names, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(names, low, high);
            
            quickSort(names, low, pivotIndex - 1);
            quickSort(names, pivotIndex + 1, high);
        }
    }
    
    public static int partition(String[] names, int low, int high) {
        String pivot = names[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (names[j].compareTo(pivot) < 0) {
                i++;
                swap(names, i, j);
            }
        }
        
        swap(names, i + 1, high);
        
        return i + 1;
    }
    
    public static void swap(String[] names, int i, int j) {
        String temp = names[i];
        names[i] = names[j];
        names[j] = temp;
    }
    
    public static void printArray(String[] names) {
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}


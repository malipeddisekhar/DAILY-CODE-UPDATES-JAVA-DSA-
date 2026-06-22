import java.util.*;

class Heap {

    ArrayList<Integer> heap;

    Heap() {
        heap = new ArrayList<>();
    }

    // Insert
    public void insert(int value) {

        heap.add(value);

        int current = heap.size() - 1;

        while (current > 0) {

            int parent = (current - 1) / 2;

            if (heap.get(current) > heap.get(parent)) {

                int temp = heap.get(current);
                heap.set(current, heap.get(parent));
                heap.set(parent, temp);

                current = parent;
            } else {
                break;
            }
        }
    }

    // Get Maximum
    public int getMax() {

        if (heap.size() == 0)
            return -1;

        return heap.get(0);
    }

    // Delete Maximum
    public int deleteMax() {

        if (heap.size() == 0)
            return -1;

        int max = heap.get(0);

        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        heapifyDown(0);

        return max;
    }

    private void heapifyDown(int index) {

        int size = heap.size();

        while (true) {

            int left = 2 * index + 1;
            int right = 2 * index + 2;

            int largest = index;

            if (left < size &&
                heap.get(left) > heap.get(largest))
                largest = left;

            if (right < size &&
                heap.get(right) > heap.get(largest))
                largest = right;

            if (largest == index)
                break;

            int temp = heap.get(index);
            heap.set(index, heap.get(largest));
            heap.set(largest, temp);

            index = largest;
        }
    }

    public void display() {
        System.out.println(heap);
    }
    public static void main(String[] args) {
        Heap heap = new Heap();

        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(15);

        System.out.println("Max: " + heap.getMax());

        System.out.println("Deleted Max: " + heap.deleteMax());

        System.out.println("Max after deletion: " + heap.getMax());

        heap.display();
    }
}
// Last updated: 8/13/2026, 3:46:52 PM
class KthLargest {
    int k;
    int[] heap;
    int size;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        heap = new int[k];
        size = 0;

        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (size < k) {
            heap[size] = val;
            size++;
            heapifyUp(size - 1);
        } 
        else if (val > heap[0]) {
            heap[0] = val;
            heapifyDown(0);
        }

        return heap[0];
    }

    private void heapifyUp(int current) {
        while (current > 0) {
            int parent = (current - 1) / 2;

            if (heap[current] < heap[parent]) {
                swap(current, parent);
                current = parent;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int i) {
        while (true) {
            int smallest = i;
            int l = 2 * i + 1;
            int r = 2 * i + 2;

            if (l < size && heap[l] < heap[smallest]) {
                smallest = l;
            }

            if (r < size && heap[r] < heap[smallest]) {
                smallest = r;
            }

            if (smallest == i) {
                break;
            }

            swap(i, smallest);
            i = smallest;
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
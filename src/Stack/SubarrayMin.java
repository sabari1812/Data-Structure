package Stack;

import java.util.ArrayList;
import java.util.Stack;

class SubarrayMin
{
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int n = arr.length;
        ArrayList<Integer> nse = findNse(arr);
        ArrayList<Integer> pse = findPse(arr);
        long total = 0;
        int mod = (int) (1e9 + 7);
        for (int i = 0; i < n; i++) {
            int left = i - pse.get(i); // Distance to the previous smaller element.
            int right = nse.get(i) - i; // Distance to the next smaller element.
            total = (total + (long) left * right * arr[i] % mod) % mod;
        }
        System.out.println(total);
    }
    static ArrayList<Integer> findNse(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> nse = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            nse.add(st.isEmpty() ? n : st.peek()); // If stack is empty, use n as default.
            st.push(i);
        }
        return nse;
    }
    static ArrayList<Integer> findPse(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> pse = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            pse.add(-1); // Initialize all elements to -1.
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                pse.set(st.pop(), i);
            }
            st.push(i);
        }
        return pse;
    }
}

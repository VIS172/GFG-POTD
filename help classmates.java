class Solution {
public static int[] help_classmate(int arr[], int n) 
{ 
    ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
 
        for (int i = n - 1; i >= 0; i--) {
            if (st.empty()) {
                list.add(-1);
            } else if (st.size() > 0 && st.peek() < arr[i]) {
                list.add(st.peek());
            } else if (st.size() > 0 && st.peek() >= arr[i]) {
                while (!st.empty() && st.peek() >= arr[i]) {
                    st.pop();
                }
                if (st.empty()) {
                    list.add(-1);
                } else {
                    list.add(st.peek());
                }
            }
            st.push(arr[i]);
        }
 
        Collections.reverse(list); // Reverse the list.
 
        // Convert ArrayList to an array.
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
 
        return result;
} 
}
class Solution{
    static int minValue(String s, int k){
        // code here
        int arr[] = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';
            arr[idx]++;
        }
        int j = arr.length;
        for(int i=0; i<k; i++){
            Arrays.sort(arr);
            if(k>0){
                arr[j-1]--;
            }
        }
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                sum += arr[i]*arr[i];
            }
        }
        return sum;
    }
}


class Solution
{
    
    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
        int[] to = new int[K];

        // from->to lexicographic pairs enumeration
        String prev = dict[0];
        for (int i=1; i<N; i++) {
            int l = Math.min(dict[i-1].length(), dict[i].length());
            for (int j=0; j<l; j++) {
                char chFrom = dict[i-1].charAt(j);
                char chTo = dict[i].charAt(j);
                if(chFrom != chTo) {
                    // add mark prev(from) so every element shows all froms 
                    to[chTo - 'a'] |= mask(chFrom) ;
                    break;
                }
            }
        }

        int todoMask = 0xFFFFFFFF; // all chars "not done" yet
        StringBuilder sb = new StringBuilder();
        boolean allDone = false;
        while (!allDone) {
            allDone = true;
            for (int i=0; i<K; i++) {
                int charMask =  mask((char)('a'+i));
                if ((todoMask&charMask) != 0) { // already done ?
                    if((to[i]&todoMask)==0) { // if no froms 
                        sb.append((char)('a'+i));
                        todoMask &= ~charMask; // set done for 
                    } else {
                        allDone = false;
                    }               
                }
            }
        }
        //System.out.printf(" out=%s ", sb);

        return sb.toString();
    }
    
    public int mask(char ch) {
        int k = ch - 'a';
        return 0x01 << k;
    }
    
}
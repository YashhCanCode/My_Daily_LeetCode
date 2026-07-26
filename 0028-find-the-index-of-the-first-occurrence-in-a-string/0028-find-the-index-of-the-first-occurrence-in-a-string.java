class Solution {
    public int strStr(String haystack, String needle) {
        int haystacklength = haystack.length();
        int needlelength = needle.length();
        if(needlelength == 0) return 0;
        for(int i=0;i<=haystacklength - needlelength;i++)
        {
            if(haystack.substring(i,i+needlelength).equals(needle))
            {
                return i;
            }
        }
        return -1;
    }
}
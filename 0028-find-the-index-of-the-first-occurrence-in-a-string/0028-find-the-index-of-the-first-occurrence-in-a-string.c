int strStr(char * haystack, char * needle){
    int n_haystack = strlen(haystack);
    int n_needle = strlen(needle);
    
    int i_haystack = 0;
    int i_needle = 0;
    int go_back = 0;
    while (i_haystack<n_haystack) {
        if (haystack[i_haystack] != needle[i_needle]) {
            i_needle = 0;
            if (go_back != -1) {
                i_haystack = go_back;
                go_back = -1;
            }
            i_haystack++;
            continue;
        }
        if (i_needle == 0)
            go_back = i_haystack;
            
        if (i_needle== (n_needle-1))
            return i_haystack - (i_needle);
        i_needle++;
        i_haystack++;
    }
    return -1;
}
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        
        String returnedString = "";
        
        for (int i=0; i<numRows; i++) {
            int currentIndex = i;
            if (currentIndex==0 || currentIndex==(numRows-1)) {
                while (currentIndex < s.length()) {
                    returnedString += s.charAt(currentIndex);
                    currentIndex += (2 * (numRows - 1));
                }
            } else {
                while (currentIndex < s.length()) {
                    returnedString += s.charAt(currentIndex);
                    
                    currentIndex += (2* (numRows - 1) - (2 * i));
                    
                    if (currentIndex < s.length()) {
                        returnedString += s.charAt(currentIndex);
                    }
                    
                    currentIndex += (2 * i);
                }        
            }
        }
        return returnedString;
    }
}
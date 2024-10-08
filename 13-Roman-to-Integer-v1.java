class Solution {
    public int romanToInt(String s) {
        int num = 0 , prev=0, total =0, i = (s.length()-1);

        while(i>=0){
            switch(s.charAt(i)){
                case 'I': 
                    num = 1;
                    break;
                case 'V': 
                    num = 5;
                    break;
                case 'X': 
                    num = 10;
                    break;
                case 'L': 
                    num = 50;
                    break;
                case 'C': 
                    num = 100;
                    break;
                case 'D': 
                    num = 500;
                    break;
                case 'M': 
                    num = 1000;
                    break;
            }

            if(num < prev){
                total -=num;
            }
            else{
                total +=num;
            }

            prev=num;
            i--;
        }return total;
    }
}

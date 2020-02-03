class Solution {
  public String solution(int a, int b) {
      String answer = "";
      int result = 0;
      if(a==1)
          result = b%7;
      else if(a==2)
          result = (31+b)%7;
      else if(a<=7)
      {
          result = (60 + 30*(a-3) + (int)((a-2)/2 *1) + b )%7; 
      }
      else{
          result = (31*4 + 30 * 2 + 29 + (a-8)*30 + (int)((a-7)/2*1) + b )%7; 
      }

      String [] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
      answer = day[result];

      return answer;
  }
}

class Solution {
    public int dayOfYear(String date) {
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        String[] given=date.split("-");
        int tdays=0;
        int year=Integer.parseInt(given[0]);
        if(year%400==0||( year%4==0 && year % 100 != 0))
        {
            days[1]=days[1]+1;
        }
        
        for(int i=0;i<Integer.parseInt(given[1])-1;i++)
        {
           
                tdays+=days[i];

        }
        
        return tdays+=Integer.parseInt(given[2]);
    }
}
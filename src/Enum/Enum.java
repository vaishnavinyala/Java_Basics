package Enum;
class week{
   enum Day{
       SUNDAY, MONDAY, TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
   }
   public static void main(String[] args) {
       Day varDar=Day.FRIDAY;
       System.out.println("Today is "+varDar);
       for(Day d:Day.values())
       {
           if(d.toString()=="TUESDAY")
           {
               System.out.println("Today is "+d);
           }

       }
   }
}




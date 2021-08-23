public class Hello{

    public static void main(String []args){
      String value="yyeeyye";
       int length = value.length();
       int len= length/2;
       String value1;
       String value2;
       if(length%2 == 0)
       {
           value1 = value.substring(0,len);
           value2 = value.substring(len,length);
       }
       else
       {
           value1 = value.substring(0,len);
           value2 = value.substring(len+1,length); 
       }
       for(int i=0;i<len;i++)
       {
           if(value1.equals(value2))
           {
               break;
           }
           else
           {
                 value1 = value.substring(0,len-(i+1));
           if(length%2 ==0)
           {
               value2 = value.substring(len+(i+1),length); 
           }
           else
           {
                value2 = value.substring(len+1+(i+1),length);
           }
          
           }
           
       }
       System.out.println(value1);
    }
}
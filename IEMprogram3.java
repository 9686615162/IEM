public class IEMprogram3 {
        static int fSum(String str){
           String t = "0";
           int sum = 0;
           for (int i = 0; i < str.length(); i++) {
               char c = str.charAt(i);
               if (Character.isDigit(c))
                   t += c;
               else {
                   sum += Integer.parseInt(t);
                   t= "0";
               }
           }
           return sum + Integer.parseInt(t);
       }
       public static void main(String[] args)
       {
           String str = "Ga4u3";
           System.out.println(fSum(str));
           
       }
}

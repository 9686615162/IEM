public class HelloWorld{
         public static void main(String []args){
         String str="abcXXXabc";
         char[] x=str.toCharArray();
         int c=str.length();
         int count=0;
         for(int i=0;i<c-2;i++)
         {
         if(x[i]==x[i+1]&&x[i]==x[i+2]){
           count++;
         }
         }
         System.out.println(count);
    } 
}

import java.util.regex.*; 

public class Finding {   
    public static void main(String[] args) {     
        int j=0;
        Matcher m = Pattern.compile("\\w+")       
          .matcher(         
            "Evening is full of the linnet's wings");     
        while(m.find())       
            System.out.print(m.group() + " ---- "+j++);   
        System.out.println();     
        int i = 0;     
        while(m.find(i)) {       
            System.out.print(m.group() + " ===="+j++);       
            i++;     
        }   
    }
}
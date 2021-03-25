import java.util.ArrayList;
import java.util.List;

/**
 * Fan
 */
public class Fan {

    public static void main(String[] args) {
        InnerApp[] fsf=new InnerApp[6];
        System.out.println(fsf.length);
        InnerFan<String> ifs=new InnerFan<>();
        ifs.set("");
        System.out.println();
    }
}

/**
 * InnerFan
 */
class InnerFan<T> {
    
    private T a;
    InnerFan(){
        
    }
    public void set(T a) { this.a = a; System.out.println(a.getClass());}
    public T get() { 
        return a; }
}


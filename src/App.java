public class App {
    
    public static void main(String[] args) throws Exception {
        // InnerApp foo = new InnerApp();
        InnerApp.ss();
        System.out.println("Hello, World!");
        // InnerApp df=new
    }
}

/**
 * InnerApp
 */
class InnerApp {
    private int d;
    static{
        System.out.println("static");
        new InnerApp();
    }
    static void ss(){
        System.out.println("ss");
    }
    InnerApp(){
        System.out.println("initial");
    }
    /**
     * 
     * @return
     */
    public int getD() {
        return d;
    }
    /**
     * 
     * @param d
     */
    public void setD(int d) {
        this.d = d;
    }
}
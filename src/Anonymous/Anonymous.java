package Anonymous;

interface hello {
    void  sayHello();
}
public class Anonymous{
    public static void main(String[] args) {
        hello h=new hello(){
            public void sayHello(){
                System.out.println(" sayHello");
            }
        };
        h.sayHello();
    }
}

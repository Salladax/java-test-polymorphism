public class Class2 extends Class1{

    public Class2() {
        super();
        System.out.println(2);
    }

    public void hello() {
        System.out.println("Sou a classe 2");
    }  
    
    public void bye() {
        super.bye();
        System.out.print(2);
    }
}

public class Class3 extends Class2{

    public Class3() {
        super();
        System.out.println(3);
    }

    public void hello() {
        System.out.println("Sou a classe 3");
    }  

    public void bye() {
        super.bye();
        System.out.print(3);
    } 
}

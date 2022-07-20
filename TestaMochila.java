public class TestaMochila {
    public static void main(String[] args) {
        Caderno c1 = new Caderno(20,300,8,30.5);
        Estojo e1 = new Estojo(100,8,100);
        Mochila m1 = new Mochila(c1, e1, 300);
        
        System.out.println(m1);
}
}
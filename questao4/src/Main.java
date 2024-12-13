public class Main {
    public static void main(String[] args) {
        //criando objetos das classes concretas
        C2 objC2 = new C2("Atributo de C2");
        C3 objC3 = new C3("Atributo de C3");
        C4 objC4 = new C4("Atributo de C4");
        C5 objC5 = new C5("Atributo de C5");

        System.out.println("--- Testando C2 ---");
        objC2.metodoAbstratoC1();
        objC2.metodoConcretoC1();
        objC2.metodoSobrecarga("Mensagem para C2");

        System.out.println("\n--- Testando C3 ---");
        objC3.metodoAbstratoC1();
        objC3.metodoConcretoC1();
        objC3.metodoI1();
        objC3.metodoI2A();
        objC3.metodoI2B();

        System.out.println("\n--- Testando C4 ---");
        objC4.metodoAbstratoC1();
        objC4.metodoConcretoC1();

        System.out.println("\n--- Testando C5 ---");
        objC5.metodoAbstratoC1();
        objC5.metodoConcretoC1();
        objC5.metodoI1();
    }
}
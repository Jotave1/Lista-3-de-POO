class C4 extends C2 {
    public C4(String atributoC1) {
        super(atributoC1);
    }

    @Override
    public void metodoAbstratoC1() {
        System.out.println("Método sobrescrito em C4: " + atributoC1);
    }
}

// Classe concreta C5
class C5 extends C2 implements I1 {
    public C5(String atributoC1) {
        super(atributoC1);
    }

    @Override
    public void metodoI1() {
        System.out.println("Método da interface I1 implementado em C5");
    }

    @Override
    public void metodoAbstratoC1() {
        System.out.println("Método sobrescrito em C5: " + atributoC1);
    }
}
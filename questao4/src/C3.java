class C3 extends C1 implements I1, I2 {
    public C3(String atributoC1) {
        super(atributoC1);
    }

    @Override
    public void metodoAbstratoC1() {
        System.out.println("Método abstrato implementado em C3: " + atributoC1);
    }

    @Override
    public void metodoI1() {
        System.out.println("Método da interface I1 implementado em C3");
    }

    @Override
    public void metodoI2A() {
        System.out.println("Método I2A da interface I2 implementado em C3");
    }

    @Override
    public void metodoI2B() {
        System.out.println("Método I2B da interface I2 implementado em C3");
    }
}
class C2 extends C1 {
    public C2(String atributoC1) {
        super(atributoC1);
    }

    @Override
    public void metodoAbstratoC1() {
        System.out.println("Método abstrato implementado em C2: " + atributoC1);
    }

    // Sobrecarga de método
    public void metodoSobrecarga(String mensagem) {
        System.out.println("Sobrecarga em C2: " + mensagem);
    }
}

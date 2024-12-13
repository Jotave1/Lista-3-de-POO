import java.util.*;

class Dado {
    private Random random;

    public Dado() {
        this.random = new Random();
    }

    public int lancar() {
        return random.nextInt(6) + 1; // Gera números entre 1 e 6
    }
}
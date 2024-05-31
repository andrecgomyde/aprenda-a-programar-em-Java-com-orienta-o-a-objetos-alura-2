package animal;

public class PrincipalAnimal {
    public static void main(String[] args) {
        Animal meuAnimal;

        meuAnimal = new Cachorro();
        meuAnimal.emitirSom();
        if (meuAnimal instanceof Cachorro) {
            ((Cachorro) meuAnimal).abanarRabo();
        }

        meuAnimal = new Gato();
        meuAnimal.emitirSom();
        if (meuAnimal instanceof Gato) {
            ((Gato) meuAnimal).arranharMoveis();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Figurinha figurinha = new Figurinha("Agüero", "Atacante", "Argentina",2,"Junho",1988, 1.73F, 70F);
        FigurinhaExtra figurinhaExtra = new FigurinhaExtra("Ronaldo", "Atacante", "Brasil", 22, "Setembro", 1976, 1.83F, 83F, "Legends", "Ouro");

        figurinha.MostrarFigurinha();
        figurinhaExtra.MostrarFigurinha();
    }
}
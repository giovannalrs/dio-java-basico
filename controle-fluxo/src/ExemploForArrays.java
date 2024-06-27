public class ExemploForArrays {
    public static void main(String[] args) {
        String comidas [] = {"ARROZ", "FEIJÃO", "BATATA", "ARROZ"};
        
        for (int x = 0; x < comidas.length; x ++) {
            System.out.println("A comida no indice " + x + " é " + comidas[x]);
        }
    }
}

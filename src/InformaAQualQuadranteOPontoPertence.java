import java.util.Scanner;

public class InformaAQualQuadranteOPontoPertence {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String quadrante;
        Integer coordenadaX = obterCoordenada("Digite a coordenada X:");
        Integer coordenadaY = obterCoordenada("Digite a coordenada y:");
        while (coordenadaX != null && coordenadaY != null) {
            quadrante = calcularQuadrante(coordenadaX, coordenadaY);
            System.out.println("Pertence ao " + quadrante+" quadrante.");
            coordenadaX = obterCoordenada("Digite a coordenada X:");
            coordenadaY = obterCoordenada("Digite a coordenada Y:");
        }
    }

    private static Integer obterCoordenada(String mensagemAoUsuario) {
        System.out.println(mensagemAoUsuario);
        String entradaDoUsuario = scanner.nextLine();
        if (entradaDoUsuario.equals("")) {
            return null;
        }
        Integer coordenada = Integer.parseInt(entradaDoUsuario);
        return coordenada;
    }

    private static String calcularQuadrante(Integer coordenadaX, Integer coordenadaY) {
        String quadrante;
        if (coordenadaX > 0 && coordenadaY > 0) {
            quadrante = "primeiro";
        } else if (coordenadaX < 0 && coordenadaY > 0) {
            quadrante = "segundo";
        } else if (coordenadaX > 0 && coordenadaY < 0) {
            quadrante = "terceiro";
        } else {
            quadrante = "quarto";
        }
        return quadrante;
    }
}

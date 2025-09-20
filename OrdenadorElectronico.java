import java.util.*;

public class OrdenadorElectronico{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        boolean continuar = true;

        while (continuar) {
            // Generar lista de 4 números aleatorios únicos
            Set<Integer> conjunto = new HashSet<>();
            while (conjunto.size() < 4) {
                conjunto.add(rand.nextInt(99) + 1);
            }

            // Convertir a lista
            List<Integer> numeros = new ArrayList<>(conjunto);
            System.out.println("Lista original: " + numeros);

            // Bubble Sort
            boolean swapped;
            do {
                swapped = false;
                for (int i = 0; i < numeros.size() - 1; i++) {
                    if (numeros.get(i) > numeros.get(i + 1)) {
                        int temp = numeros.get(i);
                        numeros.set(i, numeros.get(i + 1));
                        numeros.set(i + 1, temp);
                        swapped = true;
                    }
                }
            } while (swapped);

            System.out.println("Lista ordenada: " + numeros);

            // Preguntar si desea continuar
            System.out.print("¿Quieres generar y ordenar otra lista? (S/N): ");
            String opcion = scanner.nextLine().trim().toLowerCase();
            if (!opcion.equals("s")) {
                continuar = false;
            }
        }

        scanner.close();
    }
}

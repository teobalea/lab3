public class Main {
    public static void main(String[] args) {
        // Problema 1
        String[] a = {"java", "test", "university"};
        String[] b = {"car", "university", "plane"};
        gasesteElementeComune(a, b);

        // Problema 2
        int[] numere = {2, 3, 5, 8, 10, 13, 17};
        afiseazaNumerePrime(numere);

        // Problema 3
        int n = 20;
        afiseazaSirFibonacci(n);

        // Problema 4
        String cuvant = "radar";
        verificaPalindrom(cuvant);
    }

    // Problema 1: Găsiți elementele comune din două șiruri
    public static void gasesteElementeComune(String[] a, String[] b) {
        for (String elemA : a) {
            for (String elemB : b) {
                if (elemA.equals(elemB)) {
                    System.out.println(elemA);
                }
            }
        }
    }

    // Problema 2: Afișați numerele prime dintr-un șir de numere întregi
    public static boolean isPrim(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void afiseazaNumerePrime(int[] numere) {
        System.out.print("Numere prime: ");
        for (int num : numere) {
            if (isPrim(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Problema 3: Afișați șirul Fibonacci până la un număr N
    public static void afiseazaSirFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Sirul Fibonacci pana la " + n + ": ");
        while (a <= n) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }

    // Problema 4: Verificați dacă un cuvânt este palindrom
    public static boolean isPalindrom(String cuvant) {
        cuvant = cuvant.toLowerCase();
        int i = 0;
        int j = cuvant.length() - 1;
        while (i < j) {
            if (cuvant.charAt(i) != cuvant.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void verificaPalindrom(String cuvant) {
        if (isPalindrom(cuvant)) {
            System.out.println(cuvant + " este un cuvânt palindrom.");
        } else {
            System.out.println(cuvant + " nu este un cuvânt palindrom.");
        }
    }
}

import java.util.Scanner;

public class LoopsJavaArray {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cotxes = new String[4];

        for (int i = 0; i < cotxes.length; i++) {
            System.out.println("Digues la posició " + i + " del array");
            cotxes[i] = sc.nextLine();
        }
        for (int i =0; i < cotxes.length; i++){
            System.out.println("El teu llistat de cotxes és el següent:  " + cotxes[i]);
        }
    }
}




import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("=======================");
        System.out.println("PILIHAN MENU");
        System.out.println("=======================");
        System.out.println("1. Tampilkan pertanyaan");
        System.out.println("2. Jaweb pertanyaan");
        System.out.println("3. Exit");
        System.out.println("=======================");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedList17 LinkedList17 = new LinkedList17();
        int pil;

        do {
            menu();
            System.out.print("Pilih salah satu (1/2/3) : ");
            pil = input.nextInt();
            switch (pil) {
                case 1:
                    LinkedList17.addLast("ibukota jawatimur", "surabaya");
                    LinkedList17.addLast("ibukota jawabarat", "bandung");
                    LinkedList17.addLast("bola berbentuk", "bulat");
                    LinkedList17.addLast("roda berbentuk", "bulat");
                    LinkedList17.print();
                    break;
                case 2:
                    LinkedList17.start();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia .");
                    break;
            }
        } while (pil == 1 || pil == 2 || pil == 3);
    }

}

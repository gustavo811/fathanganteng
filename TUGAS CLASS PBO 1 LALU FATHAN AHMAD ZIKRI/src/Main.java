import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("pilih login :");
        System.out.println("1. admin");
        System.out.println("2. mahasiswa");
        System.out.print("masukkan pilihan :");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if(pilihan == 1){
            System.out.print("masukkan username : ");
            String user = scanner.nextLine();
            System.out.print("masukkan password : ");
            String pass = scanner.nextLine();

            String validuser="admin483";
            String validpass="password483";

            if(user.equals(validuser) && pass.equals(validpass)){
                System.out.println("login berhasil");
            }else{
                System.out.println("logil gagal, username atau password salah");
            }
        }
    }
}
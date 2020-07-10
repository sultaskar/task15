import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        File dir = new File("/Users/askarsultanov/Desktop/");
        File file = new File(dir,"newfile.txt");
        File dir2 = new File("/Users/askarsultanov/Desktop/Folder");
        File file2 = new File(dir2,"newnewfile.txt");
        File file3 = new File(dir,"newfilik.txt");
        try {
            file.createNewFile();
            System.out.println("Файл создан");
            sc.next();
            file.renameTo(file3);
            System.out.println("Переименован");
            sc.next();
            System.out.println(file.getAbsolutePath());
            sc.next();
            Files.copy(file3.toPath(),file2.toPath());
            System.out.println("Скопирован");
            sc.next();
            file3.delete();
            file2.delete();
            System.out.println("Файлы удалены");
            sc.next();
    }catch(IOException e) {
            System.out.println("IOException при создании");
            e.printStackTrace();
        }
    }
}

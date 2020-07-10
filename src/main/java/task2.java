import java.io.File;
import java.util.Scanner;

public class task2 {

    private static File[] files;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите полный путь для сканирования файлов и папок");
        File targetFile = new File(sc.next());
        scanDir(targetFile,0);

    }
    public static void scanDir(File root,int depth) {
        files = root.listFiles();
        System.out.println(depth);
        if(files != null) {
            for (File file: files) {
                if (file.isDirectory()) {
                    scanDir(file, depth + 1);
                }
                System.out.println(file.getAbsolutePath());

            }
        }

    }
}

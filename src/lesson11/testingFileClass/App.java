package lesson11.testingFileClass;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        String path = "src/lesson11/testingFileClass/newDir/newDir1";
        File file = new File(path);
        boolean check = file.mkdirs();
        System.out.println(check);

        file = new File("src/lesson11/testingFileClass/newDir2");
        check = file.mkdir();
        System.out.println(check);

        File file1 = new File("src/lesson11/testingFileClass/newDir2/myFile.txt");
        file1.createNewFile();

        File file2 = new File("src/lesson11/testingFileClass/newDir2/myFile2.txt");
        file1.renameTo(file2);

        File file3 = new File("src/lesson11/testingFileClass/newDir2/myFile3.txt");
        file2.renameTo(file3);

        System.out.println(file2.isFile());
        System.out.println(file2.getName() + "\t" + file2.getPath() + "\t" + file2.getAbsolutePath() + "\t");

        file1.delete();





    }
}

import java.io.File;

public class FileList {

    public static void main(String[] args) {
        File file = new File("/tmp");

        printFiles(file);
    }

    private static void printFiles(File file) {
        if (file.isDirectory()) {
            System.out.println("directory: " + file.getPath());
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].canRead()) {
                    printFiles(files[i]);
                } else {
                    System.out.println(">>>cant read directory : " + files[i].getPath());
                }

            }
//            for (File fileItem : files) {
//                System.out.println("fileItem = " + fileItem);
//            }
        } else {
            System.out.println("fileName: " + file.getName());
        }
    }

}

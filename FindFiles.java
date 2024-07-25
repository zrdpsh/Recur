import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FindFiles {
    public static void main(String[] args) {
        ArrayList<String> fileNames = findFiles(".");
        for(String s: fileNames) System.out.println(s);
    }
    

    public static ArrayList<String> findFiles(String givenFolder) {
        ArrayList<String> result = new ArrayList<>();

        recurOverFolder(givenFolder, result);

        return result;
    }

    private static void recurOverFolder(String givenFolder, ArrayList<String> toStoreResult) {
        File folderWrapper = new File(givenFolder);
        File[] filesList = folderWrapper.listFiles();

        if (filesList == null) return;
        for(File f: filesList) {
            if (f.isDirectory()) recurOverFolder(f.getAbsolutePath(), toStoreResult);
            if (f.isFile()) toStoreResult.add(f.getName());
        }
    }
}









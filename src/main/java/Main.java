
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String a[]) {

        ArrayList<ArrayNameAndTextFile> arrayNameAndTextFile = new ArrayList<ArrayNameAndTextFile>();
        File f = new File("D:\\java IDE\\SqilSoft\\img");
        String ListNameFile[] = f.list();

        //GET IMG TEXT IN CLASS OCR
        OCR ocr = new OCR();
        String listTextIMG[] = ocr.scanIMG(ListNameFile);

        //ADD IN COLLECTION NAME FILE AND IMG TEXT && CREATE TXT FILE
        for (int i = 0; i < ListNameFile.length; i++) {

            //ADD IN COLLECTION NAME FILE AND IMG TEXT
            arrayNameAndTextFile.add(new ArrayNameAndTextFile(ListNameFile[i], listTextIMG[i]));



            String nameFileTXT = ListNameFile[i];
            nameFileTXT = nameFileTXT.replace(".jpg", ".txt");

            //CREATE TXT FILE AND WRITE IMG TEXT
            File f2 = new File("static\\" + nameFileTXT);
            FileOutputStream output;
            try {
                output = new FileOutputStream(f2);
                output.write(listTextIMG[i].getBytes());
                output.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
//OUTPUT IMG TEXT WITH
        ListIterator<ArrayNameAndTextFile> iter = arrayNameAndTextFile.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().getText());
        }
    }


}

import java.io.*;
import java.util.ArrayList;

public class FileImport extends Filemanager {
    public void fileImport(ArrayList<Phonebook> pb) {
        try {
            File file = new File(FILE_PATH_FULL);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
           String line = reader.readLine();
            while (line != null) {

                String[] tmp = line.split(";");

                pb.add(new Phonebook(tmp[0], tmp[1], tmp[2]));
                line = reader.readLine();
            }
            reader.close();
        }
        catch (FileNotFoundException e) {e.printStackTrace();}
        catch (IOException e) {e.printStackTrace();}
    }
}


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileExport extends Filemanager{
    public void fileExport(ArrayList<Phonebook> pb){
        try(FileWriter writer = new FileWriter(FILE_PATH + FILE_NAME_EXPORT, false))
        {
            for(Phonebook i: pb){
                String text = i.getName()+";"+i.getPhone()+";"+i.getCity();
                writer.write(text);
                writer.append('\n');
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

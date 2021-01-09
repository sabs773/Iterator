package contactmanagementsoftware;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationUtil implements Serializable {

    //deserialize and display the contents 
    public static Object deserialize(File file) throws IOException,
        ClassNotFoundException {
        // Reading the object from a file
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Method for deserialization of object 
        Object obj = (Object)ois.readObject();
        ois.close();
        //add close file input stream
        fis.close();    
        return obj;
    }

    // serialize the given object and save it to file
    public static void serialize(Object obj, String fileName)
        throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        //close stream
        oos.close();
        fos.close();
    }

}

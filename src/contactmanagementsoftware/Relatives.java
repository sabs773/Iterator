package contactmanagementsoftware;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Relatives extends Acquaintances implements Serializable {

    private String BDate;
    private String LDate;
    private ArrayList<Acquaintances> relatives;
    

    Relatives() {
        super();
        relatives = new ArrayList<Acquaintances>();
    }

    public String getBDate() {
        return BDate;
    }

    public void setBDate(String BDate) {
        this.BDate = BDate;
    }

    public String getLDate() {
        return LDate;
    }

    public void setLDate(String LDate) {
        this.LDate = LDate;
    }

   
}

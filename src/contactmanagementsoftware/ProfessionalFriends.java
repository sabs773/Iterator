package contactmanagementsoftware;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProfessionalFriends extends Acquaintances implements Serializable{

    private String CommonInterests;
    private ArrayList<Acquaintances> professionalFriends;

    ProfessionalFriends() {
        super();
        professionalFriends = new ArrayList<Acquaintances>();
    }

    public String getCommonInterests() {
        return CommonInterests;
    }

    public void setCommonInterests(String CommonInterests) {
        Scanner reader = new Scanner(System.in);
        if (!CommonInterests.isEmpty()) {
            this.CommonInterests = CommonInterests;
        } else {
            System.out.println("Enter atleast one character");
            setCommonInterests(reader.nextLine());
        }
    }


}

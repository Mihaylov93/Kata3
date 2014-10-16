package kata3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MailReader {
    private final String filePath;
    
    public String[] readDomains(){
       ArrayList<String> domainList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while (line != null){
                if (line.contains("@"))
                    domainList.add(line.split("@")[1]);
            }
        } catch (IOException ex) {
        
        }
        return domainList.toArray(new String [domainList.size()]);
    }

    public MailReader(String filePath) {
        this.filePath = filePath;
    }
}

package Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main{
    public static void main(String[] args) {
        CreateDeveloper createDeveloper = init("py");
        Developer developer = createDeveloper.createDeveloper();;
        developer.write();
    }

    public static CreateDeveloper init(String str){
        if(str.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }else if(str.equalsIgnoreCase("py")){
            return new PythonDeveloperFactory();
        }else{
            throw new RuntimeException();
        }
    }
}

class ed extends Thread {


}

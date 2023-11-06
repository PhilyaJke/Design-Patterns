package Factory;

public class Main {
    public static void main(String[] args) {
        Developer developer = init("py");
        developer.write();
    }

    public static Developer init(String str){
        if(str.equalsIgnoreCase("java")){
            return new JavaDeveloper();
        }else if(str.equalsIgnoreCase("py")){
            return new PythonDeveloper();
        }else{
            throw new RuntimeException();
        }
    }
}

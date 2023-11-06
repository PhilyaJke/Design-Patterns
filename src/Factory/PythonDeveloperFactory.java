package Factory;

public class PythonDeveloperFactory implements CreateDeveloper{

    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}

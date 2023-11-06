package Factory;

public class JavaDeveloperFactory implements CreateDeveloper{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}

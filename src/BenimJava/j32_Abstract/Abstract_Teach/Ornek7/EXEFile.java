package BenimJava.j32_Abstract.Abstract_Teach.Ornek7;

public class EXEFile implements ReadFile {

    @Override
    public String open() {
        return "opening.exe";
    }

    @Override
    public String read() {
        return "reading.exe";
    }

    @Override
    public String save() {
        return "saving.exe";
    }

    @Override
    public String close() {
        return "closing.exe";
    }
}

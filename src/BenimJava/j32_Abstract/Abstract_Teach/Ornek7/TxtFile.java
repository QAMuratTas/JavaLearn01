package BenimJava.j32_Abstract.Abstract_Teach.Ornek7;

public class TxtFile implements ReadFile {
    @Override
    public String open() {
        return "opening.txt";
    }

    @Override
    public String read() {
        return "reading.txt";
    }

    @Override
    public String save() {
        return "saving.txt";
    }

    @Override
    public String close() {
        return "closing.txt";
    }
}

package visitor;

public class ListVisitor extends Visitor {

    private String currentDir = "";

    @Override
    public void visit(File f) {
        System.out.println(currentDir + java.io.File.pathSeparator + f);
    }

    @Override
    public void visit(Directory d) {
        System.out.println(currentDir + java.io.File.pathSeparator + d);

        String saveDir = this.currentDir;
        this.currentDir = this.currentDir + java.io.File.pathSeparator + d.getName();

        try {
            d.iterator().forEachRemaining(o -> ((Element) o).accept(this));
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.currentDir = saveDir;
    }
}

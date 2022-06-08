public class PdfHandler  extends TypeHandler{
    @Override
    public void open(String filename) {
        String type = getType(filename);
        if (type.equals("pdf")) {
            System.out.println("Opening pdf file " + filename);

        }
        else {
            super.open(filename);
        }

    }

}

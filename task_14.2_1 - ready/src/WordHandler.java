public class WordHandler extends TypeHandler{

    @Override
    public void open(String filename) {
        String type = getType(filename);
        if (type.equals("doc") || type.equals("docx")){
            System.out.println("Opening document " + filename);

        }
        else {
            super.open(filename);
        }

    }

}

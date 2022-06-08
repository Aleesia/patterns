public class PresentationHandler  extends TypeHandler{
    @Override
    public void open(String filename) {
        String type = getType(filename);
        if (type.equals("pptx")){
            System.out.println("Opening presentation " + filename);

        }
        else {
            super.open(filename);
        }

    }

}

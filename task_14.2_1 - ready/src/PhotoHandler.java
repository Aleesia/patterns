public class PhotoHandler  extends TypeHandler{

    @Override
    public void open(String filename) {
        String type = getType(filename);
        if (type.equals("jpg") || type.equals("png")){
            System.out.println("Opening photo " + filename);

        }
        else {
            super.open(filename);
        }

    }

}

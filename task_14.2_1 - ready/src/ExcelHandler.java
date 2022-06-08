public class ExcelHandler  extends TypeHandler{
    @Override
    public void open(String filename) {
        String type = getType(filename);
        if (type.equals("xls") || type.equals("xlsx")){
            System.out.println("Opening table " + filename);

        }
        else {
            super.open(filename);
        }

    }

}

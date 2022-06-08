

public class Client {
    public static void main(String[] args) {

        String[] files = {
                "photo.jpg",
                "screenshot.png",
                "newFile.docx",
                "document.doc",
                "table.xls",
                "table.xlsx",
                "presentation.pptx",
                "document.pdf",
                "noneType.error"
        };

        // Create Chain of responsibility to open file by correct program according to the extension.
        Handler handler1 = new PdfHandler();
        Handler handler2 = new WordHandler();
        Handler handler3 = new ExcelHandler();
        Handler handler4 = new PhotoHandler();
        Handler handler5 = new PresentationHandler();
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        handler3.setNext(handler4);
        handler4.setNext(handler5);

        for (String file : files) {
            // open file
            handler1.open(file);
        }


    }
}

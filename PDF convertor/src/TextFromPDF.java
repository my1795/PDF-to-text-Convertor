import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFromPDF {

    public static void main(String args[]) throws IOException {

        //Loading an existing document
        File file = new File("hadoopTutorial.pdf");
        PDDocument document = PDDocument.load(file);

        //Instantiate PDFTextStripper class
        PDFTextStripper pdfStripper = new PDFTextStripper();

        //Retrieving text from PDF document
        String text = pdfStripper.getText(document);

        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
        writer.println(text);
        writer.close();

        //Closing the document
        document.close();

    }
}

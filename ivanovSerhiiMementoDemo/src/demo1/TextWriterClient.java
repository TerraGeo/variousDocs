package demo1;

/**
 * Created by Serhii_Ivanov on 5/10/2017.
 */
public class TextWriterClient {
    public static void main(String[] args) {
        TextWriterCaretaker caretaker = new TextWriterCaretaker();
        TextWriter textWriter = new TextWriter("data.txt");
        textWriter.write("First Set of Data\n");
        System.out.println(textWriter+"\n\n");
        caretaker.save(textWriter);
        textWriter.write("Second Set of Data\n");
        System.out.println(textWriter+"\n\n");
        caretaker.undo(textWriter);
        System.out.println(textWriter+"\n\n");
    }
}

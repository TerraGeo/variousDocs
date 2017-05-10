package demo1;

/**
 * Created by Serhii_Ivanov on 5/10/2017.
 */
public class TextWriterCaretaker {
    private Object object;
    public void save(TextWriter textWriter){
        this.object = textWriter.save();
    }

    public void undo(TextWriter textWriter){
        textWriter.undoLastSave(object);
    }
}

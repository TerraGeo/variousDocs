package demo1;

/**
 * Created by Serhii_Ivanov on 5/10/2017.
 */
public class TextWriter {
    private String fileName;
    private StringBuilder textContent;

    public TextWriter(String fileName) {
        this.fileName = fileName;
        this.textContent = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.textContent.toString();
    }

    public void write(String text){
        this.textContent.append(text);
    }

    public Memento save(){
        return new Memento(this.fileName, this.textContent);
    }

    public void undoLastSave(Object object){
        Memento memento = (Memento) object;
        this.fileName = memento.fileName;
        this.textContent = memento.content;
    }

    private class Memento {
        private String fileName;
        private StringBuilder content;

        public Memento(String fileName, StringBuilder content) {
            this.fileName = fileName;
            this.content = new StringBuilder(content);
        }
    }
}

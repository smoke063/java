package oop_3;

import java.util.ArrayList;
import java.util.List;

public class Notepad {
    private final List<TextDocument> documents;
    private int index;

    public Notepad() {
        documents = new ArrayList<>();
        index = -1;
    }

    public void newFile() {
        documents.add(new TextDocument());
        index++;
    }

    public TextDocument currentDocument() {
        return documents.get(index);
    }

    public void SaveAs(String path, TextFormat format) {
        format.saveAs(documents.get(index), path);
    }
}

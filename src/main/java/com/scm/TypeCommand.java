package com.scm;

public class TypeCommand implements Command{
    String text;
    TextEditor textEditor;
    TypeCommand(String text,TextEditor textEditor){
        this.text = text;
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.typeText(text);
    }

    @Override
    public void undo() {
        textEditor.deleteText(text);
    }
}

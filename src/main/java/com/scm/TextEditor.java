package com.scm;

public class TextEditor {

    private StringBuilder textEditor = new StringBuilder();

    public void typeText(String text){
        textEditor.append(text);
        System.out.println(textEditor.toString());
    }

    public void deleteText(String text){
        int index = textEditor.indexOf(text);
        if(index!=-1){
            textEditor.delete(index,index+text.length());
            System.out.println("Text Deleted");
        }
        else{
            System.out.println("Not found");
        }

        System.out.println("Final text after deletion"+textEditor.toString());
    }
}

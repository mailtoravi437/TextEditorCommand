package com.scm;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        TextEditor textEditor = new TextEditor();
        Command command = new TypeCommand("Ravi",textEditor);

        TextEditorInvoker invoker = new TextEditorInvoker();
        invoker.execute(command);
    }
}
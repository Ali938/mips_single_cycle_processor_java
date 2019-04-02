package processor.controllers;

public class ProgramCounter {

    private int pointer;

    public ProgramCounter() {
        pointer = 0;
    }

    public int getPointer() {
        int temp = pointer;
        pointer++;
        return temp;
    }

    public void setPointer(int pointer) {
        this.pointer = pointer;
    }
}

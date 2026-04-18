package oop; // make sure folder name is 'oop'

public class Get {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("yellow");   
        System.out.println(p1.getColor()); 
        p1.setTip(5);            
        System.out.println(p1.getTip());
    }
}

class Pen {
    private String color;
    private int tip;

    public String getColor() {
        return this.color;
    }

    public int getTip() {
        return this.tip;
    }

    public void setColor(String col) {
        this.color = col;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }
}

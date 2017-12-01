package NN0414;

public class test1 {
    private int a;

    public test1() { this.a = 0; }
    public test1(int a) { this.a=a; }

    public int getA() { return a; }
    public void setA(int a) { this.a = a; }

    public boolean equals(int a) {
        if (this.a==a)return true;
        else return false;
    }

    public String toString() {
        return "a: "+a;
    }

}

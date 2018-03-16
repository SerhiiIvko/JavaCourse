package classworks.mar132018.classwork.task4;

class B extends A {
    int i;

    public B(int a, int b) {
        this.i = a;
        this.i = b;
    }

    void show() {
        System.out.println("Variable i in superclass = " + super.i);
        System.out.println("Variable i in inharited class = " + this.i);
    }
}
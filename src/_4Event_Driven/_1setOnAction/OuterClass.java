package _4Event_Driven._1setOnAction;

public class OuterClass {

    int variabla = 5;

    private class InnerClass {

        public void shtypVariable() {
            System.out.println(variabla++);
            System.out.println(variabla);
        }
    }

    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();

        innerObject.shtypVariable();
    }

}

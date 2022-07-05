public class Main {
    public static void test() { // невозвращаемый метод без входящих параметров
        int number1 = 9;
        System.out.println(number1 / 3);
    }

    public static void main(String[] args) { //DRY - DO not Repeat Yourself
        System.out.println("ЗАВТРАК");
        makeTea();
        System.out.println("ОБЕД");
        makeTea();
        System.out.println("УЖИН");
        makeTea();
        addition(5, 10, "java");
        addition(23, 200, "programming");
        calculatePerimeter("Auditory 1", 6.5, 5.0);
        calculatePerimeter("Kitchen", 2.0, 4.0);
        System.out.println("Area of Auditory 1: " + calculateArea(6.5, 5.0) + " m. kv.");
        System.out.println("Area of Kitchen: " + calculateArea(2.0, 4.0) + " m. kv.");
        System.out.println("Total area: " + (calculateArea(6.5, 5.0) +
                calculateArea(2.0, 4.0)) + " m. kv.");
    }

    public static void addition(int num1, int num2, String word) {
        // невозвращаемый метод с входящими параметрами
        int result = num1 + num2;
        System.out.println("Result of addition: " + result);
        System.out.println("WORD - " + word);
    }

    public static void calculatePerimeter(String roomName, double length, double width) {
        // невозвращаемый метод с входящими параметрами
        System.out.println("Perimeter of " + roomName + ": " + ((length + width) * 2) + " m.");
    }

    public static double calculateArea(double length, double width) {
        // возвращаемый метод с входящими параметрами
        double area = length * width;
        return area;
    }

   /* test();
    System.out.println("УЖИН");
    здесь вызывать операции нельзя*/

    public static void makeTea() { // невозвращаемый метод без входящих параметров
        System.out.println("Вскипятить воду");
        System.out.println("Насыпать заварку и залить кипятком");
        System.out.println("Дать настояться");
        System.out.println("Налить в чашку");
        System.out.println("Добавить молоко или сахар по вкусу");
        test();
    }
}

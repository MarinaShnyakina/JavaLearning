import java.util.Scanner;

public class MethodPractice {

    public static void main(String[] args){


//        double num1 = getNumber(); // getNumber - это некоторая функциональная часть логики нашего приложения, нашего кода, которое возвращает какое-то значение
//        double num2 = getNumber();
//        char operation = getOperation();
//        double result = calc(num1, num2, operation);
//        System.out.println("Result"+ result);

        int[] a = {10,15,20,25,30};
        writeArray(a);

        String[] strings = {"dsfjh", "fhgfu", "igdvskp", "37464894"};
        //writeArray(strings);

        writeArray(strings, 2);


    }

    /*
    * //ПСЕВДОКОД
    * [модификаторы] <тип возвращаемого значения> <название метода>([параметры]){  //параметры не являются обязательными, но если их указывать, то пишется тип параметра название, и тп
    * <тело метода>
    * }
    *
    *
    * */

    private static double calc(double num1, double num2, char operation) { // operation - это передаваемый параметр, то что мы отдаем внутрь нашего метода
        // означает, что наши данные окажутся внутри этого блока
        // логично, что calc отвечает за операции +,-,*,/
        // calc - это название метода
        // static - говорит о том, что этот можно вызвать абсолютно где угодно, он явл глобальным с точки зрения логики
        switch (operation){
            case '+':
                return num1+num2;
            case '-':
                return num1-num2;
            case '*':
                return num1*num2;
            default: return 0; // return - это тип возвращаемого значения

        }

    }
    private static char getOperation() {        // здесь надо понять и получить операцию, которую мы будем делать
        Scanner in = new Scanner(System.in);    // пока условимся в консоли, что 1 +, 2 -, 3 * - и напишем это через switch
        switch (in.nextInt()){
            case 1:
                return '+';
                // break; не нужен, потому что return (получатся мы дублируем результат)
            case 2:
                return '-';
                // break; не нужен, потому что return (получатся мы дублируем результат)
            case 3:
                return '*';
            default: return '+';

        }
    }

    private static double getNumber() {          // getNumber - это блок, который будет вызван, ему можно передать какие-то параметры, его можно вызвать в дальнейшем, использовать и переиспользовать
        Scanner scanner = new Scanner(System.in);
        // int a = scanner.nextInt();
        // return a;
        // эти две строки проще записать
        return scanner.nextInt();
    }

    public static void writeArray(int[] arr){
        for(int i = 0; i <= arr.length-1; i++){
            System.out.println("Значение: " + (arr[i]+1));
        }

    }

    public static void writeArray(String[] arr, int numberOfPrints){
        for(int i = 0; i <= numberOfPrints-1; i++){
            System.out.println("Значение: " + (arr[i]+1));
        }
}


}








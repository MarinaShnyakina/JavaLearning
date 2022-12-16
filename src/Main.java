import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // initialization of variables
        /*
        {
            System.out.println("Введи мне два числа и я посчитаю тебе их сумму");
        System.out.println("______________________________________________");


        double a = 0, b = 0;
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);


        System.out.print("Введите сюда первое число: ");
        a = in.nextDouble();

        System.out.print("Введите сюда второе число: ");
        b = in.nextDouble();


        System.out.println("Сумма ваших чисел равна: " + (a + b));
        }
    */

        // types
        /*{
        // int g = (a + b) / c ;

        // a + b + c ;

        long x = 1000 * 1000;

        // int размер 32 бита, int должен быть не более 2^31
        // long размер 64 бита

        System.out.println(x * x);
        System.out.println( x );

        }*/

        // operations
        /* {

        System.out.println( (5) / 3 ); //  можем разделить 1 раз (потому что это int)
        System.out.println( (double) (5) ); // это double, поэтому 5.0
        System.out.println( (double) (5)/ 3 ); //  можем разделить 1.(6) раз (потому что это double)

        Scanner in = new Scanner(System.in);
        double value = in.nextDouble();
        if( value%2 == 0 ){ // (12,2)/2
            System.out.println("Вы ввели четное число");
        } else System.out.println("Вы ввели нечетное число");

        System.out.println(12.2 %2);
        }*/

        // arithmetic
        /*{
        int minutes = 10;
        System.out.println(minutes++); //увеличивает на 1
        // префиксная (++minutes) сначала прибавляет, потом все остальные операции
        // постфисная (minutes++) сначала использует значение, потом прибаляет
        System.out.println(minutes);
        minutes +=2; // здесь можно также /=; *=; -=;

        System.out.println(minutes);
        }*/

        // char explanation
        /*{
        char a = 8667;
        char b = '\u21DB';
        char c = '➡';

        System.out.println(a);
        System.out.println((int)b);
        System.out.println((int) c );

        }*/


        // || - и , && - или, == - равно, != - не равно, ! - отрицание
        // ! - имеет наибольший вес и вычисляется в самую первую очередь
        // дальше идет операция &&
        // || - имеет наименьший приоритет

        /*{
            Scanner in = new Scanner(System.in);

            *//*if ( in.nextInt() >10){ // == , > , < , >= , <= , != , && , || , ! ; true false
                System.out.println( "условиe сгенерировало true" ); // true != 0 boolean
            } else {
                System.out.println( "условиe сгенерировало false" );
            }*//*


            int x = in.nextInt();
            boolean a = x < 5 || x > 5 && x < 7; // все числа меньше 5 не включая 5 // и 6
            // ! - отрицание конвертирует из true - false, из false - true
            // boolean a = !(x < 5 || x > 5 && x < 7);
            System.out.println(a);

        }*/


        // boolean - true or false
        /*{

            boolean a = true;
            boolean b = false;

            int x = 5;
            boolean b1 = x > 0;
            boolean b2 = b1 && (x < 20);
            // также можно написать boolean (x > 0) (x < 20);
            // но этот код будет выполняться дольше, потому что сверху мы уже написали b1

        }*/


        // Ternarn operation
       /* {
         *//*
         * <условие> ? <значение если условие истина> : <значение если условие ложно>
                *//*
            int a = -10;
            int b = 20;
            int max = (a>b ? a:b);
            System.out.println(max);
            //  вместо int может быть любое значение: doble, boolen
            // от скобок можно отказаться и программа также будет работать, но с ними более читабельно

            System.out.println(a > 0 ? a * a : "Wrong");

        }*/

/*        // Sablon reshenia
        {
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println(<условие> ? "YES": "NO");
        }    */


 /*       // 112165
        {
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println(x<2 && y < x && x*x + y*y > 0 ? "YES": "NO");
        }*/

      /* // 112167
        {
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println( (y<2-x*x && y>x && x<0) || (y<2-x*x && y>0 && x>=0 ) ? "YES": "NO");
        }*/

        // if else (вентельный код)
        // если true, то далай одну ветку
        // если false, то делай вторую ветку
        // ниже стандартный и хороший код if else

      /* {
            int max = 0;
            int a = 10, b = 5;
            if(a>b) {
                max = a;
            } else {
                max = b;

            }*/

            /* if(price < 100)
            * if(x != 0)
            * if(x>0 && x<1)
            * if(country.eguals("Russia") && city.equals("Ufa"))
            * if(country.equals("Sweden") || (country.equals("India") || (country.equals("Russia")
            * if(country == "Sweden") - это сравнение ссылок двух объектов, такое применяется очень очень редко, возможно даже никогда
             */

        /*    // такая конструкия пзволяет написать много условий if else
            // если одно условие не выполнилось, то программа пойдет дальше выполнять другие условия

            if () {}
            else if () {}
            else if () {}
            else if () {}
            else { }*/

           /* Scanner in = new Scanner(System.in);
            int x1, x2;
            x1 = in.nextInt();
            if(x1>9 && x1<100){
                x2 = x1 %10; //32
                x1 = x1/10;
                System.out.println(x1 + ";" + x2);
                if(x1 == x2) {
                    System.out.println("В числе одинаковые цифры");
                } else if(x2 < x1) {
                    System.out.println("Первая цифра больше второй");
                } else System.out.println("Вторая цифра больше первой");
            } else System.out.println("Введено не двухзначное число");
*/


        // switch case
          /*{
            *//*
            * switch(a) {
            * case значение1 : команды1;
            * break;
            * case значение2 : команды2;
            * break;
            * case значение3 : команды3;
            * break;
            * case значение4 : команды4;
            * break;
            *
            * }
            * *//*

              Scanner in = new Scanner(System.in);
              switch (in.nextInt()){
                  case 1:
                      System.out.println("31");
                      break;
                  case 2:
                      System.out.println("28");
                      break;
                  case 3:
                      System.out.println("31");
                      break;
                  case 4:
                      System.out.println("30");
                      break;
                  case 5:
                      System.out.println("31");
                      break;
                  case 6:
                      System.out.println("30");
                      break;
                  case 7:
                      System.out.println("31");
                      break;
                  case 8:
                      System.out.println("31");
                      break;
                  case 9:
                      System.out.println("30");
                      break;
                  case 10:
                      System.out.println("31");
                      break;
                  case 11:
                      System.out.println("30");
                      break;
                  case 12:
                      System.out.println("31");
                      break;
                  default:
                      System.out.print("0");
                      break;
              }



          }*/


        // blocks
/*        {

            *//*{
                int inf = 10;
                int price = 4;
                if (inf > 0) {
                    price += inf * price / 100;
                    System.out.println(price);
                }
                System.out.println(price);
            }*//*

            {
                Scanner in = new Scanner(System.in);
                int x1, x2;
                x1 = in.nextInt();
                x2 = x1 %10;
                x1 = x1/10;
                if (x2 == 3 || x1 == 3){
                    System.out.println("В числе присутствует цифра 3");
                }
                else {
                    System.out.println("В числе отсутствует цифра 3");
                }

            }

        }*/


        // while
        {
            /*
            * while(<условие>){
            * Действие к выполнению;
            * }
            * */

            /*int x = 0;
            while (x<5) {
                System.out.println(x + " ");
                x++;
            }
            */

            // do while
           /* int x = 0;
            do  {
                System.out.println(x + " ");
                x++;
            } while (x<5);
            System.out.println(x);*/

            // задача автобусы и мосты
            // Автобуст не ниже 437 см один мост высотой 754 см здесь нам надо сказать мы врезались или нет
            // Bus height 437 sm
            // 1 754 || No Crash
            // 2 300 800 || Crash 1

            /*Scanner in = new Scanner(System.in);
            int t = 0;
            int i = 1; // i - это текущий мост
            int N = in.nextInt(); // N - это кол-во мостов
            while (i< N){
                t = in.nextInt();
                if(t<437){
                    System.out.println("Crash" + i);
                    break;
                }
                i++;
            }
            if(t>437) {
                System.out.println("No crash");
            }*/

            int a = 5;
            int b = 3;
            int c = a/b;
            System.out.println(c);
        }


    }

}


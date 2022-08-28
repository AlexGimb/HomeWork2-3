public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        //Объявите переменные всех типов, что мы изучили на уроке, и присвойте им любые значения (инициализируйте их)
        // Целочисленные
        byte by = 100; // (1 байт) от -128 до 127
        short sh = 200; // (2 байт) от -32768 до 32767
        int in = 300; // (4 байт) от -2147483648 до 2147483647
        long lo = 400L; // (8 байт) от -9223372036854775808 до 9223372036854775807

        // С плавающей точкой
        float fl = 1.6f; // (4 байт) 6 знаков после запятой
        double db = 3.76d; // (8 байт) больше 6 знаков после запятой

        // Символы
        char ch = '\u263a'; // (2 байт) Символы, юникод

        // Логический
        boolean bo = 10 > 5; // (1 бит) Правда или ложь

        System.out.println("Мне нравятся уроки в Skypro и это " + bo + ch);
    }

    public static void task2 () {
        //Ниже дан список различных значений. Инициализируйте переменные, используя изученные ранее типы переменных.
        float fl = 27.12f;
        long ln = 987678965549L;
        float fl1 = 2.786f;
        boolean bo = false;
        short sh = 569;
        short sh1 = -159;
        short sh2 = 27897;
        byte by = 67;
    }

    public static void task3 () {
    //Трое школьных учителей, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
    //У Людмилы Павловны 23 ученика , у Анны Сергеевны 27 учеников и у Екатерины Андреевны – 30 учеников.
    //Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
    //Результат задачи выведите в консоль в формате "На каждого ученика рассчитано … листов бумаги".
        byte ludmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        short paper = 480;
        System.out.println("На каждого ученика получиться по " + paper/(ludmila+anna+ekaterina) + " листов" );
    }
    public static void task4 () {
    //Производительность машины для изготовления бутылок - 16 бутылок за 2 минуты. Какая производительность машины будет:
    //за 20 минут
    //в сутки
    //за 3 дня
    //за 1 месяц
        byte performance1min = 16/2;
        short minDay = 1440;

        System.out.println("За 20 минут машины произвела бутылок " + performance1min*20 + " штук");
        System.out.println("За 1 сутки машины произвела бутылок " + performance1min*minDay + " штук");
        System.out.println("За 3 дня машины произвела бутылок " + performance1min*(minDay*3) + " штук");
        System.out.println("За месяц машины произвела бутылок " + performance1min*(minDay*30) +" штук");
    }
    public static void task5 () {
        //На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
        byte tin = 120;
        byte classroom = 120/(4+2);
        byte white = (byte) (classroom*2);
        byte brown = (byte) (classroom*4);
        System.out.printf("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски", classroom,white, brown);
    }
    public static void task6 () {
        //– Бананы – 5 штук (1 банан - 80 грамм);
        //– Молоко – 200 мл (100 мл = 105 грамм);
        //– Мороженое пломбир – 2 брикета по 100 грамм;
        //– Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        //Смешать всё в блендере и готово.
        //Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
        //Результат напечатайте в консоль
        byte bananas = 5;
        byte weightOneBananas = 80;
        int weightBananas = bananas * weightOneBananas;
        System.out.println("Общий вес бананов " + weightBananas + " гр");

        int milkMl = 200;
        byte weight100MlMilk = 105;
        milkMl = weight100MlMilk * 2;
        int weightMilk = milkMl;
        System.out.println("Общий вес молока " + weightMilk + " гр");

        byte iceCream = 2;
        byte weightOneIceCream = 100;
        int weightIceCream = iceCream + weightOneIceCream;
        System.out.println("Общий вес мороженного " + weightIceCream + " гр");

        byte eggs = 4;
        byte weightOneEggs = 70;
        int weightEggs = eggs * weightOneEggs;
        System.out.println("Общий вес яиц " + weightEggs + " гр");

        int totalWeightGr = weightBananas + weightMilk + weightIceCream + weightEggs;
        System.out.println("Общий вес завтрака " + totalWeightGr + " гр");

        float kg1 = 1000f;
        float totalWeightKg = totalWeightGr / kg1;
        System.out.println("Общий вес завтрака " + totalWeightKg + " кг");
    }
    public static void task7 () {
    //нашему спортсмену нужно сбросить 7 кг, чтобы оставаться в своей весовой категории.
    //Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
    //Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько, если каждый день будет худеть на 500 грамм.
    //Посчитайте, сколько может потребоваться дней в среднем
    byte loseWeight = 7;
    short kg1 = 1000;
    short loseWeight1DayMin = 250;
    short loseWeight1DayMax = 500;

    int gram = loseWeight * kg1;
            System.out.println("Вес в граммах " + gram);

    int dayMax = gram / loseWeight1DayMin;
            System.out.println("Максимум понадобится " + dayMax + " дней");

    int dayMin = gram / loseWeight1DayMax;
            System.out.println("Минимум понадобится " + dayMin + " дней");


    int averageAmount = (dayMax + dayMin) / 2;
            System.out.println("В среднем понадобится " + averageAmount + " день");
    }
    public static void task8 () {
        //К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
        //Маша получает 67 760 рублей в месяц
        //Денис получает 83 690 рублей в месяц
        //Кристина получает 76 230 рублей в месяц
        //Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения
        int masha = 67_760;
        int denis = 83_690;
        int kristina = 76_230;
        int interest = 10;

        int mashaYear = masha * 12;
        int masha10int = masha / interest;
        int masha10 = masha + masha10int;
        int mashaYear10 = masha10 * 12;
        System.out.println(" - Маша после повышения получает " + masha10 + " руб." + " Доход за месяц вырос на " + masha10int + "руб.");
        System.out.println(" Годовой доход Маши вырос на " + (mashaYear10 - mashaYear) + " руб");

        int denisYear = denis * 12;
        int denis10int = denis / interest;
        int denis10 = denis + denis10int;
        int denisYear10 = denis10 * 12;
        System.out.println(" - Денис после повышения получает " + denis10 + " руб." + " Доход за месяц вырос на " + denis10int + "руб.");
        System.out.println(" Годовой доход Дениса вырос на " + (denisYear10 - denisYear) + " руб.");

        int kristinaYear = kristina * 12;
        int kristina10int = kristina / interest;
        int kristina10 = kristina + kristina10int;
        int kristinaYear10 = kristina10 * 12;
        System.out.println(" - Кристина после повышения получает " + kristina10 + " руб." + " Доход за месяц вырос на " + kristina10int + "руб.");
        System.out.println(" Годовой доход Кристины вырос на " + (kristinaYear10-kristinaYear) + " руб");
    }
}




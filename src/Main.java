public class Main {
    public static void main(String[] args) {
       //Задание 1
        byte bookB=127;
        short bookS=32767;
        int bookI=2_100_000_000;
        long bookL=900_000_000_000l;
        float riceF=0.7_777_777f;
        double riceD=0.7777777777;
        System.out.println(bookB);
        System.out.println(bookS);
        System.out.println(bookI);
        System.out.println(bookL);
        System.out.println(riceF);
        System.out.println(riceD);

        //Задание 2
        float a=27.12f;
        long b=987_678_965_549l;
        float c=2.786f;
        boolean d=a>30;
        short e=569;
        short f=-159;
        short g=27897;
        byte h=67;
        char i=567;
        int z1=52000;
        double z2=0.77777777789;
        System.out.println(d);
        System.out.println(i);

        //Задание 3
        byte lP=23;
        byte aS=27;
        byte eA=30;
        short paperTotal=480;
        int students=lP+aS+eA;
        int papersForStudents=paperTotal/students;
        System.out.println("На каждого ученика рассчитано "+papersForStudents+" листов бумаги");

        //Задание 4
        byte bottleMinute=16/2;
        byte atime=20;
        int btime=24*60;
        int ctime=3*btime;
        int dtime=31*btime;
        int bottleAtime=bottleMinute*atime;
        int bottleBtime=bottleMinute*btime;
        int bottleCtime=bottleMinute*ctime;
        int bottleDtime=bottleMinute*dtime;
        System.out.println("За "+atime+" минут машина произвела бутылок "+bottleAtime+" штук");
        System.out.println("За "+btime+" минут машина произвела бутылок "+bottleBtime+" штук");
        System.out.println("За "+ctime+" минут машина произвела бутылок "+bottleCtime+" штук");
        System.out.println("За "+dtime+" минут машина произвела бутылок "+bottleDtime+" штук");

        //Задание 5
        byte paintWhiteClass=2;
        byte paintBrownClass=4;
        int paintClass=paintWhiteClass+paintBrownClass;
        int classTotal=120/paintClass;
        int paintWhiteTotal=paintWhiteClass*classTotal;
        int paintBrownTotal=paintBrownClass*classTotal;
        System.out.println("В школе, где "+classTotal+" классов, нужно "+paintWhiteTotal+" банок белой краски и "+paintBrownTotal+ " банок коричневой краски");

        //Задание 6
        int bananas5=5*80;
        int milk200=2*105;
        int iceCream2=2*100;
        int eggs4=4*70;
        int dishInGr=bananas5+milk200+iceCream2+eggs4;
        float dishInKg=dishInGr/1000f;
        System.out.println("Вес блюда в граммах "+dishInGr+", вес в килограммах "+dishInKg);

        //Задание 7
        int needResetGr=7*1000;
        int minResetDay=needResetGr/250;
        int maxResetDay=needResetGr/500;
        System.out.println("Если спортсмен худеет каждый день на 250 грамм, то нужный вес будет достигнут через "+minResetDay+" дней");
        System.out.println("Если спортсмен худеет каждый день на 500 грамм, то нужный вес будет достигнут через "+maxResetDay+" дней");

        //Задание 8
        int mashSalary=67760;
        int denisSalary=83690;
        int kristiyaSalary=76230;
        int oldMashaSalary12=mashSalary*12;
        int oldDenisSalary12=denisSalary*12;
        int oldKristinaSalsry12=kristiyaSalary*12;
        double newMashaSalary=mashSalary*1.1;
        double newDenisSalary=denisSalary*1.1;
        double newKristinaSalary=kristiyaSalary*1.1;
        double newMashaSalary12=newMashaSalary*12;
        double newDenisSalary12=newDenisSalary*12;
        double newKristinaSalary12=newKristinaSalary*12;
        double increaseMashaSalary=newMashaSalary12-oldMashaSalary12;
        double increaseDenisSalary=newDenisSalary12-oldDenisSalary12;
        double increaseKristinaSalary=newKristinaSalary12-oldKristinaSalsry12;
        System.out.println("Маша теперь получает "+newMashaSalary+" рублей. Годовой доход вырос на "+increaseMashaSalary+" рублей");
        System.out.println("Денис теперь получает "+newDenisSalary+" рублей. Годовой доход вырос на "+increaseDenisSalary+" рублей");
        System.out.println("Кристина теперь получает "+newKristinaSalary+" рублей. Годовой доход вырос на "+increaseKristinaSalary+" рублей");
    }
}
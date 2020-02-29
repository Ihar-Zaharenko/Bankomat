import java.util.Scanner;

public class Vvod_Money {
    int n = 0;
    int k = 0;
    int l = 0;
    int nom1=20;
    int nom2=50;
    public void vvod_withdrawal() {
        System.out.println("Введите  сумму которую хотите внести ");
        Scanner vvedennaia_summa = new Scanner(System.in);
        int number = vvedennaia_summa.nextInt();
        System.out.println("Выберите каким номиналом будите вводить деньги 20. 50. 100.");
        Scanner vibranii_nominal = new Scanner(System.in);
        int number1 = vibranii_nominal.nextInt();
        if (number1==nom1) {
            for (int i = 0; i < number; i = i + 20) {
                n++;
            }
            System.out.println("Сумма выдана номиналом 20р " + n + " раз");
        } else if (number1 ==nom2) {
            for (int i = 0; i < number; i = i + 50) {
                k++;
            }
            System.out.println("Сумма выдана номиналом 50р " + k + " раз");
        } else {
            for (int i = 0; i < number; i = i + 100) {
                l++;
            }
            System.out.println("Сумма выдана номиналом 100р " + l + " раз");
        }
    }
}

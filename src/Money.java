import java.util.Scanner;

public class Money {
    int n = 0;
    int k = 0;
    int l = 0;
    int nom1=20;
    int nom2=50;
    public void cash_withdrawal() {
        System.out.println("Введите  сумму которую хотите снять ");
        Scanner vvedennaia_summa = new Scanner(System.in);
        int number = vvedennaia_summa.nextInt();
        System.out.println("Вы ввели сумму для снятия " + number);
        System.out.println("Выберите номинал для выдачи денег 20. 50. 100.");
        Scanner vibranii_nominal = new Scanner(System.in);
        int number1 = vibranii_nominal.nextInt();
        System.out.println("Вы выбрали номинал для выдачи " + number1);
        if (number1==nom1) {
            for (int i = number; i > 0; i = i - 20) {
                n++;
            }
            System.out.println("Сумма выдана номиналом 20р " + n + " раз");
        } else if (number1 ==nom2) {
            for (int i = number; i > 0; i = i - 50) {
                k++;
            }
            System.out.println("Сумма выдана номиналом 50р " + k + " раз");
        } else {
            for (int i = number; i > 0; i = i - 100) {
                l++;
            }
            System.out.println("Сумма выдана номиналом 100р " + l + " раз");
        }
    }
}

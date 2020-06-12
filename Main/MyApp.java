package Main;
import Calculation.Calculation;
import java.util.Scanner;

/**
 * Calculation 패키지에 있는 Calculation 클래스의 메소드를 실행시키는 클래스
 * 
 * @author (2015225129 이재근, 2018315021 우메모토세이야 X, 2018315021 방대호) 
 * @version (2020.06.12)
 */ 
public class MyApp
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("나이와 구작 여부를 입력하시오: ");
        int age = scan.nextInt();
        boolean oldVideo = scan.nextBoolean();
        Calculation calc = new Calculation();
        double discountRate = calc.calculate(age, oldVideo);
        System.out.println("할인율: " + discountRate);
    }
}

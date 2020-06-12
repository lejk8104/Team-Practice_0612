package Calculation;


/**
 * 렌탈 DVD 할인요금을 계산하는 소프트웨어
 * 
 * @author (2018315034 정철우, 2018315038 이혜인, 2018315040 김선민) 
 * @version (2020.06.11)
 */
public class Calculation
{
    /**
     * 렌탈 DVD 할인요금을 계산하여 반환하는 메소드
     * 
     * @param age 나이 
     * @param oldVideo 구작 여부 / true: 구작, false: 신작
     * @return discountRate 할인요금
     */
    public double calculate(int age, boolean oldVideo){
        double discountRate = 0;
        if (oldVideo == true)
            discountRate = 0.5;

        else if (age <= 18)
            discountRate = 0.1;

        else if (age >= 65)
            discountRate = 0.2;

        return discountRate;
    }
}

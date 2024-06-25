public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.print("1. 매개변수 3개를 입력하여 Date 생성하고 출력하고 출력하기 : ");
        Date lastDayOfLastYear = new Date(2021, 12, 31);
        System.out.println(lastDayOfLastYear);
        //2. 문자열로 날짜를 입력하여 Date 생성
        System.out.print("2. 문자열로 날짜를 입력하여 Date 생성하고 출력하기 : ");
        Date firstDayOfThisYear = new Date("20220101");
        System.out.println(firstDayOfThisYear);
        //3. 작년 마지막 날짜에 하루 더함
        System.out.print("3. 작년 마지막 날짜에 하루 더해주고 출력하기 : ");
//        Date nextDate = Date.nextDate(lastDayOfLastYear, 1);
//        System.out.println(nextDate);
        //4. 올해 처음 날짜에 하루 빼주기
        System.out.print("4. 올해 처음 날짜에 하루 빼주고 출력하기 : ");
//        Date previousDate = Date.previousDate(firstDayOfThisYear, 1);
//        System.out.println(previousDate);
        //5. 오늘 날짜 생성하기
        System.out.print("5. 오늘 날짜 생성하고 출력하기 : ");
        Date today = Date.today();
        System.out.println(today);
        //6. 어제 날짜 생성하기
        System.out.print("6. 어제 날짜 생성하고 출력하기 : ");
        Date yesterday = Date.yesterday();
        System.out.println(yesterday);
        //7. 내일 날짜 생성하기
        System.out.print("7. 내일 날짜 생성하고 출력하기 : ");
        Date tomorrow = Date.tomorrow();
        System.out.println(tomorrow);
        //8. 어제에서 이틀 이동하여 내일 날짜와 같은지 비교하기
        System.out.print("8. 어제에서 이틀 이동하여 내일 날짜와 같은지 비교하기 : ");
//        System.out.println(Date.nextDate(yesterday, 2).equals(tomorrow));
        //9. 오늘이 어제보다 더 큰지 결과 출력하기
        System.out.print("9. 오늘이 어제보타 더 큰지 결과 출력하기 : ");
        System.out.println(today.isGreaterThan(yesterday));
        //10. 오늘이 내일보다 더 작은지 결과 출력하기
        System.out.print("10. 오늘이 내일보다 더 작은지 결과 출력하기 : ");
        System.out.println(today.isLowerThan(tomorrow));
        //11. 오늘이 어제랑 같은지 결과 출력하기
        System.out.print("11. 오늘이 어제랑 같은지 결과 출력하기 : ");
        System.out.println(today.equals(yesterday));
        //12. 오늘이 어제보다 작은지 결과 출력하기
        System.out.print("12. 오늘이 어제보다 작은지 결과 출력하기 : ");
        System.out.println(today.isLowerThan(yesterday));
        //13. 오늘이 어제보다 큰지 결과 출력하기
        System.out.print("13. 오늘이 어제보다 큰지 결과 출력하기 : ");
        System.out.println(today.isGreaterThan(tomorrow));
        //14. 오늘에서 17일 전으로 이동하고 결과 출력하기
        System.out.print("14. 오늘에서 17일 전으로 이동하고 결과 출력하기 : ");
//        previousDate = Date.previousDate(17);
//        System.out.println(previousDate);
        //15. 오늘에서 15일 이후로 이동하고 결과 출력하기
        System.out.print("15. 오늘에서 15일 이후로 이동하고 결과 출력하기 : ");
//        nextDate = Date.nextDate(15);
//        System.out.println(nextDate);
        //16. 오늘 날짜 복사하고 결과 출력하기
        System.out.print("16. 오늘 날짜 복사하고 결과 출력하기 : ");
        Date copyDate = today.clone();
        System.out.println(copyDate);

    }
}
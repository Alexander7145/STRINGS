public class Main {
    public static void main(String[] args) {
        //task1
        String firstMame = " Ivan ";
        String middleName = " Ivanovich ";
        String lastName = " Ivanov ";
        String fullName = firstMame + "" + middleName + "" + lastName;
        System.out.println(" Ф.И.О. сотрудника - " + fullName);
        //task2
        String fullNametoUpperCase = fullName.toUpperCase();
        System.out.println(" Данные Ф.И.О. сотрудника для заполнения отчете " + fullNametoUpperCase);
        //task3
        String newFullName = " Иванов Семён Семёнович ";
        System.out.println(" Данные Ф.И.О. сотрудника " + newFullName.replace('ё', 'е'
        ));


    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("домашка 6");
        task1();
        task2();
        task3();
    }
    public static void task1(){
        System.out.println( "задача 1");
        String firstName = " Ivan";
         String middleName = " Ivanovich";
             String lastName = " Ivanov" ;
             String fullName = lastName + firstName +middleName; //для хранения Ф. И. О. сотрудника в формате "Фамилия Имя
        System.out.println("ФИО сотрудника — " + fullName );
    }
    public static void task2(){
        System.out.println( "задача 2");
        String firstName = " ivan";
        String middleName = " Ivanovich";
        String lastName = " Ivanov" ;
        String fullName = lastName + firstName +middleName; //для хранения Ф. И. О. сотрудника в формате "Фамилия Имя
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase() );

    }
    public static void task3(){
        System.out.println( "задача 3");
       String firstName = " Семён ";
       String middleName = " Семёныч";
        String lastName = " иванов" ;
        String fullName = lastName + firstName +middleName;
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName.toUpperCase() );

    }
}

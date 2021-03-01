package WorkWithClasses;

public class Сотрудник
{
    String surnameNamePatronymic;
    String position;
    String email;
    String phone;
    String salary;
    int age;

    Сотрудник(String _surnameNamePatronymic,String _position, String _email, String _phone, String _salary, int _age)
    {
        this.surnameNamePatronymic = _surnameNamePatronymic;
        this.position = _position;
        this.email = _email;
        this.phone = _phone;
        this.salary = _salary;
        this.age = _age;

        outputInformation();
    }

    public void outputInformation()
    {
        System.out.println(" Создан следующий новый объект в классе \"Сотрудник\":\n");
        System.out.println("       ФИО: " + this.surnameNamePatronymic);
        System.out.println(" Должность: " + this.position);
        System.out.println("    e-mail: " + this.email);
        System.out.println("   Телефон: " + this.phone);
        System.out.println("  Зарплата: " + this.salary);
        System.out.println("   Возраст: " + this.age);
    }

}

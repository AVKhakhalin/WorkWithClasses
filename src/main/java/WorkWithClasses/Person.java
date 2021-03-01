package WorkWithClasses;

public class Person
{
    String surnameName;
    String position;
    String email;
    String phone;
    String salary;
    int age;

    Person ()
    {
    }

    Person (String _surnameName, String _position, String _email, String _phone, String _salary, int _age)
    {
        this.surnameName = _surnameName;
        this.position = _position;
        this.email = _email;
        this.phone = _phone;
        this.salary = _salary;
        this.age = _age;
    }

    public void outputPerson()
    {
        System.out.println(" Фамилия Имя: " + this.surnameName);
        System.out.println("      Должность: " + this.position);
        System.out.println("         e-mail: " + this.email);
        System.out.println("        Телефон: " + this.phone);
        System.out.println("       Зарплата: " + this.salary);
        System.out.println("        Возраст: " + this.age);
    }

    public int getAge()
    {
        return age;
    }
}

package termpaper;

public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private int department;
    private int salary;
    private int id;
    private static int counter = 1;


    public Employee(String name, String surname, String patronymic, int department, int salary) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        id= counter++;

    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId(){return id; }

    public static int getCounter() { return counter;}



    public void setDepartment (int department){
        this.department= department;
    }

    public void setSalary (int salary){
        this.salary= salary;
    }

    @Override
    public String toString() {
        return ("id №"+getId()+ "Ф.И.О." +getName() + " "+ getSurname()+ " "+ getPatronymic()+ " Зарплата " + getSalary()+ " Отдел" + getDepartment() );
    }

    public int salaryAmount() {
        int sum = 0;
        for (int i = 0; i < getSalary(); i++) {
            sum += getSalary();
        }
        return sum;
    }

    public static void getArray(int[]empCorp){
        for(int i = 0; i < empCorp.length; i++)
            return;
        }

    }


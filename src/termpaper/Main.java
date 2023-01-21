package termpaper;

import java.util.Arrays;

public abstract class Main {
    private final static Employee[] empCorp = new Employee[10];


    public static void main(String[] args) {
        listWorkers();
        total();
        minSalary ();
        maxSalary();
        averageValue();
        fullName();

    }

    private static void listWorkers() {
        empCorp[0] = new Employee("Иван", "Иванов", "Сергеевич", 1, 20000);
        empCorp[1] = new Employee(" Петр", "Петров", "Анатольевич", 2, 25000);
        empCorp[2] = new Employee(" Василий", "Сидоров", "Иванович", 3, 30000);
        empCorp[3] = new Employee("Надежда", "Пубкина", "Михайловна", 4, 35000);
        empCorp[4] = new Employee("Владислав", "Жуков", "Дмитриевич", 5, 40000);
        empCorp[5] = new Employee("Марина", "Мариновна", "Александровна", 3, 45000);
        empCorp[6] = new Employee("Виталий", "Кислов", "Дмитриевич", 4, 50000);
        empCorp[7] = new Employee("Катерина", "Катруктовна", "Петровна", 2, 55000);
        empCorp[8] = new Employee("Дмитрий", "Жуков", "Дмитриевич", 1, 60000);
        empCorp[9] = new Employee("Виталий", "Виталов", "Петрович", 2, 65000);
        System.out.println(Arrays.toString(empCorp));
    }

    private static void total() {
        int total = 0;
        for (int i = 0; i < empCorp.length; i++) {
            total = total+ empCorp[i].getSalary();
            System.out.println("Затраты=" + total);}
    }

    private static void minSalary() {
        int minSalary = empCorp[0].getSalary();
        String name = null;
        for (int i = 0; i < empCorp.length; i++) {
            if (minSalary >= empCorp[i].getSalary()) {
                name = empCorp[i].getName() + empCorp[i].getSurname();
            }
        }
        System.out.println("Ф.И.=" + name + "  Мин. зп. =" + minSalary);
    }

    private static void maxSalary() {
        int maxSalary = empCorp[0].getSalary();
        String name = null;
        for (int i=0;i< empCorp.length; i++){
            if(maxSalary< empCorp[i].getSalary()){
                maxSalary=empCorp[i].getSalary();
                name = empCorp[i].getName() + empCorp[i].getSurname();
            }
        }
        System.out.println("Ф.И.=" + name + "  Макс. зп. =" + maxSalary);
    }

    private static void averageValue() {
        int total = 0;
        for (int i = 0; i < empCorp.length; i++) {
            total += empCorp[i].getSalary();}
            System.out.println("Средняя зп" + total/ Employee.getCounter() );}


    private static void fullName() {
        for (Employee employee : empCorp){
            System.out.println(employee.getName() + employee.getSurname());
        }
    }
}




/*
}

        private static void minSalary () {
            int minSalary = empCorp[0].getSalary();
            String name = null;
            for (int i = 0; i < empCorp.length; i++) {
                if (minSalary >= empCorp[i].getSalary()) {
                    name = empCorp[i].getName() + empCorp[i].getSurname();
                }
            }
            System.out.println("Ф.И.=" + name + "Мин. зп. =" + minSalary);
        }
    }
}
*/





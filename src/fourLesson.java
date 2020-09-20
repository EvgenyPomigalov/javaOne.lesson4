public class fourLesson {
    public static void main(String[] args){
        //Задание 4
        Employee emp1 = new Employee("Kovalev A.A.", 47598, 1950);
        Employee emp2 = new Employee("Grigorev R.T.", 45768, 1987);
        System.out.printf("Employee FIO: %s, age: %d\n",
                emp1.getFio(), emp1.getAge());
        System.out.printf("Employee FIO: %s, age: %d\n",
                emp2.getFio(), emp2.getAge());

        //Задание 5
        Employee[] employees = new Employee [5];
        employees[0]  = new Employee("Ivanov I.I.", 50000,1980);
        employees[1] = new Employee("Petrov P.P.", 25000,1991);
        employees[2] = new Employee("Sidorov S.S.", 46000,1974);
        employees[3] = new Employee("Bukin G.G.", 18562,1969);
        employees[4] = new Employee("Vasechkin V.I.", 78467,1985);
        printEmployesArray(employees);

        //Задание 6
        incrementSalary(employees, 45, 5000);
        printEmployesArray(employees);

        //Задание 7
        double sum = 0;
        for (int i = 0; i< employees.length; i++){
           sum += employees[i].getAge();
        }
        double middleAge = sum / employees.length;
        System.out.println("Средний возраст = " + middleAge);
        sum = 0;
        for (int i = 0; i < employees.length; i++){
            sum += employees[i].getSalary();
        }
        double middleSalary = sum / employees.length;
        System.out.println("Средняя зарплата = " + middleSalary);

    }

    private static void printEmployesArray(Employee[] employees) {
        for (int i = 0; i< employees.length; i++) {
            System.out.printf("Number: %d, Employee FIO: %s, salary: %g, age: %d\n", employees[i].getId(), employees[i].getFio(), employees[i].getSalary(), employees[i].getAge());
        }
    }

    private static void incrementSalary(Employee[] arr, int rangeAge, double incrementValue) {
        for (int i = 0; i<arr.length; i++){
            if (arr[i].getAge() > rangeAge) arr[i].incrementSalary(incrementValue);
        }
    }

}

import java.util.*;
    /*定义一个Employee类,属性:name:String,age:int,salary:double */
    public class Employee {
        private String name;
        private int age;
        private double salary;

        public Employee() {
        }

        public Employee(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "name=" + name + ", age=" + age + ", salary=" + salary;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return age == employee.age &&
                    Double.compare(employee.salary, salary) == 0 &&
                    Objects.equals(name, employee.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, salary);
        }

        public List<Employee> paixu(List<Employee> list) {
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    Employee s1 = list.get(i);
                    Employee s2 = list.get(j);
                    if (s1.getSalary() < s2.getSalary()) {
                        list.set(i, s2);
                        list.set(j, s1);
                    } else if (s1.getSalary() == s2.getSalary()) {
                        if (s1.getAge() < s2.getAge()) {
                            list.set(i, s2);
                            list.set(j, s1);
                        } else if (s1.getAge() == s2.getAge()) {
                            if (s1.getName().compareTo(s2.getName()) > 0) {
                                list.set(i, s2);
                                list.set(j, s1);
                            }
                        }
                    }
                }
            }
            return list;
        }
    }





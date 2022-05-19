import java.util.*;
public class Test {
    public static void main(String args[]){
/*定义一个Employee类,属性:name:String,age:int,salary:double
把若干Employee对象放在List中,排序并遍历输出,
排序规则:salary高的在前面,salary相同时age大的在前面,age也相同时按照name升序排列
把若干Employee对象放在Set中并遍历,要求没有重复元素*/
                Employee em=new Employee();
                List<Employee> list=new ArrayList<Employee>();
                list.add(new Employee("z张三", 20, 4000));
                list.add(new Employee("l李四", 35, 3000));
                list.add(new Employee("w王二", 20, 30000));
                list.add(new Employee("x小明", 30, 30000));
                list.add(new Employee("a小兰", 30, 30000));
                list.add(new Employee("a小兰", 30, 30000));

                for (Employee employee : list) {
                    System.out.println(employee);
                }
                System.out.println("=================================");
                em.paixu(list);//调用排序方法
                for (Employee employee : list) {
                    System.out.println(employee);
                }
                System.out.println("=================================");

                Set<Employee> set1=new HashSet<Employee>();
                //Set set2=new HashSet();
                //Set<Employee> set3=new HashSet<Employee>();
                set1.addAll(list);//把若干Employee对象放在Set1中
                for (Employee employee : set1) {
                    /*boolean b1=set2.add(employee.getName());
                    boolean b2=set2.add(employee.getAge());
                    boolean b3=set2.add(employee.getSalary());
                    if(!b1||!b2||!b3) {
                        //set3.add(employee);//找出有重复元素的对象
                    }
                }
                set1.removeAll(set3);*///移除重复元素的对象
                //for (Employee employee : set1) {
                    System.out.println(employee);
                }
            }
        }



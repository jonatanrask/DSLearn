package application;
/*
Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada.
 */
import entities.Employee;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee();
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("\nEmployee #" + (i + 1));
            System.out.print("id: ");
            int id = sc.nextInt();
            while (Employee.hasId(employees,id)){
                System.out.print("Id already taken. Try again: ");
                sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Name: ");

            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
            }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null){
            System.out.println("This ID does not exist!");
        }
        else{
            System.out.print("Enter de porcentage: ");
            double porcentage = sc.nextDouble();
            emp.increaseSalary(porcentage, emp.getSalary());
        }
        System.out.println("\nList of employees:");
        for (Employee obj : employees) {
            System.out.println(obj);

        }
        sc.close();
    }

}

package org.example;

public class Worker
{
    private String name;
    private Department department;

    public Worker(String name, Department department) {
        this.name = name;
        this.department = department;
    }
    public String getName(){
        return name;
    }
    public Department getDepartment(){
        return department;
    }
    @Override //анотация
    public String toString(){
        return "Имя сотрудника: "+name+", отдел: "+department;
    }
}

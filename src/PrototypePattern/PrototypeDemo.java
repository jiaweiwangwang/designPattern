package PrototypePattern;

import org.junit.Test;

public class PrototypeDemo {
    @Test
    public void run(){
        Resume resume = new Resume();
        resume.setAge(12);
        resume.setName("Wang Jia");
        Resume resumeOne = resume.clone();
        System.out.println(resumeOne.getAge()+"::"+resumeOne.getName());
    }
}

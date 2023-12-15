
import java.util.Scanner;
class Inheristance {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.println("Choose employee type (Teacher, Typist, Officer, Regular, Casual): ");
      String type = sc.nextLine();

      System.out.println("Enter code name: ");
      String codeName = sc.nextLine();

     System.out.println("Enter code: ");
     int code = sc.nextInt();

      Staff staff;
        switch (type.toLowerCase()) {
            case "teacher":
                System.out.println("Enter subject: ");
                String subject = sc.nextLine();
                staff = new Teacher(codeName, code, subject);
                break;
            case "typist":
                System.out.println("Enter typing speed (wpm): ");
                int speed = sc.nextInt();
                staff = new Typist(codeName, code, speed);
                break;
            case "officer":
                System.out.println("Enter grade: ");
                int grade = sc.nextInt();
                staff = new Officer(codeName, code, grade);
                break;
            case "regular":
                System.out.println("Enter salary: ");
                double salary = sc.nextDouble();
                staff = new Regular ( codeName,  code,  salary);

    }
}
}

class Staff {
    private String codeName;
    private int code;

    public Staff(String codeName, int code) {
        this.codeName = codeName;
        this.code = code;
    }

    public String getCodeName() {
        return codeName;
    }

    public int getCode() {
        return code;
    }

    public String toString() {
        return "Code Name: " + codeName + ", Code: " + code;
    }
}
class Teacher extends Staff {
    private String subject;

    public Teacher(String codeName, int code, String subject) {
        super(codeName, code);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    
    public String toString() {
        return super.toString() + ", Subject: " + subject;
    }
}
class Typist extends Staff {
    private int speed;

    public Typist(String codeName, int code, int speed) {
        super(codeName, code);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    
    public String toString() {
        return super.toString() + ", Speed: " + speed;
    }
}
class Officer extends Staff {
    private int grade;

    public Officer(String codeName, int code, int grade) {
        super(codeName, code);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    
    public String toString() {
        return super.toString() + ", Grade: " + grade;
    }
}
class Regular extends Staff {
    private double salary;

    public Regular(String codeName, int code, double salary) {
        super(codeName, code);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    
    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }
}
class Casual extends Staff {
    private double dailyWages;

    public Casual(String codeName, int code, double dailyWages) {
        super(codeName, code);
        this.dailyWages = dailyWages;
    }

    public double getDailyWages() {
        return dailyWages;
    }

    
    public String toString() {
        return super.toString() + ", Daily Wages: " + dailyWages;
    }
}

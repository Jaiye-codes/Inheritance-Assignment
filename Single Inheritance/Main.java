class Student {
    public void activities() {
        System.out.println("Goes to Class\nGoes for services\nStudies book");
    }
}

// HundredLevel.java
class HundredLevel extends Student {
    String matricNumber = "23CD003456";
    int regNumber = 2300284;

    public void stuDetails() {
        System.out.println("Matriculation number: " + matricNumber);
        System.out.println("Registration number: " + regNumber);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        HundredLevel fresher = new HundredLevel();
        
        fresher.activities();
        fresher.stuDetails();
    }
}
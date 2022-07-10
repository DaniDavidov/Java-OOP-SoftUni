package T01WorkingWithAbstraction.E03StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem()
    {
        this.repo = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }

    public void ExecuteCommand(String[]args)
    {
//        Scanner scanner = new Scanner(System.in);
//        String[] args = scanner.nextLine().split(" ");

        if (args[0].equals("Create")) {
            String name = args[1];
            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);
            repo.putIfAbsent(name, new Student(name, age, grade));
        } else if (args[0].equals("Show")) {
            String name = args[1];

            if (repo.containsKey(name)) {
                Student student = repo.get(name);
                String view = String.format("%s is %s years old.",student.getName(),student.getAge());

                if (student.getGrade() >= 5.00) {
                    view += " Excellent student.";
                }
                else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                    view += " Average student.";
                } else {
                    view += " Very nice person.";
                }

                System.out.println(view);
            }
        }
    }
}

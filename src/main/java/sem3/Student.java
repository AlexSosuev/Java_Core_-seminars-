package sem3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Student {
    private String name;
    private List<Double> grades;
    private String speciality;

    @Override
    public String toString() {
        return "name: " + getName() + ", grades: " + getGrades() + ", speciality: " + getSpeciality();
    }

    public static List<Student> getAverageGrade(List<Student> students){
        return students.stream()
                        .filter(x-> x.getSpeciality()
                        .equalsIgnoreCase("ИНФОРМАТИКА") && x.getGrades().stream()
                                .mapToDouble(e -> e)
                                .average().orElse(0) >= 4.5)
                        .limit(5)
                        .toList();
    }
}
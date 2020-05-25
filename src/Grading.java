import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Grading {
    public static void main(String[] args) {
        int[] arr =  {73, 67, 38, 33};
         List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
       // System.out.println(gradingStudents(list));
        System.out.println(gradingStudents123(list));

    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<grades.size(); i++){
            if (grades.get(i)>=38 && grades.get(i) % 5 > 2){
                int num = grades.get(i)+ (5 -(grades.get(i) % 5));
                list.add(i, num);
            }
            else
                list.add(grades.get(i));
        }
        return list;
    }
    public static List<Integer> gradingStudents123(List<Integer> grades) {
        for(int i =0; i<grades.size(); i++){
            if (grades.get(i)>=38 && grades.get(i) % 5 > 2){
                int num = grades.get(i)+ (5 -(grades.get(i) % 5));
                grades.remove(i);
                grades.add(i,num);
            }
        }
        return grades;
    }
}

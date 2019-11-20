package Ex_9;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class DirWorker {

    private List<String> fileGroup = new ArrayList<>();
    private String directory;

    public DirWorker(String directory){
        this.directory = directory;
    }

    public List groupsList() {
        File dir = new File(directory);
        for (File fileEntry : dir.listFiles()) {
            if (fileEntry.isFile() && fileEntry.getName().endsWith(".csv")) {
                this.fileGroup.add(fileEntry.getName().replace(".csv", ""));
            }
//            else {
//                System.out.println("Нет файлов в указонной директории.");
//                return null;
//            }
        }
        return this.fileGroup;
    }

    public List studentList() throws IOException {
        List<String> groupList = new ArrayList<>();
        groupList = this.groupsList();
        List<Student> studentsList = new ArrayList<Student>();
        for (int i = 0; i < groupList.size(); i++) {
            List<String> lines = Files.readAllLines(Paths
                    .get("C:/Users/User/Desktop/Students/" + groupList.get(i) + ".csv"), StandardCharsets.UTF_8);
            for (int j = 0; j < lines.size(); j++) {
                List<String> studentInfo = Arrays.asList(lines.get(j).split(","));
                Student student = new Student(groupList.get(i),
                        studentInfo.get(0),
                        studentInfo.get(1),
                        studentInfo.get(2),
                        studentInfo.get(3));
                studentsList.add(student);
            }
        }
        return studentsList;
    }

//
//    public Map mapGroup() throws IOException {
//        List<String> groupList = new ArrayList<>();
//        groupList = this.fileList();
//        Map<String, List<List<String>>> = new HashMap<>();
//        for (int i = 0; i < groupList.size(); i++) {
//            List<String> lines = Files.readAllLines(Paths
//                    .get("C:/Users/User/Desktop/Students/" + groupList.get(i) + ".csv"), StandardCharsets.UTF_8);
//            for (int j = 0; j < lines.size(); j++) {
//                List<String> student = Arrays.asList(lines.get(j).split(","));
//                if(!lists.containsKey(groupList.get(i))){
//                    List<List<String>> group = new ArrayList<>();
//                    group.add(student);
//                    lists.put(groupList.get(i), group);
//                }else{
//                    List<List<String>> group =  lists.get(groupList.get(i));
//                    group.add(student);
//                    lists.put(groupList.get(i), group);
//                }
//            }
//        }
//        return lists;
//    }
}




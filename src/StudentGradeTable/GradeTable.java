package StudentGradeTable;
import java.util.*;
public class GradeTable {
    
        Scanner userInput = new Scanner(System.in);
        private String enterGrades;

        private String studentName;
        private int subject1;
        private int subject2;
        private int subject3;

        private int total;
        private double average;
        private int position;

        public GradeTable(String name,int sub1, int sub2, int sub3, int total, double avg, int pos){
            this.studentName = name;
            this.subject1 =sub1;
            this.subject2 = sub2;
            this.subject3 = sub3;
            this.total = total;
            this.average = avg;
            this.position = pos;
        }

        public String toString(){
            return "\t" + studentName + "\t\t" + subject1 + "\t\t" + subject2 + "\t\t" + subject3 + "\t\t" + total + "\t\t" + average + "\t\t" + position;
        }

        public void setStudentName(String name){this.studentName = name;}
        public String getStudentName(){ return studentName; }

        public void setFirstSub(int sub){this.subject1 = sub;}
        public int getFirstSub(){return  subject1;}

        public void setSecondSub(int sub){this.subject2 = sub;}
        public int getSecondSub(){return  subject2;}

        public void setThirdSub(int sub){this.subject3 = sub;}
        public int getThirdSub(){return  subject3;}

        public void setTotal(int totalGrades){this.total = totalGrades; }
        public int getTotal(){return total;}

        public void setAverage(int avg){this.average = avg;}
        public double getAverage(){return average;}

        public void setPosition(int pos){this.position = pos;}
        public int getPosition(){return position;}



        public void GradeTable() {
            ArrayList<GradeTable> myStudents = new ArrayList<>();
            GradeTable students = new GradeTable("John", 10, 20, 30, 60, 30, 1);
            int subjectOneTotal = 0;
            int countPasses = 0;
            int countFailures = 0;


            String doubleLine = "===========================================================";

            do{
                System.out.println();
                System.out.print("Enter Student name: ");
                String studentNames = userInput.nextLine();
                students.setStudentName(studentNames);

                System.out.print("ENTER GRADES FOR SUBJECT 1: ");
                int gradesA = userInput.nextInt();
                students.setFirstSub(gradesA);

                subjectOneTotal += gradesA;
//            subjectOneAverage = subjectOneTotal
                // if(gradesA > 50){System.out.print(++countPasses);}

                System.out.print("ENTER GRADES FOR SUBJECT 2: ");
                int gradesB = userInput.nextInt();
                students.setSecondSub(gradesB);

                System.out.print("ENTER GRADES FOR SUBJECT 3: ");
                int gradesC = userInput.nextInt();
                students.setThirdSub(gradesC);

                int totalGrades = gradesA + gradesB + gradesC;
                int averages = totalGrades / 3;

                students.setTotal(totalGrades);
                students.setAverage(averages);

                myStudents.add(new GradeTable(studentNames, gradesA, gradesB, gradesC, totalGrades, averages,position ));
                System.out.println(doubleLine);
                System.out.printf("%S\t\t\t%S\t\t%S\t%S\t%S\t%S\t\t%S\n", "student", "sub1", "sub2", "sub3", "tot", "ave", "pos");
                System.out.println(doubleLine);

                myStudents.sort(Comparator.comparing(a -> -a.average));

                int count = 1;
                for (GradeTable tables : myStudents) {
                    tables.setPosition(count++);
                    System.out.println(tables);
                }

                System.out.println(doubleLine);
                System.out.println(doubleLine);

                System.out.print("Keep entering grades? ");
                userInput.nextLine();
                enterGrades = userInput.nextLine();

//            System.out.println("Number of passes: " + ++countPasses);
                //   }
            } while (Objects.equals(enterGrades, "yes"));

            System.out.println("SUBJECT SUMMARY");
            System.out.println("SUBJECT 1");

            System.out.print("Highest scoring student is: ");
            GradeTable maxValue = myStudents.stream().max(Comparator.comparing(v -> v.getFirstSub())).get();
            System.out.println(maxValue.studentName + " Scoring " + maxValue.subject1);

            System.out.print("Lowest scoring student is: ");
            GradeTable minValue = myStudents.stream().min(Comparator.comparing(v -> v.getFirstSub())).get();
            System.out.println(minValue.studentName + " Scoring " + minValue.subject1);

            int avgScore = subjectOneTotal / myStudents.size();

            System.out.print("Average score is: ");
            System.out.println(avgScore);

            System.out.print("Total score is: ");
            System.out.println(subjectOneTotal);


//        if(maxValue.subject1 > 50){
//            countPasses +=1;
//            System.out.println("Number of passes: " + ++countPasses);
//        }

            if(maxValue.subject1 < 50){ System.out.print("Number of failures: " + ++countFailures);}


        }

        public static void main(String[] args) {
            GradeTable students = new GradeTable("John",10,20,30,60,30,1);
            students.GradeTable();
        }
    }



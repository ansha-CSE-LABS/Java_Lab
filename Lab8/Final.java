import CIE.*;
import SEE.*;
import java.util.Scanner;

public class Final {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i, j;
        System.out.println("Enter the number of students:");
        n = scan.nextInt();

        CIE.Student[] student =new CIE.Student[n];
        CIE.Internals[] cie = new CIE.Internals[n];
        SEE.External[] see = new SEE.External[n];
        
        for (i = 0; i < n; i++) {
            student[i]=new CIE.Student();
            cie[i] = new CIE.Internals();
            see[i] = new SEE.External();
            student[i].accept();
            cie[i].accept_cie();
            see[i].accept_see();
        }

        for (i = 0; i < n; i++) {
            student[i].display();
            for (j = 0; j < 5; j++) {
                System.out.println("Final marks in subject" + (j + 1) + " : "
                        + (cie[i].cie_marks[j] + ((see[i].see_marks[j]) / 2.0)));
            }
            System.out.println();
        }
    }
}

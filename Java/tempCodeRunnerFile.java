
import java.util.Scanner;

public class MarkSheet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ================= HEADER =====================
        System.out.println("=======================================================================================================================");
        System.out.println("               Dedan Kimathi University of Technology");
        System.out.println("           School of Computer Science and Information Technology");
        System.out.println("                   Department of Computer Science");
        System.out.println("                    Academic Year: 2024/2025");
        System.out.println("             STUDENT MARKSHEET (SECOND YEAR RESULTS)");
        System.out.println("=======================================================================================================================");

        // ================= INPUT STUDENTS =====================
        // STUDENT 1
        System.out.println("\nEnter details for Student 1:");
        System.out.print("Registration Number: ");
        String reg1 = input.nextLine();
        System.out.print("Full Name: ");
        String name1 = input.nextLine();
        System.out.print("CCS2207: ");  int s1_ccs2207 = input.nextInt();
        System.out.print("SMA2207: ");  int s1_sma2207 = input.nextInt();
        System.out.print("CCS2208: ");  int s1_ccs2208 = input.nextInt();
        System.out.print("CCS2209: ");  int s1_ccs2209 = input.nextInt();
        System.out.print("CCS2210: ");  int s1_ccs2210 = input.nextInt();
        System.out.print("CCS2211: ");  int s1_ccs2211 = input.nextInt();
        System.out.print("IGS2202: ");  int s1_igs2202 = input.nextInt();
        int total1 = s1_ccs2207 + s1_sma2207 + s1_ccs2208 + s1_ccs2209 + s1_ccs2210 + s1_ccs2211 + s1_igs2202;
        double avg1 = Math.round(total1 / 7.0 * 10) / 10.0; // 1 decimal
        input.nextLine(); // clear buffer

        // STUDENT 2
        System.out.println("\nEnter details for Student 2:");
        System.out.print("Registration Number: ");
        String reg2 = input.nextLine();
        System.out.print("Full Name: ");
        String name2 = input.nextLine();
        System.out.print("CCS2207: ");  int s2_ccs2207 = input.nextInt();
        System.out.print("SMA2207: ");  int s2_sma2207 = input.nextInt();
        System.out.print("CCS2208: ");  int s2_ccs2208 = input.nextInt();
        System.out.print("CCS2209: ");  int s2_ccs2209 = input.nextInt();
        System.out.print("CCS2210: ");  int s2_ccs2210 = input.nextInt();
        System.out.print("CCS2211: ");  int s2_ccs2211 = input.nextInt();
        System.out.print("IGS2202: ");  int s2_igs2202 = input.nextInt();
        int total2 = s2_ccs2207 + s2_sma2207 + s2_ccs2208 + s2_ccs2209 + s2_ccs2210 + s2_ccs2211 + s2_igs2202;
        double avg2 = Math.round(total2 / 7.0 * 10) / 10.0;
        input.nextLine();

        // STUDENT 3
        System.out.println("\nEnter details for Student 3:");
        System.out.print("Registration Number: ");
        String reg3 = input.nextLine();
        System.out.print("Full Name: ");
        String name3 = input.nextLine();
        System.out.print("CCS2207: ");  int s3_ccs2207 = input.nextInt();
        System.out.print("SMA2207: ");  int s3_sma2207 = input.nextInt();
        System.out.print("CCS2208: ");  int s3_ccs2208 = input.nextInt();
        System.out.print("CCS2209: ");  int s3_ccs2209 = input.nextInt();
        System.out.print("CCS2210: ");  int s3_ccs2210 = input.nextInt();
        System.out.print("CCS2211: ");  int s3_ccs2211 = input.nextInt();
        System.out.print("IGS2202: ");  int s3_igs2202 = input.nextInt();
        int total3 = s3_ccs2207 + s3_sma2207 + s3_ccs2208 + s3_ccs2209 + s3_ccs2210 + s3_ccs2211 + s3_igs2202;
        double avg3 = Math.round(total3 / 7.0 * 10) / 10.0;
        input.nextLine();

        // STUDENT 4
        System.out.println("\nEnter details for Student 4:");
        System.out.print("Registration Number: ");
        String reg4 = input.nextLine();
        System.out.print("Full Name: ");
        String name4 = input.nextLine();
        System.out.print("CCS2207: ");  int s4_ccs2207 = input.nextInt();
        System.out.print("SMA2207: ");  int s4_sma2207 = input.nextInt();
        System.out.print("CCS2208: ");  int s4_ccs2208 = input.nextInt();
        System.out.print("CCS2209: ");  int s4_ccs2209 = input.nextInt();
        System.out.print("CCS2210: ");  int s4_ccs2210 = input.nextInt();
        System.out.print("CCS2211: ");  int s4_ccs2211 = input.nextInt();
        System.out.print("IGS2202: ");  int s4_igs2202 = input.nextInt();
        int total4 = s4_ccs2207 + s4_sma2207 + s4_ccs2208 + s4_ccs2209 + s4_ccs2210 + s4_ccs2211 + s4_igs2202;
        double avg4 = Math.round(total4 / 7.0 * 10) / 10.0;
        input.nextLine();

        // STUDENT 5
        System.out.println("\nEnter details for Student 5:");
        System.out.print("Registration Number: ");
        String reg5 = input.nextLine();
        System.out.print("Full Name: ");
        String name5 = input.nextLine();
        System.out.print("CCS2207: ");  int s5_ccs2207 = input.nextInt();
        System.out.print("SMA2207: ");  int s5_sma2207 = input.nextInt();
        System.out.print("CCS2208: ");  int s5_ccs2208 = input.nextInt();
        System.out.print("CCS2209: ");  int s5_ccs2209 = input.nextInt();
        System.out.print("CCS2210: ");  int s5_ccs2210 = input.nextInt();
        System.out.print("CCS2211: ");  int s5_ccs2211 = input.nextInt();
        System.out.print("IGS2202: ");  int s5_igs2202 = input.nextInt();
        int total5 = s5_ccs2207 + s5_sma2207 + s5_ccs2208 + s5_ccs2209 + s5_ccs2210 + s5_ccs2211 + s5_igs2202;
        double avg5 = Math.round(total5 / 7.0 * 10) / 10.0;

        // ================= OUTPUT =====================
        System.out.println("\n=======================================================================================================================");
        System.out.println("Reg No.\t\t\tFull Name\t\t\tCCS2207\tSMA2207\tCCS2208\tCCS2209\tCCS2210\tCCS2211\tIGS2202\tXX\tTotal\tAverage");
        System.out.println("=======================================================================================================================");

        // Multiple \t to align columns
        System.out.println(reg1 + "\t" + name1 + "\t\t" + s1_ccs2207 + "\t" + s1_sma2207 + "\t" + s1_ccs2208 + "\t" + s1_ccs2209 + "\t" + s1_ccs2210 + "\t" + s1_ccs2211 + "\t" + s1_igs2202 + "\tXX\t" + total1 + "\t" + avg1);
        System.out.println(reg2 + "\t" + name2 + "\t\t" + s2_ccs2207 + "\t" + s2_sma2207 + "\t" + s2_ccs2208 + "\t" + s2_ccs2209 + "\t" + s2_ccs2210 + "\t" + s2_ccs2211 + "\t" + s2_igs2202 + "\tXX\t" + total2 + "\t" + avg2);
        System.out.println(reg3 + "\t" + name3 + "\t\t" + s3_ccs2207 + "\t" + s3_sma2207 + "\t" + s3_ccs2208 + "\t" + s3_ccs2209 + "\t" + s3_ccs2210 + "\t" + s3_ccs2211 + "\t" + s3_igs2202 + "\tXX\t" + total3 + "\t" + avg3);
        System.out.println(reg4 + "\t" + name4 + "\t\t" + s4_ccs2207 + "\t" + s4_sma2207 + "\t" + s4_ccs2208 + "\t" + s4_ccs2209 + "\t" + s4_ccs2210 + "\t" + s4_ccs2211 + "\t" + s4_igs2202 + "\tXX\t" + total4 + "\t" + avg4);
        System.out.println(reg5 + "\t" + name5 + "\t\t" + s5_ccs2207 + "\t" + s5_sma2207 + "\t" + s5_ccs2208 + "\t" + s5_ccs2209 + "\t" + s5_ccs2210 + "\t" + s5_ccs2211 + "\t" + s5_igs2202 + "\tXX\t" + total5 + "\t" + avg5);

        System.out.println("=======================================================================================================================");
    }
}


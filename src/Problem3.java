import java.util.*;
public class Problem3 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Number of candidates: ");
        int n = in.nextInt();

        System.out.print("Number  of vaccines: ");
        int v = in.nextInt();

        System.out.print("Vaccine limitto age group: ");
        int g = in.nextInt();

        int noWomen = (int) Math.floor(n / 3);
        int noMen = n - noWomen;

        int vacineToWomen = (int) Math.floor(n / 2);
        int vacineToMen = v - vacineToWomen;

        System.out.printf("Total Men: %d\n", noMen);
        System.out.printf("Total Women: %d\n", noWomen);

        System.out.printf("Vaccines allocated for men: %d\n", vacineToMen);
        System.out.printf("Vaccines allocated for women:  %d\n", vacineToWomen);


        List<Men> men = new ArrayList(noMen);
        List<Women> women = new ArrayList(noWomen);

        for (int i = 0; i < noMen; i++) {
            System.out.printf("Input Age of Men %d: ", (i + 1));
            men.add(new Men(in.nextInt()));
        }

        for (int i = 0; i < noWomen; i++) {
            System.out.printf("Input Age of Women %d: ", (i + 1));
            women.add(new Women(in.nextInt()));
        }

        Collections.sort(men, new Comparator<Men>() {
            @Override
            public int compare(Men o1, Men o2) {
                return o1.age - o2.age;
            }
        });


        Collections.sort(women, new Comparator<Women>() {
            @Override
            public int compare(Women o1, Women o2) {
                return o1.age - o2.age;
            }
        });


        men.forEach(man -> {

        });



        women.forEach(man -> {

        });


    }

    static class AgeGroup {
        int group, number;
    }

    static abstract class People {
        private String sex;
        private int age;

    }

    static class Men extends People {
        private String sex;
        private int age;

        public Men(int age) {
            this.sex = "Male";
            this.age = age;
        }
    }

    static class Women extends People {
        private String sex;
        private int age;

        public Women(int age) {
            this.sex = "Female";
            this.age = age;
        }
    }
}



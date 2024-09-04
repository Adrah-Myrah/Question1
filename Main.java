public class Main {
    public static void main(String[] args) {
        Job job1 = new Job();
        String Title = job1.returnJobTitle();
        System.out.println("Job Title is" + Title);
        Job.returnJobDescription();

        Book one = new Book();
        Book.showBookNumber();

    }
}

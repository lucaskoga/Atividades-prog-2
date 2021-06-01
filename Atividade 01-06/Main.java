public class Main {
    public static void main(String[] args) {
        Data dat1 = new Data();
        Data dat2 = new Data(2021);
        Data dat3 = new Data(01,06,2021);

        System.out.println(dat1.formatarData());
        System.out.println(dat2.formatarData());
        System.out.println(dat3.formatarData());
    }
}

public class Main
{
    public static void main(String[] args)
    {
        AppointmentBook a = new AppointmentBook();
        System.out.println(a.findFreeBlock(2, 15));
        System.out.println(a.findFreeBlock(2, 9));
        System.out.println(a.findFreeBlock(2, 20));
    }
}
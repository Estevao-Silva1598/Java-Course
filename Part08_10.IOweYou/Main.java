
public class Main {

    public static void main(String[] args) {
        IOU jacksIOU = new IOU();
        jacksIOU.setSum("Artur", 59.5);
        jacksIOU.setSum("Artur", 30);
        jacksIOU.setSum("Miguel", 990);
        

        System.out.println(jacksIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(jacksIOU.howMuchDoIOweTo("Michael"));
        System.out.println(jacksIOU.howMuchDoIOweTo("Miguel"));
    }
}

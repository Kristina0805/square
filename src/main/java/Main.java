import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int result = service.service(400,600);
        System.out.println(result);
    }
}

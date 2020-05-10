import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        FileDownloadProxy fileDownloadProxy = new FileDownloadProxy(url);
        fileDownloadProxy.download();
    }
}

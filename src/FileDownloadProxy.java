import java.io.IOException;

public class FileDownloadProxy implements Downloader{
    private FileDownloader fileDownloader;
    private String url;
    public FileDownloadProxy(String url){
        this.fileDownloader = new FileDownloader(url);
    }

    @Override
    public void download() throws IOException {
        fileDownloader.download();
    }


}

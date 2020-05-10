import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class FileDownloader implements Downloader {
    private String url;
    public FileDownloader(String url){
        this.url = url;
    }
    @Override
    public void download() throws IOException {
        URL website = new URL(url);
        ReadableByteChannel readableByteChannel = Channels.newChannel(website.openStream());
        FileOutputStream fileOutputStream = new FileOutputStream("FirefoxInstaller.html");
        fileOutputStream.getChannel().transferFrom(readableByteChannel,0,Long.MAX_VALUE);
    }
}

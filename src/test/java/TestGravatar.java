import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

/**
 * Created by sh00514 on 2017/6/12.
 * Test
 */
public class TestGravatar {
    @Test
    public void test() throws IOException {
        Gravatar gravatar = new Gravatar();
        gravatar = new Gravatar();
        gravatar.setSize(80);
        gravatar.setDefaultImage(GravatarDefaultImage.IDENTICON);
        System.out.println(gravatar.getUrl("13764086339@163.com"));
        byte[] content = gravatar.download("13764086339@163.com");
        File cacheFile = new File("F:/"+ (new Date()).getTime());
        System.out.println(cacheFile.getAbsolutePath());
        FileUtils.writeByteArrayToFile(cacheFile, content);

    }
}

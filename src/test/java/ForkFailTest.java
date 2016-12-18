import org.junit.Assert;
import org.junit.Test;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class ForkFailTest {

    @Test
    public void shouldPass() {
        JavaCompiler systemJavaCompiler = ToolProvider.getSystemJavaCompiler();
        Assert.assertNotNull(systemJavaCompiler);
    }
}

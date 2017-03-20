package ch.heigvd.res.stpatrick;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author Maxime Guillod
 */
public class StreamDecoratorControllerARemover implements IStreamDecoratorController {

    @Override
    public Reader decorateReader(Reader inputReader) {
        return inputReader;
    }

    @Override
    public Writer decorateWriter(Writer outputWriter) {
        System.out.println(outputWriter.toString());
        String data = StringUtils.replaceChars(outputWriter.toString(), "aA", "");
        System.out.println(data);
        try {
            outputWriter.flush();
            outputWriter.write(data);
        } catch (IOException ex) {
            Logger.getLogger(StreamDecoratorControllerARemover.class.getName()).log(Level.SEVERE, null, ex);
        }
        return outputWriter;
    }

}

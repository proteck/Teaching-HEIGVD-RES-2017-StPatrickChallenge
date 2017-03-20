package ch.heigvd.res.stpatrick;

/**
 * This class is responsible for providing different types of Stream Processors.
 *
 * @author Olivier Liechti
 * @author Maxime Guillod
 */
public class StreamProcessorsFactory implements IStreamProcessorsFactory {

    @Override
    public IStreamProcessor getProcessor() {
        return new BasicStreamProcessor();
    }

    @Override
    public IStreamProcessor getProcessor(String processorName) throws UnknownNameException {

        switch (processorName) {
            case "e-remover":
                return new StreamControlerERemover();
        }

        return null;

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.stpatrick;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author Maxime
 */
public class StreamControler implements IStreamProcessor{

    @Override
    public void process(Reader in, Writer out) throws IOException {
        int data = in.read();
        while(data != -1) {
            out.write(data);
            data = in.read();
        }
    }
    
}

package com.astamatii.javarushexc.javacore.L8.lesson_8.L7_8_WrappedStreams_3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//1 Измени класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используй наследование.
//2 При вызове метода close() должны выполняться следующая последовательность действий:
//2.1 Вызвать метод flush().
//2.2 Записать в конец файла фразу "JavaRush © All rights reserved.", используй метод getBytes().
//2.3 Закрыть поток методом close().

public class L7_8_WrappedStreams_3 {

}

class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    
    AmigoOutputStream(FileOutputStream fileOutputStream) throws IOException {
    	super(fileOutputStream.getFD());
    }
    
    @Override
    public void close() throws IOException {
    	super.flush();
    	super.write("JavaRush © All rights reserved.".getBytes());
    	super.close();
    }    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }    
}
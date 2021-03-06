package io.output.stream;

import io.ConstantFilePath;

import java.io.FileOutputStream;

public class JavaFileOutputStream {

    public void fileOutputStreamMethod() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(ConstantFilePath.OUTPUT_PATH)) {
            String name = "Stephen";
            fileOutputStream.write(name.getBytes());
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}

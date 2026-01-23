package main.java.lld.SOLID.lsp.goodCode;

public class Main {

    public static void readAnyfile(ReadableFile file) {
        file.read();
    }

    public static void main(String[] args) {
        ReadableFile readableFile = new ReadOnlyFile();
        readableFile.read();


        WriteableFile writeableFile = new WriteableFile();
        writeableFile.write();
        writeableFile.read();

        readAnyfile(readableFile);
        readAnyfile(writeableFile);
    }
}

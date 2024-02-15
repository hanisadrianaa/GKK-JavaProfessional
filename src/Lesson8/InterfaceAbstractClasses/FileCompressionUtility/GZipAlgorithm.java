package Lesson8.InterfaceAbstractClasses.FileCompressionUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;

public class GZipAlgorithm extends CompressionAlgorithm {

    @Override
    public void compress(String inputFile, String outputFile) throws Exception {
        try (GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream(outputFile))) {
            try (FileInputStream in = new FileInputStream(inputFile)) {
                byte[] buffer = new byte[1024];
                int len;
                while ((len = in.read(buffer)) != -1) {
                    out.write(buffer, 0, len);
                }
            }
        }
    }
}

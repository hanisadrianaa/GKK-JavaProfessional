package Lesson8.InterfaceAbstractClasses.FileCompressionUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipAlgorithm extends CompressionAlgorithm {
    @Override
    public void compress(String inputFile, String outputFile) throws Exception {
        try (ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outputFile))) {
            out.putNextEntry(new ZipEntry(new File(inputFile).getName()));
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

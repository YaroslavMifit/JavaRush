package com.javarush.task.task31.task3105;

import java.io.IOException;
import java.io. *;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/*
Добавление файла в архив
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length != 2)
            return;

        String fileName = args[0];
        String archiveName = args[1];
        HashMap<ZipEntry, byte[]> list = new HashMap<>();
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(archiveName));
        ZipEntry zipEntry;

        while ((zipEntry = zipInputStream.getNextEntry()) != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int count;
            while ((count = zipInputStream.read(b)) != -1)
                byteArrayOutputStream.write(b, 0, count);
            list.put(zipEntry, byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.close();
        }

        String shortFileName = Paths.get(fileName).getFileName().toString();
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(archiveName));

        for (Map.Entry<ZipEntry, byte[]> map : list.entrySet()) {
            if (map.getKey().getName().equals(shortFileName)) {
                zipOutputStream.putNextEntry(new ZipEntry("/new" + File.separator + Paths.get(args[0]).getFileName()));
                Files.copy(Paths.get(args[0]), zipOutputStream);

            } else {
                zipOutputStream.putNextEntry(new ZipEntry(map.getKey().getName()));
                zipOutputStream.write(map.getValue());
            }
        }
        zipInputStream.close();
        zipOutputStream.close();

    }
}





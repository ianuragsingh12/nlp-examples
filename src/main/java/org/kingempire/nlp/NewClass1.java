/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kingempire.nlp;

import java.nio.file.Path;
import java.util.List;
import org.kingempire.core.FileExplorer.FilesExplorerUtility;

/**
 *
 * @author Anurag Singh
 */
public class NewClass1 {

    public static void main(String[] args) {

        String fo = "C:\\few_tools\\apache-opennlp-models";
        List<Path> list = new FilesExplorerUtility().listAllFilesAbsolutePath(fo);

        String p = "";
        for (int i = 0; i < list.size(); i++) {
            String fn = list.get(i).getFileName().toString().toUpperCase();
            String ffn = fn.substring(0, fn.length() - 4);
            String fnn = ffn.replace('-', '_');
            String pp = list.get(i).toAbsolutePath().toString();
            String np = pp.replaceAll("\\\\", "\\\\\\\\");
            p += fnn + "(\"" + np + "\"),\n";
        }
        System.out.println(p);
    }
}

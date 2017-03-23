package br.com.fabrleadr.utils.sql.parser;

import br.com.fabrleadr.utils.sql.parser.csv.CsvStructureParser;
import br.com.fabrleadr.utils.sql.parser.xml.XmlStructureParser;

/**
 *
 * @author ltonietto
 */
public class StructureParserFactory {
    public static StructureParser createInstance(String filename) throws Exception {
        if (filename.endsWith(".csv")){
            return new CsvStructureParser();
        }
        if (filename.endsWith(".xml")){
            return new XmlStructureParser();
        }
        throw new IllegalArgumentException(filename);
    }
}

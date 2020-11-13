package com.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlRepository extends FileDataRepository {

    public XmlRepository() {
        mapper = new XmlMapper();
        fileName = "dogs.xml";
    }
}

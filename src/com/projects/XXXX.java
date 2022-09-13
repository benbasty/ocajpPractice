package com.projects;

public class XXXX {
    public void m() throws Exception {
        throw new RuntimeException();
    }
}
class YYYY extends XXXX {
    public void m() throws Exception {
        throw new Exception();
    }
}

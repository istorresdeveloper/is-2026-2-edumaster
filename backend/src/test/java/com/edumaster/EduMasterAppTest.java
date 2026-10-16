package com.edumaster;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EduMasterAppTest {

    @Test
    void nombreDelProyecto() {
        assertEquals("EduMaster", EduMasterApp.NOMBRE);
    }
}

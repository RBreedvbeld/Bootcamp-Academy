package com.booleanuk;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
public class LearningPlanTest {

    @Test
    public void testAddItem(){
        LearningPlan plan = new LearningPlan();
        Assertions.assertTrue(plan.addItem("JAEX1", 300));

    }

}

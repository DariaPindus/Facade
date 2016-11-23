package com.daria.uni.patterns.facade;


import com.daria.uni.patterns.facade.classes.Designer;
import com.daria.uni.patterns.facade.classes.Factory;
import com.daria.uni.patterns.facade.classes.Tailor;

public class DressCreationFacade {
    Designer designer;
    Tailor tailor;
    Factory factory;
    public DressCreationFacade(Designer designer, Tailor tailor, Factory factory) {
        this.designer = designer;
        this.tailor = tailor;
        this.factory = factory;
    }
    public void createDress() {
        designer.createDesign();
        factory.getFabric();
        tailor.takeMeasurements();
        designer.changeDesign();
        tailor.sewDress();
        tailor.makeFitting();
    }
}

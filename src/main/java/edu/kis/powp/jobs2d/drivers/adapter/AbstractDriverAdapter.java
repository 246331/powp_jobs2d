package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class AbstractDriverAdapter extends AbstractDriver {
    private Job2dDriver driver;

    public AbstractDriverAdapter(int x, int y, Job2dDriver driver) {
        super(x, y);
        this.driver = driver;
    }

    public void operateTo(int x, int y) {
        driver.operateTo(x, y);
        setPosition(x, y);
    }

    public String toString() {
        return driver.toString();
    }
}
/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-08-30 17:23:04.792-+08:00
 */

package seu.edu.cn.year2022.month08.work01;

import java.util.Objects;

public class Host {
    public int ID;
    public int MEM = 256;
    public int CPU = 128;
    public int BW = 20000;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMEM() {
        return MEM;
    }

    public void setMEM(int MEM) {
        this.MEM = MEM;
    }

    public int getCPU() {
        return CPU;
    }

    public void setCPU(int CPU) {
        this.CPU = CPU;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Host host = (Host) o;
        return ID == host.ID && MEM == host.MEM && CPU == host.CPU && BW == host.BW;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, MEM, CPU, BW);
    }

    public int getBW() {
        return BW;
    }

    public void setBW(int BW) {
        this.BW = BW;
    }
}

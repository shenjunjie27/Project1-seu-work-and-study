/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-08-30 17:23:11.335-+08:00
 */

package seu.edu.cn.year2022.month08.work01;

import java.util.Objects;

public class VM {
    public int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VM vm = (VM) o;
        return id == vm.id && mem == vm.mem && cpu == vm.cpu && bw == vm.bw;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mem, cpu, bw);
    }

    public int mem = 8;
    public int cpu = 4;
    public int bw = 1000;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getBw() {
        return bw;
    }

    public void setBw(int bw) {
        this.bw = bw;
    }
}

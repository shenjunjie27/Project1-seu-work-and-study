/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-08-25 21:33:10.584-+08:00
 */

package seu.edu.cn.year2022.month08;

import java.util.*;

public class Test0825 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.contains("has been created in ")) {
//                System.out.println(s);
                list.add(s);
            }
            if (s.contains("执行完成")) {
                break;
            }

        }
        Map<Integer, Integer> map1 = new java.util.HashMap<>();
        Set<Integer> set_vmid = new HashSet<>();
        Set<Integer> set_hostid = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            String[] strings = s.split(" ");
            String VMID = strings[3].substring(1);
            String HostID = strings[11].substring(1);

            map1.put(Integer.parseInt(VMID), Integer.parseInt(HostID));
            set_vmid.add(Integer.parseInt(VMID));
            set_hostid.add(Integer.parseInt(HostID));
        }
        int Host_n = set_hostid.size();
        int Vm_n = set_vmid.size();
        List<double[]> list1 = round(map1, Host_n, Vm_n);

        int count = list1.size();
        List<double[]> list2 = new ArrayList<>();
        for (int i = 0; i < count - 1; i++) {
            if (list1.get(i)[3] < 0.5 * list1.get(count - 3)[3] || list1.get(i)[3] > 1.5 * list1.get(count - 1)[3]) {
                list2.add(list1.get(i));
            }
        }
        Collections.sort(list2, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return (int) (o1[0] - o2[0]);
            }
        });
        double ave_cpu = list1.get(count - 1)[0];
        double cost_one_a = 4 / 128;
        List<Integer> list_3 = new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            double n = Math.abs((list2.get(i)[0] - ave_cpu) / cost_one_a);
//            四舍五入
            int t = (int) (n + 0.5);
            if (list2.get(i)[0] - ave_cpu > 0) {
                list_3.add(t);
            } else {
                list_3.add(-t);
            }
        }
        map1.put(21, 1);


        round(map1, Host_n, Vm_n);


    }

    public static List<double[]> round(Map<Integer, Integer> map1, int Host_n, int Vm_n) {
        System.out.println(Host_n);
        System.out.println(Vm_n);
        List<Host> list_host = new ArrayList<>();
        for (int i = 0; i < Host_n; i++) {
            Host host = new Host();
            host.setID(i);
            list_host.add(host);
        }
        List<VM> list_vm = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            VM vm = new VM();
            vm.setId(i);
            list_vm.add(vm);
        }
        for (int i = 20; i < 30; i++) {
            VM vm = new VM();
            vm.setId(i);
            vm.setCpu(8);
            vm.setMem(16);
            list_vm.add(vm);
        }
        for (int i = 30; i < 40; i++) {
            VM vm = new VM();
            vm.setId(i);
            vm.setCpu(16);
            vm.setMem(32);
            list_vm.add(vm);
        }
        Map<VM, Host> map_v2h = new HashMap<>();
        Map<Host, List<VM>> map_h2v = new HashMap<>();
        for (int i = 0; i < Vm_n; i++) {
            int hostid = map1.get(i);
            map_v2h.put(list_vm.get(i), list_host.get(hostid));
        }

        return cal(map_v2h, Host_n, Vm_n, list_host, list_vm);

    }

    public static List<double[]> cal(Map<VM, Host> map_v2h, int Host_n, int Vm_n, List<Host> list_host, List<VM> list_vm) {
        List<List<VM>> list_vmlist2host = new ArrayList<>();
        for (int i = 0; i < Host_n; i++) {
            List<VM> list_vm_t = new ArrayList<>();
            for (Map.Entry<VM, Host> entry : map_v2h.entrySet()) {
                if (entry.getValue().getID() == i) {
                    list_vm_t.add(entry.getKey());
                }
            }
            list_vmlist2host.add(list_vm_t);

        }
        double t_all = 0;
        List<double[]> list_t = new ArrayList<>();
        for (int i = 0; i < Host_n; i++) {
            double temp[] = cal_one_host(list_vmlist2host.get(i), list_host.get(i));
            list_t.add(temp);
            double t1 = temp[3];
            t_all = t_all + t1;
//            System.out.println("The host " + i + " is " + t1 * 10000);
        }
        System.out.println(t_all * 10000);
        double[] temp_all = cal_all_host(list_vm, list_host);
        double t2 = temp_all[3];
        list_t.add(temp_all);
//        System.out.println("The all is " + t2 * 10000);
        return list_t;
    }


    public static double[] cal_one_host(List<VM> list_vm, Host host) {
        int CPU = host.getCPU();
        int MEM = host.getMEM();
        int BW = host.getBW();

        int CPU_D = CPU;
        int MEM_D = MEM;
        int BW_D = BW;
        for (int i = 0; i < list_vm.size(); i++) {
            int cpu = list_vm.get(i).getCpu();
            int mem = list_vm.get(i).getMem();
            int bw = list_vm.get(i).getBw();
            CPU_D = CPU_D - cpu;
            MEM_D = MEM_D - mem;
            BW_D = BW_D - bw;
        }
        double a = 1 - (double) CPU_D / CPU;
        double b = 1 - (double) MEM_D / MEM;
        double c = 1 - (double) BW_D / BW;
        double res = (3 * (a * a + b * b + c * c) - (a + b + c) * (a + b + c)) / 9;

//        System.out.println("a=" + a + " b=" + b + " c=" + c);
        System.out.println(a + "\t" + b + "\t" + c + "\t" + res * 10000);
//
        res = (double) Math.round(res * 1000000) / 1000000;
        double[] arr_res = new double[]{a, b, c, res};
        return arr_res;

    }

    public static double[] cal_all_host(List<VM> list_vm, List<Host> list_host) {

        int CPU = 0;
        int MEM = 0;
        int BW = 0;
        for (int i = 0; i < list_host.size(); i++) {
            int CPU_t = list_host.get(i).getCPU();
            int MEM_t = list_host.get(i).getMEM();
            int BW_t = list_host.get(i).getBW();
            CPU = CPU + CPU_t;
            MEM = MEM + MEM_t;
            BW = BW + BW_t;

        }

        int CPU_D = CPU;
        int MEM_D = MEM;
        int BW_D = BW;
        for (int i = 0; i < list_vm.size(); i++) {
            int cpu = list_vm.get(i).getCpu();
            int mem = list_vm.get(i).getMem();
            int bw = list_vm.get(i).getBw();
            CPU_D = CPU_D - cpu;
            MEM_D = MEM_D - mem;
            BW_D = BW_D - bw;
        }
        double a = 1 - (double) CPU_D / CPU;
        double b = 1 - (double) MEM_D / MEM;
        double c = 1 - (double) BW_D / BW;
        double res = (3 * (a * a + b * b + c * c) - (a + b + c) * (a + b + c)) / 9;
//        保留四位小数
//        System.out.println("a=" + a + " b=" + b + " c=" + c);
        res = (double) Math.round(res * 1000000) / 1000000;
        System.out.println(a + "\t" + b + "\t" + c + "\t" + res * 10000);
        double[] arr_res = new double[]{a, b, c, res};
        return arr_res;


    }
}

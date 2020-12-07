package UMBC.IS147.SemesterProject;

import java.util.Scanner;

interface PC_Types {

    interface OfficePC {
        void TakeCPU ();
        void TakeMobo();
        void TakeFAN ();
        void TakeGPU ();
        void TakeRAM ();
        void TakeHDD ();
        void TakeSSD ();
        void TakePSU ();
        void TakeCASE();
        void TakeOS  ();
        void printTable();
    }

    interface GamingPC {
        void TakeCPU ();
        void TakeMobo();
        void TakeFAN ();
        void TakeRAM ();
        void TakeGPU ();
        void TakeHDD ();
        void TakeSSD ();
        void TakePSU ();
        void TakeCASE();
        void TakeOS  ();
        void printTable();
    }

    interface EditingPC {
        void TakeCPU ();
        void TakeMobo();
        void TakeFAN ();
        void TakeRAM ();
        void TakeGPU ();
        void TakeHDD ();
        void TakeSSD ();
        void TakePSU ();
        void TakeCASE();
        void TakeOS  ();
        void printTable();
    }

    class PCtaker implements OfficePC, GamingPC, EditingPC {

        double Budget = ExpressBuilder.getUserBudget();
        int Type = ExpressBuilder.getUserType();
        double Tax = ExpressBuilder.getUserTax();
        String CPUname,MOBOname,FANname,RAMname,GPUname,HDDname,SSDname,PSUname,CASEname,OSname;
        double CPUcost,MOBOcost,FANcost,RAMcost,GPUcost,HDDcost,SSDcost,PSUcost,CASEcost,OScost;

        public void TakeCPU() {
            PartsList select = new PartsList();
            if (Budget >= 500 && Budget <= 600) {
                CPUname = select.CPUitems[0];
                CPUcost = select.CPUprice[0];
            } else if(Budget >= 600 && Budget < 700) {
                CPUname = select.CPUitems[1];
                CPUcost = select.CPUprice[1];
            } else if (Budget >= 700 && Budget < 800) {
                CPUname = select.CPUitems[2];
                CPUcost = select.CPUprice[2];
            } else if (Budget >= 800 && Budget < 900) {
                CPUname = select.CPUitems[3];
                CPUcost = select.CPUprice[3];
            }else if (Budget >= 900 && Budget < 1300) {
                CPUname = select.CPUitems[4];
                CPUcost = select.CPUprice[4];
            }else if (Budget >= 1300 && Budget < 2000) {
                CPUname = select.CPUitems[5];
                CPUcost = select.CPUprice[5];
            }else if (Budget >= 2000 && Budget < 2500) {
                CPUname = select.CPUitems[6];
                CPUcost = select.CPUprice[6];
            }else if (Budget >= 2500 && Budget < 3500) {
                CPUname = select.CPUitems[7];
                CPUcost = select.CPUprice[7];
            }else if (Budget >= 3500 && Budget <= 5000) {
                CPUname = select.CPUitems[8];
                CPUcost = select.CPUprice[8];
            }
        }

        public void TakeMobo() {
            PartsList select = new PartsList();
            if (Budget >= 500 && Budget < 600) {
                MOBOname = select.MOBOitems[0];
                MOBOcost = select.MOBOprice[0];
            } else if(Budget >= 600 && Budget < 900) {
                MOBOname = select.MOBOitems[1];
                MOBOcost = select.MOBOprice[1];
            } else if (Budget >= 900 && Budget < 980) {
                MOBOname = select.MOBOitems[2];
                MOBOcost = select.MOBOprice[2];
            } else if (Budget >= 980 && Budget < 1300) {
                MOBOname = select.MOBOitems[3];
                MOBOcost = select.MOBOprice[3];
            }else if (Budget >= 1300 && Budget < 2000) {
                MOBOname = select.MOBOitems[4];
                MOBOcost = select.MOBOprice[4];
            }else if (Budget >= 2000 && Budget <= 5000) {
                MOBOname = select.MOBOitems[5];
                MOBOcost = select.MOBOprice[5];
            }
        }

        public void TakeFAN(){
            PartsList select = new PartsList();
            if (Budget >= 500 && Budget < 600) {
                FANname = select.FANitems[0];
                FANcost = select.FANprice[0];
            } else if(Budget >= 600 && Budget < 1100) {
                FANname = select.FANitems[1];
                FANcost = select.FANprice[1];
            } else if (Budget >= 1100 && Budget < 1500) {
                FANname = select.FANitems[2];
                FANcost = select.FANprice[2];
            } else if (Budget >= 1500 && Budget < 2100) {
                FANname = select.FANitems[3];
                FANcost = select.FANprice[3];
            }  else if (Budget >= 2100 && Budget <= 5000) {
                FANname = select.FANitems[4];
                FANcost = select.FANprice[4];
            }
        }

        public void TakeRAM (){
            PartsList select = new PartsList();
            if (Budget >= 500 && Budget < 1100) {
                RAMname = select.RAMitems[0];
                RAMcost = select.RAMprice[0];
            } else if(Budget >= 1100 && Budget < 2100) {
                RAMname = select.RAMitems[1];
                RAMcost = select.RAMprice[1];
            } else if (Budget >= 2100 && Budget < 3500|| Type == 2 && Budget >= 3500) {
                RAMname = select.RAMitems[2];
                RAMcost = select.RAMprice[2];
            } else if (Budget >= 3500 && Budget <= 5000) {
                RAMname = select.RAMitems[3];
                RAMcost = select.RAMprice[3];
            }
        }

        public void TakeGPU() {
            PartsList select = new PartsList();
            if(Type == 1 && Budget <= 700){
                Budget = 500;
            } else if (Budget >= 600 && Budget <= 700 || Type == 1 && Budget >= 700) {
                GPUname = select.GPUitems[0];
                GPUcost = select.GPUprice[0];
            } else if(Budget >= 700 && Budget < 800 ) {
                GPUname = select.GPUitems[1];
                GPUcost = select.GPUprice[1];
            } else if (Budget >= 800 && Budget < 1000) {
                GPUname = select.GPUitems[2];
                GPUcost = select.GPUprice[2];
            } else if (Budget >= 1000 && Budget < 1100) {
                GPUname = select.GPUitems[3];
                GPUcost = select.GPUprice[3];
            }else if (Budget >= 1100 && Budget < 1250) {
                GPUname = select.GPUitems[4];
                GPUcost = select.GPUprice[4];
            }else if (Budget >= 1250 && Budget < 1450) {
                GPUname = select.GPUitems[5];
                GPUcost = select.GPUprice[5];
            }else if (Budget >= 1450 && Budget < 1850) {
                GPUname = select.GPUitems[6];
                GPUcost = select.GPUprice[6];
            }else if (Budget >= 1850 && Budget < 2300) {
                GPUname = select.GPUitems[7];
                GPUcost = select.GPUprice[7];
            }else if (Budget >= 2300 && Budget < 4000) {
                GPUname = select.GPUitems[8];
                GPUcost = select.GPUprice[8];
            }else if (Budget >= 4000 && Budget <= 5000 )  {
                GPUname = select.GPUitems[9];
                GPUcost = select.GPUprice[9];
            }
        }

        public void TakeHDD(){
            PartsList select = new PartsList();
            if (Budget >= 500 && Budget < 2150) {
                HDDname = select.HDDitems[0];
                HDDcost = select.HDDprice[0];
            } else if(Budget >= 2150 && Budget < 3000) {
                HDDname = select.HDDitems[1];
                HDDcost = select.HDDprice[1];
            } else if (Budget >= 3000 && Budget < 3600 || Type == 2 && Budget >= 3500) {
                HDDname = select.HDDitems[2];
                HDDcost = select.HDDprice[2];
            } else if (Budget >= 3600 && Budget <= 5000) {
                HDDname = select.HDDitems[3];
                HDDcost = select.HDDprice[3];
            }
        }

        public void TakeSSD () {
            PartsList select = new PartsList();
            if (Budget >= 500 && Budget < 700) {
                SSDname = select.SSDitems[0];
                SSDcost= select.SSDprice[0];
            } else if(Budget >= 700 && Budget < 1400) {
                SSDname = select.SSDitems[1];
                SSDcost= select.SSDprice[1];
            } else if (Budget >= 1400 && Budget < 2500) {
                SSDname = select.SSDitems[2];
                SSDcost= select.SSDprice[2];
            } else if (Budget >= 2500 && Budget <= 5000) {
                SSDname = select.SSDitems[3];
                SSDcost= select.SSDprice[3];
            }
        }

        public void TakePSU(){
            PartsList select = new PartsList();
            if (Budget >= 500 && Budget < 600) {
                PSUname = select.PSUitems[0];
                PSUcost = select.PSUprice[0];
            } else if(Budget >= 600 && Budget < 900) {
                PSUname = select.PSUitems[1];
                PSUcost = select.PSUprice[1];
            } else if (Budget >= 900 && Budget < 1300) {
                PSUname = select.PSUitems[2];
                PSUcost = select.PSUprice[2];
            } else if (Budget >= 1300 && Budget < 1600) {
                PSUname = select.PSUitems[3];
                PSUcost = select.PSUprice[3];
            }else if (Budget >= 1600 && Budget < 2800) {
                PSUname = select.PSUitems[4];
                PSUcost = select.PSUprice[4];
            }else if (Budget >= 2800 && Budget <= 5000) {
                PSUname = select.PSUitems[5];
                PSUcost = select.PSUprice[5];
            }
        }

        public void TakeCASE(){
            PartsList select = new PartsList();
            if (Budget >= 500 && Budget < 700) {
                CASEname = select.CASEitems[0];
                CASEcost = select.CASEprice[0];
            } else if(Budget >= 700 && Budget < 900) {
                CASEname = select.CASEitems[1];
                CASEcost = select.CASEprice[1];
            } else if (Budget >= 900 && Budget < 1300) {
                CASEname = select.CASEitems[2];
                CASEcost = select.CASEprice[2];
            } else if (Budget >= 1300 && Budget < 1700) {
                CASEname = select.CASEitems[3];
                CASEcost = select.CASEprice[3];
            }else if (Budget >= 1700 && Budget < 2200) {
                CASEname = select.CASEitems[4];
                CASEcost = select.CASEprice[4];
            }else if (Budget >= 2200 && Budget < 3000) {
                CASEname = select.CASEitems[5];
                CASEcost = select.CASEprice[5];
            }else if (Budget >= 3000 && Budget <= 5000) {
                CASEname = select.CASEitems[6];
                CASEcost = select.CASEprice[6];
            }
        }

        public void TakeOS(){
            if (ExpressBuilder.getUserWindows().equalsIgnoreCase("Y")){
                OSname = "Windows 10 PRO 64-bit (OEM)";
                OScost = 29.99;
            } else {
                OSname = "N/A";
                OScost = 0.00;
            }
        }

        public static void ExpressPC_Build(){
            PCtaker Option = new PCtaker();
            Option.TakeCPU();
            Option.TakeMobo();
            Option.TakeFAN();
            Option.TakeRAM();
            Option.TakeGPU();
            Option.TakeHDD();
            Option.TakeSSD();
            Option.TakePSU();
            Option.TakeCASE();
            Option.TakeOS();
            Option.printTable();
        }

        public static void RandomPC_Build(){
            PCtaker Option = new PCtaker();
            ExpressPC_Build();
            Option.printRandomTable();
        }

        public void printTable () {
            Scanner Input = new Scanner(System.in);

            String[] userParts = {CPUname, MOBOname, FANname, RAMname, GPUname, HDDname, SSDname, PSUname, CASEname, OSname};
            String[] columnNames = {"CPU", "Motherboard", "CPU FAN", "RAM", "Video Card", "HDD", "SSD", "PSU", "Case", "OS"};
            double[] grabPrice = {CPUcost, MOBOcost, FANcost, RAMcost, GPUcost, HDDcost, SSDcost, PSUcost, CASEcost, OScost};
            double taxedTotal = calcTotals() * Tax * 0.01;
            double finalTotal = calcTotals() + (calcTotals() * Tax * 0.01);

            System.out.printf("%-25s%-40s%27s%n", "Part", "Selection", "[$]Price");
            System.out.println("-------------------------------------------------------------------------------------------------");
            for (int i = 0; i < columnNames.length; i++)
                System.out.printf("%-25s%-55s%13.2f%n", columnNames[i], userParts[i], grabPrice[i]);
            System.out.println();
            System.out.printf("%-25s%68.2f%n", "Base Total", calcTotals());
            System.out.printf("%-5s%-3.2f%-2s%82.2f%n", "Tax (", Tax, "%)", taxedTotal);
            System.out.printf("%-25s%68.2f%n", "Total", finalTotal);
        }

        public  void printRandomTable (){
            if (MainMenu.getMainMenu() == 8){
                System.out.println("--------------------");
                System.out.println("Random Build Information");
                System.out.printf("%-10s%-1d%n", "PC Type: ", ExpressBuilder.getUserType());
                System.out.printf("%-10s%-2.2f%n", "Budget: ", ExpressBuilder.getUserBudget());
            } else {
                System.out.println("-------------------------------------------------------------------------------------------------");
            }
            System.out.println();
        }

        public double calcTotals (){
            double[] grabPrice = {CPUcost, MOBOcost, FANcost, RAMcost, GPUcost, HDDcost, SSDcost, PSUcost, CASEcost, OScost};
            double sum = 0;
            for (int i = 0; i < grabPrice.length; i++)
                sum +=grabPrice[i];
            return sum;
        }
    }
























}

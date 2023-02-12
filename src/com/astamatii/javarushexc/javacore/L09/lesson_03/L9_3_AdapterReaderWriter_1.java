package com.astamatii.javarushexc.javacore.L09.lesson_03;

//Измени класс TableAdapter так, чтобы он адаптировал ATable к BTable.
//Метод getHeaderText должен возвращать такую строку "[username] : tablename".
//
//Пример, "[Amigo] : DashboardTable".

public class L9_3_AdapterReaderWriter_1 {
    public static void main(String[] args) {
        //это пример вывода
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "Amigo";
            }

            @Override
            public String getTableName() {
                return "DashboardTable";
            }
        };

//        BTable table = new TableAdapter(aTable);
//        System.out.println(table.getHeaderText());
    }

    public static class TableAdapter {

    }

    public interface ATable {
        String getCurrentUserName();

        String getTableName();
    }

    public interface BTable {
        String getHeaderText();
    } 
}

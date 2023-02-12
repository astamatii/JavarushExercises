package com.astamatii.javarushexc.javacore.L08.lesson_08;

import java.util.List; 

//Измени класс TableInterfaceWrapper так, чтобы он стал Wrapper-ом для TableInterface.
//Метод setModel должен вывести в консоль количество элементов в списке 
//	перед обновлением модели (вызовом метода setModel у объекта типа TableInterface).
//Метод getHeaderText должен возвращать текст в верхнем регистре - используй метод toUpperCase().

public class L7_8_WrappedStreams_5 {
    public class TableInterfaceWrapper implements TableInterface {

    	TableInterface tableInterface;
    	
    	public TableInterfaceWrapper(TableInterface tableInterface) {
    		this.tableInterface = tableInterface;
		}
    	
		@Override
		public void setModel(List rows) {
			System.out.println(rows.size());
			tableInterface.setModel(rows);
		}

		@Override
		public String getHeaderText() {
			return tableInterface.getHeaderText().toUpperCase();
		}

		@Override
		public void setHeaderText(String newHeaderText) {
			tableInterface.setHeaderText(newHeaderText);
		}

    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }   
}

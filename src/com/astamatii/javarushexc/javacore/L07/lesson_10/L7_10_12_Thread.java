package com.astamatii.javarushexc.javacore.L07.lesson_10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

//Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
//1. Считать с консоли 2 имени файла.
//2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines.
//
//В методе joinData:
//3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, 
//	которые есть в forRemoveLines.
//4. Если условие из п.3 не выполнено, то:
//	4.1. очистить allLines от данных
//	4.2. выбросить исключение CorruptedDataException
//Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
//Не забудь закрыть потоки.

public class L7_10_12_Thread {
	public static List<String> allLines = new ArrayList<String>();
	public static List<String> forRemoveLines = new ArrayList<String>();

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader brf1 = new BufferedReader(new FileReader(br.readLine()));
			BufferedReader brf2 = new BufferedReader(new FileReader(br.readLine()));
			while (brf1.ready())
				allLines.add(brf1.readLine());

			while (brf2.ready())
				forRemoveLines.add(brf2.readLine());

			brf1.close();
			brf2.close();
			br.close();
			new L7_10_12_Thread().joinData(); //new Solution().joinData();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void joinData() throws CorruptedDataException {		
		if(allLines.containsAll(forRemoveLines))
			allLines.removeAll(forRemoveLines);
		else {
			allLines.clear();
			throw new CorruptedDataException();
		}
	}
}

class CorruptedDataException extends IOException {
}

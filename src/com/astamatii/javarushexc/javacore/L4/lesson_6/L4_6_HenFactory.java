package com.astamatii.javarushexc.javacore.L4.lesson_6;

//Давай напишем Фабрику (Factory) по производству кур (Hen):
//	1. Создай класс Hen.
//		1.1. Сделай его абстрактным.
//		1.2. Добавь в класс абстрактный метод int getCountOfEggsPerMonth().
//		1.3. Добавь в класс метод String getDescription(), который возвращает строку "Я - курица.".
//	2. Создай класс RussianHen, который наследуется от Hen.
//	3. Создай класс UkrainianHen, который наследуется от Hen.
//	4. Создай класс MoldovanHen, который наследуется от Hen.
//	5. Создай класс BelarusianHen, который наследуется от Hen.
//	6. В каждом из четырех последних классов напиши свою реализацию метода getCountOfEggsPerMonth.
//		Методы должны возвращать количество яиц в месяц от данного типа куриц.
//	7. В каждом из четырех последних классов напиши свою реализацию метода getDescription.
//		Методы должны возвращать строку вида:
//		<getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
//		где Sssss - название страны
//		где N - количество яиц в месяц
//
//	8. В классе HenFactory реализуй метод getHen, который возвращает соответствующую стране породу кур.
//	9. Все созданные классы должны быть в отдельных файлах.

public class L4_6_HenFactory {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.MOLDOVA);
        System.out.println(hen.getCountOfEggsPerMonth());
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            
            if(country.equals(Country.MOLDOVA))
            	hen = new MoldovanHen();
            if(country.equals(Country.UKRAINE))
            	hen = new UkrainianHen();
            if(country.equals(Country.RUSSIA))
            	hen = new RussianHen();
            if(country.equals(Country.BELARUS))
            	hen = new BelarusianHen();
            
            return hen;
        }
    }  
}

class RussianHen extends Hen {
	@Override
	int getCountOfEggsPerMonth() {
		return 1;
	}	
	
	@Override
	String getDescription() {
		return super.getDescription() + " Моя страна - " + Country.RUSSIA + 
				". Я несу "+ getCountOfEggsPerMonth() +" яиц в месяц.";
	}
}

class MoldovanHen extends Hen {
	@Override
	int getCountOfEggsPerMonth() {
		return 2;
	}	
	
	@Override
	String getDescription() {
		return super.getDescription() + " Моя страна - " + Country.MOLDOVA + 
				". Я несу "+ getCountOfEggsPerMonth() +" яиц в месяц.";
	}
}

class UkrainianHen extends Hen {
	@Override
	int getCountOfEggsPerMonth() {
		return 1;
	}	
	
	@Override
	String getDescription() {
		return super.getDescription() + " Моя страна - " + Country.UKRAINE + 
				". Я несу "+ getCountOfEggsPerMonth() +" яиц в месяц.";
	}
}

class BelarusianHen extends Hen {
	@Override
	int getCountOfEggsPerMonth() {
		return 1;
	}	
	
	@Override
	String getDescription() {
		return super.getDescription() + " Моя страна - " + Country.BELARUS + 
				". Я несу "+ getCountOfEggsPerMonth() +" яиц в месяц.";
	}
}

abstract class Hen {
	abstract int getCountOfEggsPerMonth();
	String getDescription() {
		return "Я - курица.";
	}
}

interface Country {
    String UKRAINE = "Ukraine";
    String RUSSIA = "Russia";
    String MOLDOVA = "Moldova";
    String BELARUS = "Belarus";
}
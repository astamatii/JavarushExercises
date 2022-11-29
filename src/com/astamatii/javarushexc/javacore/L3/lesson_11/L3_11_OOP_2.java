package com.astamatii.javarushexc.javacore.L3.lesson_11;

//Реализуй в классе Today интерфейс Weather.
//Подумай, как связан параметр type с методом getWeatherType().
//Обрати внимание, что интерфейсы Weather и WeatherType уже реализованы в отдельных файлах.

public class L3_11_OOP_2 {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }

    static class Today implements Weather {
        private String type;

        Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }

		@Override
		public String getWeatherType() {
			return type;
		}
    }
    
    public interface Weather {
        String getWeatherType();
    }
    
    public interface WeatherType {
        String CLOUDY = "Cloudy";
        String FOGGY = "Foggy";
        String FREEZING = "Freezing";
    }   
}

package com.astamatii.javarushexc.javacore.L5.lesson_6;

import java.io.Serializable; 

//Упрости код: убери все наследования и реализации, которые автоматически добавятся при компиляции.
//Взаимосвязь между объектами me и zapp — Has-a: http://ru.wikipedia.org/wiki/Has-a

public class L5_6_Constructors_RunOrder_1 {
    public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askHubert("What do you think about this task?"));
        System.out.println(me.askZapp("When will the next update happen?"));
    }

    public interface SpecificSerializable extends Serializable {
    }

    public static class JavaDev implements SpecificSerializable {
        private static final long serialVersionUID = 1L;

		String answerQuestion(String question) {
            return String.format("I'll be thinking of [%s]", question);
        }
    }

    public static class JuniorJavaDev extends JavaDev {
		private static final long serialVersionUID = 1L;
		
		JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp(String question) {
            return zapp.answerQuestion(question);
        }

        String askHubert(String question) {
            return hubert.answerQuestion(question);
        }
    }
}

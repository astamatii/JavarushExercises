package com.astamatii.javarushexc.javacore.L03.lesson_11;

//Для начала разберись в том, что делает код: это будет непросто.
//Затем измени код согласно новой архитектуре и добавь новую логику:
//Сделай класс AbstractRobot абстрактным, вынеси логику атаки и защиты из Robot в AbstractRobot.
//Отредактируй класс Robot, учитывая AbstractRobot.
//Расширь класс BodyPart новой частью тела BodyPart.CHEST("грудь").
//Добавь новую часть тела в реализацию интерфейсов Attackable и Defensable (в классе AbstractRobot).

public class L3_11_13_OOP {
    public static void main(String[] args) {
        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Сгибальщик-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defended = robotSecond.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defended));
    }
}

final class BodyPart {
    final static BodyPart LEG = new BodyPart("нога");
    final static BodyPart HEAD = new BodyPart("голова");
    final static BodyPart ARM = new BodyPart("рука");
    final static BodyPart CHEST = new BodyPart("грудь");

    private String bodyPart;

    private BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return this.bodyPart;
    }
}

interface Attackable {
    BodyPart attack();
}

interface Defensable {
    BodyPart defense();
}         

abstract class AbstractRobot implements Attackable, Defensable {
	private static int hitCount;    
    
	public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.LEG;
        } else if (hitCount == 4) {
        	hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;
        } 
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        hitCount = hitCount + 2;

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            defendedBodyPart = BodyPart.CHEST;
        } else if (hitCount == 4) {  
        	hitCount = 0;
            defendedBodyPart = BodyPart.ARM;
        } 
        return defendedBodyPart;
    }
    
    public abstract String getName();
}          

class Robot extends AbstractRobot {
	private String name;
	
    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}  
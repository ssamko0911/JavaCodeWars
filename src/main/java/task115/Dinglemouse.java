package task115;

//https://www.codewars.com/kata/5b0a80ce84a30f4762000069/train/java

import java.util.ArrayList;
import java.util.List;

public class Dinglemouse {
    public static final String NAME_ATTR = "name";
    public static final String AGE_ATTR = "age";
    public static final String SEX_ATTR = "sex";

    public static final String INIT_SUMMARY_STR = "Hello. ";
    public static final String NAME_SUMMARY_PATTERN = "My name is %s. ";
    public static final String AGE_SUMMARY_PATTERN = "I am %d. ";
    public static final String SEX_SUMMARY_PATTERN = "I am %s. ";
    public static final String FEMALE_LABEL = "female";
    public static final String MALE_LABEL = "male";
    public static final String ERR = "Invalid attribute";

    private String name;
    private int age;
    private char sex;
    List<String> setterOrder = new ArrayList<>();

    public Dinglemouse() {
    }

    public String getName() {
        return name;
    }

    public Dinglemouse setName(String name) {
        if (!this.setterOrder.contains(Dinglemouse.NAME_ATTR)) {
            this.setterOrder.add(Dinglemouse.NAME_ATTR);
        }

        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Dinglemouse setAge(int age) {
        if (!this.setterOrder.contains(Dinglemouse.AGE_ATTR)) {
            this.setterOrder.add(Dinglemouse.AGE_ATTR);
        }

        this.age = age;
        return this;
    }

    public char getSex() {
        return sex;
    }

    public Dinglemouse setSex(char sex) {
        if (!this.setterOrder.contains(Dinglemouse.SEX_ATTR)) {
            this.setterOrder.add(Dinglemouse.SEX_ATTR);
        }

        this.sex = sex;
        return this;
    }

    public String hello() {
        StringBuilder summary = new StringBuilder(Dinglemouse.INIT_SUMMARY_STR);

        for (String attribute : this.setterOrder) {
            switch (attribute) {
                case Dinglemouse.NAME_ATTR:
                    summary.append(String.format(Dinglemouse.NAME_SUMMARY_PATTERN, this.getName()));
                    break;
                case Dinglemouse.AGE_ATTR:
                    summary.append(String.format(Dinglemouse.AGE_SUMMARY_PATTERN, this.getAge()));
                    break;
                case Dinglemouse.SEX_ATTR:
                    summary.append(String.format(Dinglemouse.SEX_SUMMARY_PATTERN, this.getSex() == 'M' ? Dinglemouse.MALE_LABEL : Dinglemouse.FEMALE_LABEL));
                    break;
                default:
                    throw new IllegalArgumentException(Dinglemouse.ERR);
            }
        }

        return summary.toString().trim();
    }
}

package com.teachmeskills.lesson9.mainTask;

public class Executor {
    public static void main(String[] args) {
        Vector vector1 = new TwoDecimalVector(1, 2);
        Vector vector2 = new TwoDecimalVector(4, 8);

        Vector vector3 = new ThreeDecimalVector(1,2,5);
        Vector vector4 = new ThreeDecimalVector(4,8,1);

        System.out.println(vector1.compare(vector2));

//        System.out.println(vector1.sum(vector2));
//        System.out.println(vector3.sum(vector4));
//        System.out.println(vector1.minus(vector2));
//        System.out.println(vector3.minus(vector4));

        //printVectorArray(ThreeDecimalVector.initVectorArray(5));
    }
}

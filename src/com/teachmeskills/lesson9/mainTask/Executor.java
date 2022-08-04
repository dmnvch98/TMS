package com.teachmeskills.lesson9.mainTask;

import com.teachmeskills.lesson9.additionalTask.MultiDecimalVector;
import static com.teachmeskills.lesson9.VectorUtils.print;
import static com.teachmeskills.lesson9.VectorUtils.printVectorArray;

public class Executor {
    public static void main(String[] args) {
        TwoDecimalVector twoDecimalVector1 = new TwoDecimalVector(4,6);
        TwoDecimalVector twoDecimalVector2 = new TwoDecimalVector(3,8);

        ThreeDecimalVector threeDecimalVector1 = new ThreeDecimalVector(4, 9 ,5);
        ThreeDecimalVector threeDecimalVector2 = new ThreeDecimalVector(1, 9, 10);

        print(twoDecimalVector1.length());
        print(threeDecimalVector2.length());

        print(twoDecimalVector1.scalarProduct(twoDecimalVector2));
        print(threeDecimalVector2.scalarProduct(threeDecimalVector2));

        print(twoDecimalVector1.sum(twoDecimalVector2));
        print(threeDecimalVector1.minus(threeDecimalVector2));

        printVectorArray(TwoDecimalVector.initVectorArray(5));
        printVectorArray(ThreeDecimalVector.initVectorArray(6));

        MultiDecimalVector threeDecimalVector3 = new MultiDecimalVector(4, 9 ,6);
        MultiDecimalVector threeDecimalVector4 = new MultiDecimalVector(3, 4, 9);

        MultiDecimalVector twoDecimalVector3 = new MultiDecimalVector(1, 6);
        MultiDecimalVector twoDecimalVector4 = new MultiDecimalVector(9, 8);

        print(twoDecimalVector3.length());
        print(threeDecimalVector3.length());

        print(twoDecimalVector3.scalarProduct(twoDecimalVector4));
        print(threeDecimalVector3.scalarProduct(threeDecimalVector4));

        print(twoDecimalVector3.sum(twoDecimalVector4));
        print(threeDecimalVector3.minus(threeDecimalVector4));

        printVectorArray(MultiDecimalVector.initVectorArray(3));
    }
}

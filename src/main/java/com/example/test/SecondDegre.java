package com.example.test;

public class SecondDegre {
    //format ax*2 + bx + c
    // 3 fonction: calculDelta, calculS1, calculS2
    //RG: delta = 0 => une solution dont x1 = X2
    //RG: detla > 0 => deux solution dont x1 et x1
    //RG delta <0: pas de solution
public int calculDelta(int a, int b, int c){
    int delta = b*b - 4*a*c;
    return delta;
}

public int calculSolution(int a, int b, int c){
    int delta = calculDelta(a, b, c);
    String x1, x2;
    if(delta == 0){
        x1 = (-b -Math.sqrt(delta))+"/"+ 2*a;
        System.out.println("x1 = x2=" +x1);
    } else if (delta>0) {
        x1= (-b -Math.sqrt(delta))+"/"+ 2*a;
        x2 =(-b +Math.sqrt(delta))+"/"+ 2*a;

        if((-b -Math.sqrt(delta)) % 2*a == 0 ){
            System.out.println("x1:"+ (-b -Math.sqrt(delta))/ 2*a);
        }
        else {
            System.out.println("x1:" +x1);
        }

        if (((-b - Math.sqrt(delta)) % 2 * a == 0)) {
            System.out.println("x1:" + (-b - Math.sqrt(delta)) / 2 * a);
        } else {
            System.out.println("x1:" + x1);
        }

        System.out.println("x2:" +x2);
    }else {
        System.out.println("pas de solution");
    }

    return 0;  // 4/2
}

}

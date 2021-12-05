# UC Berkeley CS 61B

## Intro

[Study Guide (autograder)](https://github.com/SFUMECJF/cs61b-study-guide/blob/main/1-autograder配置.md)



### Hello World

1. In Java, all code must be part a class.
2. Classes are defined with "**public class CLASSNAME**".
3. We use **{}** to delineate the beginning and ending of things.
4. We must end lines with a **semicolon**.
5. The code we want to run must be inside **public static void main(String[] args)**.



### Declaring Functions

```java
package com.company;

public class LargerDemo {
    public static int larger(int x,int y){
        if (x > y){
            return x;
        }
        return y;
    }
    public static void main(String[] args) {
        System.out.println(larger(-5,10));
    }
}
```

1. Functions must be declared as part of a class in Java. (A function that is part of a class is called a method. So in Java, **all functions are methods**.)
2. To define a func., we use "public static".
3. All parameters of a function must have a **declared type**, and the return value of the func. must have a declared type.



### Static Typing

```java
package com.company;

public class HelloNums {

    public static void main(String[] args){
        int x = 0;
        while (x < 10){
            System.out.println(x);
            x = x + 1;
        }
    }
}
```



## Defining and Instantiating Classes

### Example: DogsBarking

```java
public class Dog {
    public static int DogWeight;

    public Dog(int w) {
        DogWeight = w;
    }

    public static void makeNoise() {
        if (DogWeight < 10) {
            System.out.println("yip!");
        }else if (DogWeight < 30) {
            System.out.println("Bark!");
        }else {
            System.out.println("Wooooof!");
        }

    }
}
```

```java
public class DogLauncher {
    public static void main(String[] args) {
        Dog d = new Dog(24);
        d.makeNoise();
    }
}
```



## Defining a Typical Class (Terminology)

<img src="/Users/willk/Library/Mobile Documents/com~apple~CloudDocs/course_notes/typora-images/terminology.png" style="zoom:50%;" />



## Static vs. Instance Methods

<img src="/Users/willk/Library/Mobile Documents/com~apple~CloudDocs/course_notes/typora-images/61b-static.jpeg" style="zoom:50%;" />

- 无需实例化的场景用static方法



## public static void main(String[] args)

```java
public class ArgsSum {
    public static void main(String[] args) {
        int N = args.length;
        int sum = 0;
        for (int i=0; i<N; i++){
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}
```

```shell
willk@jiangyaokuideMacBook-Pro cs61b % java ArgsSum.java 0 1 3 5
9
```



## Primitive variables are independent.

```java
Byte a = 1;

Byte b = a;

a = 2;

System.out.println(b);
```

The output is still 1



## reference variables are not independent.

```java
Point point1 = new Point(x:1, y:1);

Point point2 =point1;

point1.x = 2;

System.out.println(point2);
```

The output is changed into [x=2, y=1] simultaneously. 



## String variable is immutable. 

#### (Functions like str.replace(a,b) can only create a new string variable.

String message = “Hello World” + “!!”

message.endWith(str)/stratsWith(str) will get a boolean value. 

message.indexOf(str) / message.toLowerCase()/toUpperCase()

message.trim()

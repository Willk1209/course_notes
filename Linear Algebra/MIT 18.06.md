# Linear Algebra (MIT 18.06)

# 一、方程组的几何解释

$$
\begin{cases}
\space2x-y  &= 0 \\
-x+2y &=3
\end{cases}
$$

$$
A = \left[
\matrix{
  2 & -1\\
  -1 & 2
}
\right]
\quad
X = \left[
\matrix{
  x\\
  y
}
\right]
\quad
b = \left[
\matrix{
  0\\
  3
}
\right]
$$

### 1.concept of row picture

<img src="/Users/willk/Library/Mobile Documents/com~apple~CloudDocs/course_notes/typora-images/row pictue.png" style="zoom:50%;" />

so we get the solution is: x = 1, and y = 2

### linear combination of columns

$$
x\left[
\matrix{
  2 \\
  -1 
}
\right]
+
y\left[
\matrix{
  -1\\
  2
}
\right]

 = \left[
\matrix{
  0\\
  3
}
\right]
$$

### 2.column picture

<img src="/Users/willk/Library/Mobile Documents/com~apple~CloudDocs/course_notes/typora-images/column picture.png" style="zoom:50%;" />

Based on the knowledge of vectors ,  we get x = 1 & y =2



### think about multi-dimensions

......

# 二、矩阵消元(elimination)



* Pivot (can't be 0)

* fail condition: If we can't get n pivot.
* row exchange can solve temporary failure.



### back substitution

* then we need to process **augmented matrix**

* $$
  E_{32}(E_{21}A) = U \\
  (Associative\space law:\quad E_{32}(E_{21}A) = (E_{32}E_{21})A \space)
  $$

  

### permutation matrix

* exchange rows
  $$
  \left[
  \matrix{
    0 & 1\\
    1 & 0
  }
  \right]
  \left[
  \matrix{
    a & b\\
    c & d
  }
  \right]
  =
  \left[
  \matrix{
    c & d\\
    a & b
  }
  \right]
  $$

* Similarly, if exchange columns
  $$
  \left[
  \matrix{
    a & b\\
    c & d
  }
  \right]
  \left[
  \matrix{
    0 & 1\\
    1 & 0
  }
  \right]
  =
  \left[
  \matrix{
    b & a\\
    d & c
  }
  \right]
  $$

### inverses

$$
E^{-1}E = I
$$

(Seems like doing elimination again.)



# 三、乘法和逆矩阵

$$
AB = C \\
so, C_{34} = A_{row3}·B_{col4} = \sum a_{3k}b_{k4}\\
(A^{m*n},\space B^{n*p},\space C^{m*p})
$$

There are three perspectives to solve matrix multiplication.

1. the common way
2. linear combinations of cols
3. linear combinations of rows



### invertible, non-singular 

$$
A^{-1}A = I = AA^{-1}
$$



- Singualr case: 
  - no inverse
  - its determinant == 0
  - linear correlation
  - if a vector X can be found, which satisfies AX = O ( X can't be O)



- To get A^-1 , we can use **Guass-Jordan** method (which can calculate two equ. at once.)

  <img src="/Users/willk/Documents/Git_practice/course_notes/typora-images/Guass-Jordan.jpeg" style="zoom:50%;" />
  $$
  E(A|I) = I|A^{-1} \\
  BUT\space HOW\space CAN\space WE\space KNOW\space THAT?\\
  Due\space to\space EA = I, thus\space E = A^{-1}\\
  And\space then,\space EI = E =A^{-1}
  $$



# 四、A的LU分解

- L is a lower triangular matrix, and U is a upper triangular matrix.

- 2 by 2 :

<img src="/Users/willk/Library/Mobile Documents/com~apple~CloudDocs/course_notes/typora-images/LA-LU.jpeg" style="zoom:50%;" />

<img src="/Users/willk/Library/Mobile Documents/com~apple~CloudDocs/course_notes/typora-images/LA-LU1.jpeg" style="zoom:50%;" />

- 3 by 3 :

$$
E_{32}E_{31}E_{21}A=U\space (no\space row\space exchange)\\
A = E^{-1}_{21}E^{-1}_{31}E^{-1}_{32}U=LU\\
$$

​	example:

<img src="/Users/willk/Library/Mobile Documents/com~apple~CloudDocs/course_notes/typora-images/LA-LU2.jpeg" style="zoom:50%;" />



**meaning of LU decomposition**:

If we use Ax = b , the time complexity is O(n^3).

However, if we decompose A into LU, the time complexity will be O(n^2).



# 五、转置-置换-向量空间

​	In the previous study, we suppose that there is **no row exchange**. And finally we get the equation: **A = LU**

​	However, <u>if there exists some 0 in pivot position</u>, we need **permutations P**( = identity matrix with reordered rows). Consequently, the equation evolves: **PA = LU**.
$$
n!=n(n-1)...(3)(2)(1)
$$
counts reorderings 

counts all n*n permutations
$$
key:P^{-1}=P^{T}
$$

### Transpose:

$$
(A^{T})_{ij}=A_{ji}
$$

### Symmetric matrices:

$$
A^T = A\\for\space example:\space
\left[
\matrix{
3&1&2\\
1&5&6\\
2&6&7
}
\right]
$$

#### R'R is always symmetric:

$$
\left[
\matrix{
1&3\\
2&3\\
4&1
}
\right]
\left[
\matrix{
1&2&4\\
3&3&1\\
}
\right]
=
\left[
\matrix{
10&11&7\\
11&13&7\\
7&7&17
}
\right]
$$

WHY?
$$
To\space prove:\space (R^{T}R)^T = R^TR
$$

## Vector Spaces:

Examples: 
$$
R^2 = all\space 2-dim\space real\space vectors\\
=x-y\space pane\\
\left[
\matrix{
3\\2
}
\right]
,
\left[
\matrix{
0\\0
}
\right]
,
\left[
\matrix{
\pi\\e
}
\right]...
$$
And considering 3-dims condition......what about n-dims?

### subspaces

- **keypoint**: no matter you **Do any operations to any vector** in the subspace, the result would **never escape from this subspace**.

- lists **All subspaces of R^2**:
  - all of R^2
  - any line through [0; 0]     -> L
  - zero vector only                ->Z
- lists **All subspaces of R^3**:
  - all of R^3
  - any pane through [0; 0; 0]     -> P
  - any line through [0; 0; 0]     -> L
  - zero vector only                ->Z

![](/Users/willk/Library/Mobile Documents/com~apple~CloudDocs/course_notes/typora-images/LA-subspaces.png)

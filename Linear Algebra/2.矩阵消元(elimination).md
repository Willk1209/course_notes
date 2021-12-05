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



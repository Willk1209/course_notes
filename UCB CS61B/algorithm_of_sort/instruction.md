# Chapter 3 - [Testing and selection sort](https://joshhug.gitbooks.io/hug61b/content/chap3/chap31.html):
In the chapter, I learned some more **efficient ways to debug** and write a algorithm of **selection sort**.

## 1.Debugging:

- There is an interesting way to learn programming: **Test Driven Development**. That is, before we start to write programs, we can **write their test programs first**. 
- Consequantly, we can <u>regard passing the tests as passing the games</u>. **Dividing** a huge test **into** some **small parts** may save our time and bring us more impetus.
- Writing tests through general way can be time-comsuming. We can **use JUnit** to help us:
  - Using **@Test** before each small test function can help us to test mutilple function at once, even if some function tests fail.
  - As we use <u>import org.junit.Assert.*</u> at very first, we can directly use **assertEquals(obj1, obj2)** to check whether two objects are the same.
  - ! remember to **add junit to the external libraries of your project.**

## 2.Selection sort

We can divide this algorithm into three main steps:

- Find the smallest element in the given array.
- Swap its position with the begin element's.
- Use iterative or recursive to exclude the element we have processed and process the rest.

## 3.Details

See .java file (can not compile and run directly! some libraries(junit) needs to be added)

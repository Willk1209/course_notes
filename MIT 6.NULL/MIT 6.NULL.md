# MIT 6.NULL

## Lecture1 ： The shell

```shell
willk@jiangyaokuideMacBook-Pro ~ % date
2021年11月16日 星期二 01时15分50秒 CST
```

```shell
willk@jiangyaokuideMacBook-Pro ~ % echo Hello\ World
Hello World
```

* Show all the paths on the machine that the shell will search for programs

```shell
willk@jiangyaokuideMacBook-Pro ~ % echo $PATH
/opt/homebrew/sbin:/opt/homebrew/bin:/Users/willk/anaconda3/bin:/Users/willk/opt/anaconda3/bin:/Library/Frameworks/Python.framework/Versions/3.7/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin
```

* **pwd** : present working directory

  ```shell
  willk@jiangyaokuideMacBook-Pro ~ % pwd
  /Users/willk
  ```

  ```shell
  willk@jiangyaokuideMacBook-Pro create % echo "We are in $(pwd)"
  We are in /Users/willk/Downloads/shell_practices/create
  ```

  

* **cd** : change directory

* **cd -** : go back to the directory working before

* **.** : current directory

* **..** : parent directory

* **ls** : show the list of files in current directory

  ```shell
  willk@jiangyaokuideMacBook-Pro Desktop % ls *.docx
  ~$3 安全责任书.docx
  ~$a测5-8.docx
  ~$电工2016-2020.docx
  ```

  We can filter the file, which ends up with ".docx".

  - We can use **"ls -ah"** to see hidden files or directories.

* **mv** : rename the file

  ```shell
  mv oldname.png newname.png
  ```

* **cp** : copy the file

  ```shell
  cp copyfrom.jpg copyto.jpg
  ```

* **mkdir **:create a new directory

  ```shell
  mkdir "directory name"
  ```

  

* control + l : clear the terminal

* **rm** : can delete file or dir.

* **man**: like --help

  ```shell
  man ls
  ```

* **\>** : output stream

  ```shell
  willk@jiangyaokuideMacBook-Pro shell_practices % echo HELLO! > hello.txt
  ```

  this command write "HELLO!" into a new created file "hello.txt"

* **cat** : can show the content in the file (serve as input stream)

  ```shell
  willk@jiangyaokuideMacBook-Pro shell_practices % cat hello.txt 
  HELLO!
  ```

  ```shell
  willk@jiangyaokuideMacBook-Pro shell_practices % cat <hello.txt > hello2.txt
  willk@jiangyaokuideMacBook-Pro shell_practices % cat hello2.txt 
  HELLO!
  ```

* **｜** ：pipe can read from input, and write to output



## Lecure2: Shell tools and Scripting

* define string

  ```shell
  willk@jiangyaokuideMacBook-Pro ~ % str=bar
  willk@jiangyaokuideMacBook-Pro ~ % echo $str
  bar
  ```

* the difference between "" and ''

  ```shell
  willk@jiangyaokuideMacBook-Pro ~ % echo "the string is $str"
  the string is bar
  willk@jiangyaokuideMacBook-Pro ~ % echo 'the string is $str'
  the string is $str
  ```

* $_ : The last parameter of the previous command

  ```shell
  willk@jiangyaokuideMacBook-Pro shell_practices % mkdir create
  willk@jiangyaokuideMacBook-Pro shell_practices % cd $_
  willk@jiangyaokuideMacBook-Pro create % 
  ```

* {1,2,...,n} mkdir & touch

  ```shell
  willk@jiangyaokuideMacBook-Pro shell_practices % mkdir dir{1,2}
  willk@jiangyaokuideMacBook-Pro shell_practices % touch dir{1,2}/file{1,2}.txt 
  ```

  

* **find** 

  ```shell
  willk@jiangyaokuideMacBook-Pro shell_practices % find . -path '**/*.txt' -type f
  ./dir2/file2.txt
  ./dir2/file1.txt
  ./dir1/file2.txt
  ./dir1/file1.txt
  ./hello2.txt
  ./hello.txt
  ```

  ```shell
  willk@jiangyaokuideMacBook-Pro shell_practices % find . -name 'dir*' -type d
  ./dir2
  ./dir1
  ```

* **find and then delete(or other commands)**

  ```shell
  willk@jiangyaokuideMacBook-Pro shell_practices % find . -path '**/*.txt' -type f -exec rm {} \;
  ```

  

* grep command

  I'm confused. [Check the document about grep](https://www.runoob.com/linux/linux-comm-grep.html) to get a deeper understanding.



## Lecture 3 : Editors(vim)

### normal mode

1. **insert mode**：i
2. **replace** ： R
3. **visual** : v
4. **selection** :
   1. **line** : shift-v
   2. **block** : control-v
5. **command line** : \:
6. **help func.** :        :help  ...
7. **movement command** : hjkl wb e gg $
8. 1. **d** is the key for deleting, it needs to combine with movement command. e.g. : dw: delete a word.
   2. if you're using **c** key, except for deleting, u will enter insert mode.
   3. **u** means undo command. **y** stands for copying and **p** stands for pasting
   4. move the cursor to the end of the later three words : **3e** .                            Similarly, if I want to delete two words : **d2w**.



## Lecture 4 : Data Wrangling

I'll skip it !



## Lecture 5 : Command-line Environment


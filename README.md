# Listing_4_16_project 


We are working on Listing 4.16.

## Introduction:

We want to write a program that displays a random uppercase letter using the Math.random() method.

## Outline:

1. Set up a new Java project called Listing_4_16_Project
2. Set up a git repository, and go to the test branch.
3. Play around with some code using methods to get something that works.
4. Merge working code into the Dev branch.
5. Tidy up the read me file

## references:
``` java
Math.random()
```
Page 87 of the text: *Generating Random Numbers*
Page 122 of the text: *4.2.5 The random Method*
http://stackoverflow.com/questions/7961788/math-random-explained
http://examples.javacodegeeks.com/core-java/math/java-math-random-example/
http://www.tutorialspoint.com/java/lang/math_random.htm

``` java
char
```
Page 125 of the text: *Character Data Type and Operations
Table 4.4 on page 125: ASCII Code for Commonly Used Characters
Characters
``` java
Characters ('A' to 'Z')
Code Value in Decimal (65 to 90)
Unicode Value (\u0041 to \u005A)
```
Page 127 of the text: *Casting between char and Numeric Types*

## Java Code

## Console Output

## Command Prompt History

1. See where I am. Note that this is in the project file I want to be in and that I can see the src and bin folders.

```
J:\COMSC_1033_Workspace\Listing_4_16_project>dir
 Volume in drive J has no label.
 Volume Serial Number is CF21-6DC3

 Directory of J:\COMSC_1033_Workspace\Listing_4_16_project

11/01/2015  03:34 PM    <DIR>          .
11/01/2015  03:34 PM    <DIR>          ..
11/01/2015  03:34 PM               396 .project
11/01/2015  03:34 PM    <DIR>          src
11/01/2015  03:34 PM    <DIR>          bin
11/01/2015  03:34 PM               232 .classpath
               2 File(s)            628 bytes
               4 Dir(s)   8,062,451,712 bytes free
```

2. Now I echo a readme file. This is where I keep track of all my progress.
```
J:\COMSC_1033_Workspace\Listing_4_16_project>echo # Listing_4_16_project >> README.md
```

3. Next I go through the process to set up my repository.
```
J:\COMSC_1033_Workspace\Listing_4_16_project>git init
Initialized empty Git repository in J:/COMSC_1033_Workspace/Listing_4_16_project/.git/
```
4. Once I have set up something, I have to start adding my files.
J:\COMSC_1033_Workspace\Listing_4_16_project>git add .
```
5. Before I can commit my add, I need to tell the machine who I am.
```
J:\COMSC_1033_Workspace\Listing_4_16_project>git config user.name "Jeremy Evert"

J:\COMSC_1033_Workspace\Listing_4_16_project>git config user.email "jeremy.evert@swosu.edu"
```
6. Now I make my first commit.
```
J:\COMSC_1033_Workspace\Listing_4_16_project>git commit -m "First commit."
[master (root-commit) a1c2d56] First commit.
 5 files changed, 83 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 README.md
 create mode 100644 bin/Listing_4_16.class
 create mode 100644 src/Listing_4_16.java
```
7. Now I tie the connection to my remote repository.
```
J:\COMSC_1033_Workspace\Listing_4_16_project>git remote add origin https://github.com/jeremy-evert/Listing_4_16_project.git
```
8. Next I tell the remote to keep track of what I am doing here.
```
J:\COMSC_1033_Workspace\Listing_4_16_project>git push -u origin master
Username for 'https://github.com': jeremy.evert@swosu.edu
Password for 'https://jeremy.evert@swosu.edu@github.com':
Counting objects: 9, done.
Delta compression using up to 8 threads.
Compressing objects: 100% (7/7), done.
Writing objects: 100% (9/9), 1.80 KiB | 0 bytes/s, done.
Total 9 (delta 0), reused 0 (delta 0)
To https://github.com/jeremy-evert/Listing_4_16_project.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.
```
9. And that is a good feeling.  Now we make a new brach called dev.
```
J:\COMSC_1033_Workspace\Listing_4_16_project>git checkout -b dev
Switched to a new branch 'dev'
```
10. And we set the upstream to track the local.
```
J:\COMSC_1033_Workspace\Listing_4_16_project>git push -u origin dev
Username for 'https://github.com': jeremy.evert@swosu.edu
Password for 'https://jeremy.evert@swosu.edu@github.com':
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/jeremy-evert/Listing_4_16_project.git
 * [new branch]      dev -> dev
Branch dev set up to track remote branch dev from origin.
```
11. And we do the same process again to set up the test branch.
```
J:\COMSC_1033_Workspace\Listing_4_16_project>git checkout -b test
Switched to a new branch 'test'

J:\COMSC_1033_Workspace\Listing_4_16_project>git push -u origin test
Username for 'https://github.com': jeremy.evert@swosu.edu
Password for 'https://jeremy.evert@swosu.edu@github.com':
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/jeremy-evert/Listing_4_16_project.git
 * [new branch]      test -> test
Branch test set up to track remote branch test from origin.

J:\COMSC_1033_Workspace\Listing_4_16_project>
```

Now we go make some sweet code.

## Report Summary


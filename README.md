# Listing_4_16_project 


We are working on Listing 4.16.

## Introduction:

We want to write a program that displays a random uppercase letter using the Math.random() method.

## Outline:

1. Set up a new Java project called Listing_4_16_Project
2. Set up a git repository, and go to the test branch.
3. Play around with some code using methods to get something that works.
``` java
	// Call a method to generate a random number in the range of a character.
	// Make the number into a char
	// print the number
```
4. Merge working code into the Dev branch.
5. Tidy up the read me file

## references:
``` java
Math.random()
```
Page 87 of the text: *Generating Random Numbers*
Page 87 has a good example of how to use the random. The thing to remember is that you must keep the method call inside the parentases with the multiplider such as (Math.random() * 10).
Page 122 of the text: *4.2.5 The random Method*
```java
a + (int)Math.random()*b
```
Returns a random number between *a* and *a+b* excluding *a+b*.
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

``` java
public class Listing_4_16 {
	public static void main(String[] args) {
		// Call a method to generate a random number in the range of a character.
		int randomUpperCaseLetterNumber = makeRandomUpperLetter();

		// Note that (char) in front of our variable recasts it as 
		System.out.println("The random upper case letter of the day is: " + (char)randomUpperCaseLetterNumber);
	}
	public static int makeRandomUpperLetter(){
		// Range of Character values, page 125, table 4.4
		//Characters ('A' to 'Z'), Code Value in Decimal (65 to 90)
		
		// How to use a random number Page 122, bottom of the page, 4.2.5 The random Method
		// Also use the example on page 87.
		
		int lowerLimit = 65;
		int upperLimit = 90;
		int Range = upperLimit-lowerLimit + 1;
		int randomUpperCaseLetterNumber = lowerLimit + (int)(Math.random()*Range);
		System.out.println(randomUpperCaseLetterNumber);
		return randomUpperCaseLetterNumber;
	}
}
```

## Console Output

I tested several cases to verify that my random number range would cover the range of all possible upper case letters.

```

65
The random upper case letter of the day is: A

69
The random upper case letter of the day is: E


80
The random upper case letter of the day is: P

81
The random upper case letter of the day is: Q

90
The random upper case letter of the day is: Z
```

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

12. Now we go make some sweet code.

### Merge my test branch back into my dev branch
Now that I have code written that works, I want to merge my test branch into my dev branch.

1. See what branches are availible.
```
J:\COMSC_1033_Workspace\Listing_4_16_project>git branch
  dev
  master
* test
```

2. try to checkout my next branch.
```
J:\COMSC_1033_Workspace\Listing_4_16_project>git checkout dev
error: Your local changes to the following files would be overwritten by checkout:
        README.md
Please, commit your changes or stash them before you can switch branches.
Aborting
```
It stoped me because I did not add in my files.
I saved all my files, then added things in, commited, and pushed.
```
J:\COMSC_1033_Workspace\Listing_4_16_project>git add .

J:\COMSC_1033_Workspace\Listing_4_16_project>git commit -m "Updating readme.md file."
[test eb614a6] Updating readme.md file.
 3 files changed, 40 insertions(+), 8 deletions(-)
 rewrite bin/Listing_4_16.class (77%)

J:\COMSC_1033_Workspace\Listing_4_16_project>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': jeremy.evert@swosu.edu
Password for 'https://jeremy.evert@swosu.edu@github.com':
Counting objects: 7, done.
Delta compression using up to 8 threads.
Compressing objects: 100% (5/5), done.
Writing objects: 100% (7/7), 1.98 KiB | 0 bytes/s, done.
Total 7 (delta 1), reused 0 (delta 0)
To https://github.com/jeremy-evert/Listing_4_16_project.git
   04a77c9..eb614a6  test -> test
```
Now we see which branches we have again.
```
J:\COMSC_1033_Workspace\Listing_4_16_project>git branch
  dev
  master
* test
```
We checkout the branch we want to be on.
```
J:\COMSC_1033_Workspace\Listing_4_16_project>git checkout dev
Switched to branch 'dev'
Your branch is up-to-date with 'origin/dev'.
```
3. We merge in the changes.
```
J:\COMSC_1033_Workspace\Listing_4_16_project>git merge test
Updating a1c2d56..eb614a6
Fast-forward
 README.md              | 113 +++++++++++++++++++++++++++++++++++++++++++++++++
 bin/Listing_4_16.class | Bin 379 -> 1041 bytes
 src/Listing_4_16.java  |  33 ++++++++++++---
 3 files changed, 139 insertions(+), 7 deletions(-)
```
4. We push these changes to the remote.
```
J:\COMSC_1033_Workspace\Listing_4_16_project>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': jeremy.evert@swosu.edu
Password for 'https://jeremy.evert@swosu.edu@github.com':
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/jeremy-evert/Listing_4_16_project.git
   a1c2d56..eb614a6  dev -> dev

J:\COMSC_1033_Workspace\Listing_4_16_project>
```
Sweet success. But lets tidy these up a little bit first.
...
Now that my code is tidy and my readme file is updated, lets push everything up.

```
J:\COMSC_1033_Workspace\Listing_4_16_project>git add .

J:\COMSC_1033_Workspace\Listing_4_16_project>git commit -m "Tidy up code and update readme file."
[dev 69c4a98] Tidy up code and update readme file.
 3 files changed, 167 insertions(+), 13 deletions(-)

J:\COMSC_1033_Workspace\Listing_4_16_project>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)
```
In the process I fat fingered a push password.
```
Username for 'https://github.com': jeremy.evert@swosu.edu
Password for 'https://jeremy.evert@swu@github.com':
remote: Invalid username or password.
fatal: Authentication failed for 'https://github.com/jeremy-evert/Listing_4_16_project.git/'
```
try again.
```
J:\COMSC_1033_Workspace\Listing_4_16_project>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': jeremy.evert@swosu.edu
Password for 'https://jeremy.evert@swosu.edu@github.com':
Counting objects: 7, done.
Delta compression using up to 8 threads.
Compressing objects: 100% (5/5), done.
Writing objects: 100% (7/7), 2.44 KiB | 0 bytes/s, done.
Total 7 (delta 3), reused 0 (delta 0)
To https://github.com/jeremy-evert/Listing_4_16_project.git
   eb614a6..69c4a98  dev -> dev

J:\COMSC_1033_Workspace\Listing_4_16_project>
```
and now we are ready to update the master branch (and update the test branch as well.)


## Report Summary


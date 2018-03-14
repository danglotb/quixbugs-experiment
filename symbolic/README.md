# Symbolic/Concolic Execution with CATG/JANALA

**CATG** runs only on a main method and can symbolize only literals and String. It also requires specific statement to mark variable that you want to symbolize.

To do so, one uses `read` methods from `catg.CATG` object.

For instance:

```java
int myInteger = 23;
```

must be instrumented like this:

```java
int myInteger = catg.CATG.readInt(23);
```

## Execution

The project is organized as follow:

The folder `lib` contains required jars to execute **CATG**.

The folder quixbugs contains a `src` folder with two packages:

1. `correct_java_programs` which are correct version of classes from **QuixBugs**.
2. `patched_java_programs` which are patched version of classes from **QuixBugs**.

### Compiling

The provided script `compile.sh` allow to compile both correct and patch versions of classes in a newly create folder `quixbugs/bin`.

Run:
```
./compile.sh
```

### Concolic Execution

The provided python script `concolic.py` allows to execute **CATG**.

```sh
Usage: python concolic.py <classpath> <full.qualified.name> <nbIteration>
```

where:

1. `<classpath>` is the needed _*.class_ / _*.jar_ needed to execute the class.
2. `<full.qualified.name>` the full qualified of the desired class, _e.g._ correct_java_programs.FIND_IN_SORTED
3. `<nbIteration>` the number of times that **CATG** will be apply.

### Output

The output is a series of file, named `ìnputXX`, where `XX` is the number of the iterations. Inside this file, there are all the values assigned to symbol (declared with the method call to `catg.CATG.readXX()`, in the same order). These files are inside the created folder `catg_tmp`.
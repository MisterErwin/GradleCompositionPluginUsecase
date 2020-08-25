* depend: A dependency
* depend2: A newer version of the same dependency
* plugin: A plugin using the older dependency version
* use: A project, which uses both the plugin and newer version of the dependency

```bash
cd depend 
./gradlew publishToMavenLocal
cd ../plugin
./gradlew publishToMavenLocal
cd ../use
```

Running the plugin now looks like the following

```bash
$ ./gradlew run
> Task :abc
I am version 1.0
jar:file:/C:/Users/user/.gradle/caches/jars-3/f9c7fb0d8677531453b3abe67b4a307f/Depend-1.0-SNAPSHOT.jar!/depend.info
Total: 1
```

```bash
$ ./gradlew --include-build ../depend2  run
> Task :abc
I am version 2.0
jar:file:/C:/Users/user/.gradle/caches/jars-3/b1c351c306467e1d6fc52cca3a8e8e93/Depend-2.0-SNAPSHOT.jar!/depend.info
Total: 1
```


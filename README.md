# API dependency

### Maven dependency
```xml

    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>com.github.bkkuc01</groupId>
            <artifactId>RustBlockHealthAPI</artifactId>
            <version>1.3</version>
        </dependency>
    </dependencies>

```

### Gradle dependency
```groovy
repositories {
    mavenCentral()
    maven {
        name = "jitpack.io"
        url = "https://jitpack.io/"
    }
}

dependencies {
    compileOnly "com.github.bkkuc01:RustBlockHealthAPI:1.3"
}
```

### plugin.yml dependency
```YAML
depend: [RustBlockHealth]
```

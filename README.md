# surefire-problem

User property [forkCount](https://maven.apache.org/surefire/maven-surefire-plugin/test-mojo.html#forkCount) does not override the configuration in the pom.

## reproduce

`forkCount` in the pom is 4. The following command still runs tests in parallel.

```bash
./mvnw -DforkCount=1 test
```

Changing the `forkCount` configuration in the pom to 1 runs the tests sequentially.

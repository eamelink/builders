Dev-time safety for builders
===

[Immutables](https://immutables.github.io) has _staged builders_, builders that provide additional compile-time safety by introducing an interface for each build step. This causes compilation failures if you miss a required field.

A downside is that it generates all these extra interfaces; so extra bytecode in your app.

This project demonstrates how you can develop with staged builders, but turn it off in a `prod` Maven profile.

This project uses a builder, but misses one field, and should:

- Fail to compile without a profile (Try `mvn clean test`), demonstrating a compile-time error.
- Succeed to  compile with the 'prod' profile (Try `mvn clean test -Pprod`), but fail at runtime.

With staged builders, these classes are generated:

```bash
-rw-r--r--  1 eamelink  staff   553 Oct 22 21:29 ImmutableMyClass$BarBuildStage.class
-rw-r--r--  1 eamelink  staff   443 Oct 22 21:29 ImmutableMyClass$BuildFinal.class
-rw-r--r--  1 eamelink  staff  3708 Oct 22 21:29 ImmutableMyClass$Builder.class
-rw-r--r--  1 eamelink  staff   561 Oct 22 21:29 ImmutableMyClass$FooBuildStage.class
-rw-r--r--  1 eamelink  staff  3551 Oct 22 21:29 ImmutableMyClass.class
```

And without staged builders, these classes are generated:

```bash
-rw-r--r--  1 eamelink  staff  2881 Oct 22 21:30 ImmutableMyClass$Builder.class
-rw-r--r--  1 eamelink  staff  3189 Oct 22 21:30 ImmutableMyClass.class
```

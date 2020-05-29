
`sbt update` runs fine.

No issue with the coursier CLI either:
```text
$ cs resolve --scala 2.12 \
    com.github.alexarchambault::argonaut-shapeless_6.2:1.2.0 \
    com.chuusai::shapeless:2.3.2 \
    --reconciliation com.chuusai::shapeless:strict \
    -V com.chuusai::shapeless:2.3.3
com.chuusai:shapeless_2.12:2.3.3:default
com.github.alexarchambault:argonaut-shapeless_6.2_2.12:1.2.0:default
io.argonaut:argonaut_2.12:6.2.5:default
org.scala-lang:scala-library:2.12.11:default
org.scala-lang:scala-reflect:2.12.11:default
org.typelevel:macro-compat_2.12:1.1.1:default

$ cs resolve --scala 2.12 \
    com.github.alexarchambault::argonaut-shapeless_6.2:1.2.0 \
    com.chuusai::shapeless:2.3.2 \
    --reconciliation com.chuusai::shapeless:strict
Resolution error: Rule Strict(Set(ModuleMatcher(com.chuusai:shapeless_2.12)), Set(ModuleMatcher(*:*)), true, true, false) not satisfied: coursier.params.rule.Strict$EvictedDependencies: Unsatisfied rule Strict(com.chuusai:shapeless_2.12, exclude=*:*, ignoreIfForcedVersion=true): Found evicted dependencies:

com.chuusai:shapeless_2.12:2.3.3 (2.3.2 wanted)
└─ com.chuusai:shapeless_2.12:2.3.2 wants com.chuusai:shapeless_2.12:2.3.2
```

sandbox-snmp4osgi
=================

This is only a simple (non-functional) maven project to show how to compile
against ServiceMix' version of snmp4j bundle in an OSGi environment.

<pre>
compiletest
|
│   .gitignore
│   pom.xml
├───src
│   ├───main
│   │   └───java
│   │       └───net
│   │           └───eckenfels
│   │               └───test
│   │                   └───snmp4osgi
│   │                       └───compiletest
│   │                               Main.java
│   │
│   └───test
└───target
    │   compiletest-0.1.0-SNAPSHOT.jar
</pre>

This is using [Apache Felix maven-bundle-plugin](http://felix.apache.org/site/apache-felix-maven-bundle-plugin-bnd.html)
to manage the manifest entries (and not the Bnd-Tools [bnd-maven-plugin](https://github.com/bndtools/bnd/tree/master/bnd-maven-plugin-parent)).

Using `mvn clean verify` creates a `target/compiletest-0.1.0-SNAPSHOT.jar` with the following manifest:

    Manifest-Version: 1.0
    Bnd-LastModified: 1410814947739
    Build-Jdk: 1.8.0_11
    Built-By: Eckenfel
    Bundle-Description: Just a dummy to test compile with snmp4j bundle.
    Bundle-ManifestVersion: 2
    Bundle-Name: net.eckenfels.test.snmp4osgi :: compiletest
    Bundle-SymbolicName: net.eckenfels.test.snmp4osgi.compiletest
    Bundle-Version: 0.1.0.SNAPSHOT
    Created-By: Apache Maven Bundle Plugin
    Export-Package: net.eckenfels.test.snmp4osgi.compiletest;version="0.1.0.
     SNAPSHOT"
    Import-Package: org.snmp4j;resolution:=optional;version="[2.3,3)"
    Tool: Bnd-2.1.0.20130426-122213

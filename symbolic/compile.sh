#!/usr/bin/env bash

rm -rf quixbugs/bin 2>/dev/null
mkdir quixbugs/bin 2>/dev/null
javac -cp lib/janala2-gradle-0.2.jar quixbugs/src/*/*.java -d quixbugs/bin
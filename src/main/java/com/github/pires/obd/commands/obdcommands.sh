#!/bin/sh

# W zadanym drzewie katalogów znaleźć 5
# najczęściej występujących nazw plików regularnych

gfind $1 -type f -name "*ObdCommand.java" -printf "%f\n" | (
  while read c f
  do
    d=${c%%.*};
    echo "testObdcommand(new $d());"
  done
)

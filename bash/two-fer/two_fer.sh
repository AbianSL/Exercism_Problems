#!/usr/bin/env bash

main() {
  variable=$@
  if [ "$variable" == "" ]; then
    variable="you"
  fi
  echo "One for ${variable}, one for me."
}

main "${@:1}" 

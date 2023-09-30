#!/usr/bin/env bash

main() {
  variable=$1
  if [ "$variable" == "" ]; then
    variable="you"
  fi
  echo "One for ${variable}, one for me."
}

main

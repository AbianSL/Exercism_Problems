#!/usr/bin/env bash

main() {
  variable=$1
  echo "One for ${variable:-you}, one for me."
}

main

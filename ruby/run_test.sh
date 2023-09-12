if [ "$2" = "--debug" ] || [ "$2" = "-d" ]; then
  ruby -r minitest/pride $1 -v
else
  ruby -r minitest/pride $1
fi

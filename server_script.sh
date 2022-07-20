#!/bin/bash

TESTDIR=test

if [ ! -d "$TESTDIR" ]; then
  mkdir $TESTDIR
else
  rm -rf test/*jar*
fi


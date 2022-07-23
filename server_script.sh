#!/bin/bash

TESTDIR=test

if test ! -d "$TESTDIR" ; then
  mkdir $TESTDIR
else
  rm -rf test/*jar*
fi


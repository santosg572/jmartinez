#!/bin/bash

dir=$(ls -1 | grep Suj)

for fil in $dir
do
  echo $fil
  ls -1 $fil/tmp_dcm2bids/helper
done



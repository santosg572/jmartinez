#!/bin/bash

#suj=(1197 300077 337 341 344 348 351 354 387 391 397 538 586 592 300076 336 340 343 346 349 353 356 388 394 537 549 591 593)  

suj=(549 591 593)

for ss in "${suj[@]}"
do
  echo $ss
  file="Suj_"$ss
  mkdir $file
  cd ./$file
  dcm2bids_scaffold
  mv ../$ss ./sourcedata/.
  dcm2bids_helper -d sourcedata/
  ls ./tmp_dcm2bids/helper
  cd ..
done



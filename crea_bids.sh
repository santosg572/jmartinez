#!/bin/bash

id=$1			# numero de sujeto
num=$2			# secuencia de creacion

pat="./"

cp dcm2bids_config.json $pat/"Suj_"${id}/code/.

cd $pat/"Suj_"${id}

dcm2bids -d sourcedata/${id}/ -p ${num} -c code/dcm2bids_config.json --auto_extract_entities



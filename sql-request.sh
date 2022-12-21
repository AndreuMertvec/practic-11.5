#!/bin/bash

mysql --user rfamro --host mysql-rfam-public.ebi.ac.uk --port 4497 --database Rfam -e 'select * from genome limit 2;'

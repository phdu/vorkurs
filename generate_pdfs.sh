#!/bin/bash
for i in {1..4}; 
do 
	cd Tag_$i; 
	pdflatex Vorkurs_Tag$i.tex &
	cd .. ;
done
